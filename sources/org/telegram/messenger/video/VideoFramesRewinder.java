package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
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
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda17;

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
    private final TreeSet<Frame> frames = new TreeSet<>(new Track$$ExternalSyntheticLambda0(1));
    private AtomicBoolean stop = new AtomicBoolean(false);
    private AtomicLong until = new AtomicLong(0);
    private float lastSpeed = 1.0f;
    private Runnable prepareRunnable = new VideoAds$$ExternalSyntheticLambda14(this, 2);

    public class Frame {
        Bitmap bitmap;
        long position;

        private Frame() {
        }
    }

    public VideoFramesRewinder() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            this.maxFramesCount = 200;
            this.maxFrameSide = 580;
        } else if (devicePerformanceClass != 2) {
            this.maxFramesCount = 100;
            this.maxFrameSide = 480;
        } else {
            this.maxFramesCount = 400;
            this.maxFrameSide = 720;
        }
    }

    private void invalidate() {
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static int lambda$new$0(Frame frame, Frame frame2) {
        return (int) (frame.position - frame2.position);
    }

    public void lambda$new$1(ArrayList arrayList, long j) {
        FileLog.d("[VideoFramesRewinder] total prepare of " + arrayList.size() + " took " + (System.currentTimeMillis() - j) + "ms");
        if (!arrayList.isEmpty()) {
            FileLog.d("[VideoFramesRewinder] prepared from " + ((Frame) arrayList.get(0)).position + "ms to " + ((Frame) arrayList.get(arrayList.size() - 1)).position + "ms (requested up to " + this.prepareToMs + "ms)");
        }
        this.isPreparing = false;
        Iterator<Frame> it = this.frames.iterator();
        while (it.hasNext()) {
            Frame next = it.next();
            if (this.currentFrame != next && next.position > this.lastSeek) {
                if (this.freeFrames.size() > 20) {
                    AndroidUtilities.recycleBitmap(next.bitmap);
                } else {
                    this.freeFrames.add(next);
                }
                it.remove();
            }
        }
        while (!arrayList.isEmpty() && this.frames.size() < this.maxFramesCount) {
            this.frames.add((Frame) arrayList.remove(arrayList.size() - 1));
        }
        if (arrayList.size() > 0) {
            FileLog.d("[VideoFramesRewinder] prepared " + arrayList.size() + " more frames than I could fit :(");
        }
        if (this.destroyAfterPrepare) {
            release();
            this.stop.set(false);
        }
    }

    public void lambda$new$2() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int[] iArr = this.meta;
        int i3 = iArr[4];
        int i4 = 0;
        int iMin = Math.min(this.w / 4, iArr[0]);
        int iMin2 = Math.min(this.h / 4, this.meta[1]);
        int i5 = this.maxFrameSide;
        if (iMin > i5 || iMin2 > i5) {
            float fMax = i5 / Math.max(iMin, iMin2);
            iMin = (int) (iMin * fMax);
            iMin2 = (int) (iMin2 * fMax);
        }
        this.mDecoder.seekToMs(this.prepareToMs - ((long) (this.prepareWithSpeed * 350.0f)), false);
        long j = this.meta[3];
        int i6 = 0;
        int i7 = 0;
        for (char c = 3; this.meta[c] <= this.until.get() && i6 < this.maxFramesCount && !this.stop.get(); c = 3) {
            float f = 1000.0f / i3;
            long j2 = j;
            char c2 = 3;
            long j3 = (long) ((this.prepareWithSpeed * f) + j);
            Frame frameRemove = !this.freeFrames.isEmpty() ? this.freeFrames.remove(i4) : new Frame();
            Bitmap bitmap = frameRemove.bitmap;
            if (bitmap != null && bitmap.getWidth() == iMin && frameRemove.bitmap.getHeight() == iMin2) {
                while (true) {
                    i = i3;
                    i2 = i6;
                    if (((long) this.meta[c2]) + ((long) Math.ceil(f)) < j3) {
                        break;
                        break;
                    }
                    this.mDecoder.getVideoFrame(null, true, 0.0f, this.meta[4], false);
                    i3 = i;
                    i6 = i2;
                    c2 = 3;
                }
                if (this.mDecoder.getVideoFrame(frameRemove.bitmap, true, 0.0f, this.meta[4], false) == 0) {
                    i7++;
                    if (i7 > 6) {
                        break;
                        break;
                    }
                    j = j2;
                } else {
                    long j4 = this.meta[3];
                    frameRemove.position = j4;
                    arrayList.add(frameRemove);
                    j = j4;
                }
                i6 = i2 + 1;
                i3 = i;
                i4 = 0;
            } else {
                AndroidUtilities.recycleBitmap(frameRemove.bitmap);
                try {
                    frameRemove.bitmap = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                    while (true) {
                        i = i3;
                        i2 = i6;
                        if (((long) this.meta[c2]) + ((long) Math.ceil(f)) < j3) {
                            break;
                        }
                        this.mDecoder.getVideoFrame(null, true, 0.0f, this.meta[4], false);
                        i3 = i;
                        i6 = i2;
                        c2 = 3;
                    }
                    if (this.mDecoder.getVideoFrame(frameRemove.bitmap, true, 0.0f, this.meta[4], false) == 0) {
                        i7++;
                        if (i7 > 6) {
                            break;
                        } else {
                            j = j2;
                        }
                    } else {
                        long j5 = this.meta[3];
                        frameRemove.position = j5;
                        arrayList.add(frameRemove);
                        j = j5;
                    }
                    i6 = i2 + 1;
                    i3 = i;
                    i4 = 0;
                } catch (OutOfMemoryError unused) {
                    FileLog.d("[VideoFramesRewinder] failed to create bitmap: out of memory");
                }
            }
        }
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda17(this, arrayList, jCurrentTimeMillis, 2));
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

    public void clearCurrent() {
        if (this.currentFrame != null) {
            this.currentFrame = null;
            invalidate();
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

    public void setParentView(View view) {
        this.parentView = view;
    }

    public void setup(File file) {
        if (file == null) {
            release();
        } else {
            this.stop.set(false);
            this.mDecoder = AnimatedFileNative.createDecoderFrom(file.getAbsolutePath(), this.meta, UserConfig.selectedAccount, 0L, null, true);
        }
    }
}
