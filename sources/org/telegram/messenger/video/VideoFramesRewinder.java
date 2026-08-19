package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.AnimatedFileNative;

public class VideoFramesRewinder {
    private Frame currentFrame;
    private boolean destroyAfterPrepare;
    int h;
    private boolean isPreparing;
    private long lastSeek;
    private AnimatedFileNative mDecoder;
    private int maxFrameSide;
    private int maxFramesCount;
    private View parentView;
    private long prepareToMs;
    private float prepareWithSpeed;
    int w;
    private final Paint paint = new Paint(2);
    private final int[] meta = new int[8];
    private final ArrayList<Frame> freeFrames = new ArrayList<>();
    private final TreeSet<Frame> frames = new TreeSet<>(new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            return VideoFramesRewinder.$r8$lambda$Gp5VzuvDbaeLquWZKjlA_BCZs5Q((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
        }
    });
    private AtomicBoolean stop = new AtomicBoolean(false);
    private AtomicLong until = new AtomicLong(0);
    private float lastSpeed = 1.0f;
    private Runnable prepareRunnable = new Runnable() {
        @Override
        public final void run() {
            VideoFramesRewinder.$r8$lambda$bvA2FqZic6EBa6TWfLMCKCnBDcY(this.f$0);
        }
    };

    public VideoFramesRewinder() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            this.maxFramesCount = 200;
            this.maxFrameSide = 580;
        } else if (devicePerformanceClass == 2) {
            this.maxFramesCount = 400;
            this.maxFrameSide = 720;
        } else {
            this.maxFramesCount = 100;
            this.maxFrameSide = 480;
        }
    }

    public void draw(Canvas canvas, int i, int i2) {
        this.w = i;
        this.h = i2;
        if (this.mDecoder == null || this.currentFrame == null) {
            return;
        }
        canvas.save();
        canvas.scale(i / this.currentFrame.bitmap.getWidth(), i2 / this.currentFrame.bitmap.getHeight());
        canvas.drawBitmap(this.currentFrame.bitmap, 0.0f, 0.0f, this.paint);
        canvas.restore();
    }

    public boolean isReady() {
        return this.mDecoder != null;
    }

    public void setup(File file) {
        if (file == null) {
            release();
        } else {
            this.stop.set(false);
            this.mDecoder = AnimatedFileNative.createDecoderFrom(file.getAbsolutePath(), this.meta, UserConfig.selectedAccount, 0L, null, true);
        }
    }

    public static int $r8$lambda$Gp5VzuvDbaeLquWZKjlA_BCZs5Q(Frame frame, Frame frame2) {
        return (int) (frame.position - frame2.position);
    }

    class Frame {
        Bitmap bitmap;
        long position;

        private Frame() {
        }
    }

    public static void $r8$lambda$bvA2FqZic6EBa6TWfLMCKCnBDcY(final VideoFramesRewinder videoFramesRewinder) {
        Frame frame;
        int i;
        int i2;
        int i3;
        videoFramesRewinder.getClass();
        final ArrayList arrayList = new ArrayList();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        int[] iArr = videoFramesRewinder.meta;
        int i4 = iArr[4];
        int i5 = 0;
        int iMin = Math.min(videoFramesRewinder.w / 4, iArr[0]);
        int iMin2 = Math.min(videoFramesRewinder.h / 4, videoFramesRewinder.meta[1]);
        int i6 = videoFramesRewinder.maxFrameSide;
        if (iMin > i6 || iMin2 > i6) {
            float fMax = i6 / Math.max(iMin, iMin2);
            iMin = (int) (iMin * fMax);
            iMin2 = (int) (iMin2 * fMax);
        }
        videoFramesRewinder.mDecoder.seekToMs(videoFramesRewinder.prepareToMs - ((long) (videoFramesRewinder.prepareWithSpeed * 350.0f)), false);
        long j = videoFramesRewinder.meta[3];
        int i7 = 0;
        int i8 = 0;
        for (char c = 3; videoFramesRewinder.meta[c] <= videoFramesRewinder.until.get() && i7 < videoFramesRewinder.maxFramesCount && !videoFramesRewinder.stop.get(); c = 3) {
            float f = 1000.0f / i4;
            long j2 = j;
            long j3 = (long) (j + (videoFramesRewinder.prepareWithSpeed * f));
            if (!videoFramesRewinder.freeFrames.isEmpty()) {
                frame = videoFramesRewinder.freeFrames.remove(i5);
            } else {
                frame = new Frame();
            }
            Bitmap bitmap = frame.bitmap;
            if (bitmap == null || bitmap.getWidth() != iMin || frame.bitmap.getHeight() != iMin2) {
                AndroidUtilities.recycleBitmap(frame.bitmap);
                try {
                    frame.bitmap = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                    while (true) {
                        i = i7;
                        i2 = i4;
                        i3 = iMin2;
                        if (((long) videoFramesRewinder.meta[3]) + ((long) Math.ceil(f)) < j3) {
                            break;
                        }
                        videoFramesRewinder.mDecoder.getVideoFrame(null, true, 0.0f, videoFramesRewinder.meta[4], false);
                        i4 = i2;
                        i7 = i;
                        iMin2 = i3;
                    }
                    if (videoFramesRewinder.mDecoder.getVideoFrame(frame.bitmap, true, 0.0f, videoFramesRewinder.meta[4], false) == 0) {
                        i8++;
                        if (i8 > 6) {
                            break;
                        }
                    } else {
                        long j4 = videoFramesRewinder.meta[3];
                        frame.position = j4;
                        arrayList.add(frame);
                        j2 = j4;
                    }
                    i7 = i + 1;
                    i4 = i2;
                    j = j2;
                    iMin2 = i3;
                    i5 = 0;
                } catch (OutOfMemoryError unused) {
                    FileLog.d("[VideoFramesRewinder] failed to create bitmap: out of memory");
                }
            } else {
                while (true) {
                    i = i7;
                    i2 = i4;
                    i3 = iMin2;
                    if (((long) videoFramesRewinder.meta[3]) + ((long) Math.ceil(f)) < j3) {
                        break;
                        break;
                    }
                    videoFramesRewinder.mDecoder.getVideoFrame(null, true, 0.0f, videoFramesRewinder.meta[4], false);
                    i4 = i2;
                    i7 = i;
                    iMin2 = i3;
                }
                if (videoFramesRewinder.mDecoder.getVideoFrame(frame.bitmap, true, 0.0f, videoFramesRewinder.meta[4], false) == 0) {
                    i8++;
                    if (i8 > 6) {
                        break;
                        break;
                    }
                } else {
                    long j5 = videoFramesRewinder.meta[3];
                    frame.position = j5;
                    arrayList.add(frame);
                    j2 = j5;
                }
                i7 = i + 1;
                i4 = i2;
                j = j2;
                iMin2 = i3;
                i5 = 0;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VideoFramesRewinder.$r8$lambda$gsXQuVCSPGa8HapsEQavJGKCFkA(this.f$0, arrayList, jCurrentTimeMillis);
            }
        });
    }

    public static void $r8$lambda$gsXQuVCSPGa8HapsEQavJGKCFkA(VideoFramesRewinder videoFramesRewinder, ArrayList arrayList, long j) {
        videoFramesRewinder.getClass();
        FileLog.d("[VideoFramesRewinder] total prepare of " + arrayList.size() + " took " + (System.currentTimeMillis() - j) + "ms");
        if (!arrayList.isEmpty()) {
            FileLog.d("[VideoFramesRewinder] prepared from " + ((Frame) arrayList.get(0)).position + "ms to " + ((Frame) arrayList.get(arrayList.size() - 1)).position + "ms (requested up to " + videoFramesRewinder.prepareToMs + "ms)");
        }
        videoFramesRewinder.isPreparing = false;
        Iterator<Frame> it = videoFramesRewinder.frames.iterator();
        while (it.hasNext()) {
            Frame next = it.next();
            if (videoFramesRewinder.currentFrame != next && next.position > videoFramesRewinder.lastSeek) {
                if (videoFramesRewinder.freeFrames.size() > 20) {
                    AndroidUtilities.recycleBitmap(next.bitmap);
                } else {
                    videoFramesRewinder.freeFrames.add(next);
                }
                it.remove();
            }
        }
        while (!arrayList.isEmpty() && videoFramesRewinder.frames.size() < videoFramesRewinder.maxFramesCount) {
            videoFramesRewinder.frames.add((Frame) arrayList.remove(arrayList.size() - 1));
        }
        if (arrayList.size() > 0) {
            FileLog.d("[VideoFramesRewinder] prepared " + arrayList.size() + " more frames than I could fit :(");
        }
        if (videoFramesRewinder.destroyAfterPrepare) {
            videoFramesRewinder.release();
            videoFramesRewinder.stop.set(false);
        }
    }

    private void prepare(long j) {
        if (this.isPreparing) {
            return;
        }
        FileLog.d("[VideoFramesRewinder] starting preparing " + j + "ms");
        this.isPreparing = true;
        this.prepareToMs = j;
        this.prepareWithSpeed = this.lastSpeed;
        Utilities.themeQueue.postRunnable(this.prepareRunnable);
    }

    public void seek(long j, float f) {
        if (this.mDecoder == null) {
            return;
        }
        this.lastSeek = j;
        this.lastSpeed = f;
        this.until.set(j);
        Iterator<Frame> it = this.frames.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Frame next = it.next();
            arrayList.add(Long.valueOf(next.position));
            float f2 = 25.0f * f;
            if (Math.abs(next.position - j) < f2) {
                if (this.currentFrame != next) {
                    FileLog.d("[VideoFramesRewinder] found a frame " + next.position + "ms to fit to " + j + "ms from " + this.frames.size() + " frames");
                    this.currentFrame = next;
                    invalidate();
                    int i = 0;
                    while (it.hasNext()) {
                        it.next();
                        it.remove();
                        i++;
                    }
                    if (i > 0) {
                        FileLog.d("[VideoFramesRewinder] also deleted " + i + " frames after this frame");
                    }
                }
                for (int size = arrayList.size() - 2; size >= 0; size--) {
                    long jLongValue = ((Long) arrayList.get(size + 1)).longValue();
                    long jLongValue2 = ((Long) arrayList.get(size)).longValue();
                    if (Math.abs(jLongValue - jLongValue2) > f2) {
                        prepare(jLongValue2);
                        return;
                    }
                }
                prepare(Math.max(0L, this.frames.first().position - 20));
                return;
            }
        }
        FileLog.d("[VideoFramesRewinder] didn't find a frame, wanting to prepare " + j + "ms");
        prepare(Math.max(0L, j));
    }

    public void clearCurrent() {
        if (this.currentFrame != null) {
            this.currentFrame = null;
            invalidate();
        }
    }

    public void release() {
        if (this.isPreparing) {
            this.stop.set(true);
            this.destroyAfterPrepare = true;
            return;
        }
        AnimatedFileNative animatedFileNative = this.mDecoder;
        if (animatedFileNative != null) {
            animatedFileNative.recycle();
            this.mDecoder = null;
        }
        int i = 0;
        this.destroyAfterPrepare = false;
        clearCurrent();
        this.until.set(0L);
        Iterator<Frame> it = this.frames.iterator();
        while (it.hasNext()) {
            AndroidUtilities.recycleBitmap(it.next().bitmap);
        }
        this.frames.clear();
        ArrayList<Frame> arrayList = this.freeFrames;
        int size = arrayList.size();
        while (i < size) {
            Frame frame = arrayList.get(i);
            i++;
            AndroidUtilities.recycleBitmap(frame.bitmap);
        }
        this.freeFrames.clear();
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    private void invalidate() {
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
