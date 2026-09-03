package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import i5.v;
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
    int f20311w;
    private final Paint paint = new Paint(2);
    private final int[] meta = new int[8];
    private final ArrayList<Frame> freeFrames = new ArrayList<>();
    private final TreeSet<Frame> frames = new TreeSet<>(new b(1));
    private AtomicBoolean stop = new AtomicBoolean(false);
    private AtomicLong until = new AtomicLong(0);
    private float lastSpeed = 1.0f;
    private Runnable prepareRunnable = new a(this, 2);

    public class Frame {
        Bitmap bitmap;
        long position;

        private Frame() {
            VideoFramesRewinder.this = r1;
        }
    }

    public VideoFramesRewinder() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                this.maxFramesCount = 100;
                this.maxFrameSide = 480;
                return;
            }
            this.maxFramesCount = 400;
            this.maxFrameSide = 720;
            return;
        }
        this.maxFramesCount = 200;
        this.maxFrameSide = 580;
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

    public void lambda$new$1(ArrayList arrayList, long j10) {
        FileLog.d("[VideoFramesRewinder] total prepare of " + arrayList.size() + " took " + (System.currentTimeMillis() - j10) + "ms");
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
            this.frames.add((Frame) e2.c.g(1, arrayList));
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
        Frame frame;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = this.meta;
        int i12 = iArr[4];
        int i13 = 0;
        int min = Math.min(this.f20311w / 4, iArr[0]);
        int min2 = Math.min(this.h / 4, this.meta[1]);
        int i14 = this.maxFrameSide;
        if (min > i14 || min2 > i14) {
            float max = i14 / Math.max(min, min2);
            min = (int) (min * max);
            min2 = (int) (min2 * max);
        }
        this.mDecoder.g(this.prepareToMs - (this.prepareWithSpeed * 350.0f), false);
        long j10 = this.meta[3];
        int i15 = 0;
        int i16 = 0;
        for (char c3 = 3; this.meta[c3] <= this.until.get() && i15 < this.maxFramesCount && !this.stop.get(); c3 = 3) {
            float f10 = 1000.0f / i12;
            long j11 = j10;
            char c10 = 3;
            long j12 = (this.prepareWithSpeed * f10) + ((float) j10);
            if (!this.freeFrames.isEmpty()) {
                frame = this.freeFrames.remove(i13);
            } else {
                frame = new Frame();
            }
            Bitmap bitmap = frame.bitmap;
            if (bitmap == null || bitmap.getWidth() != min || frame.bitmap.getHeight() != min2) {
                AndroidUtilities.recycleBitmap(frame.bitmap);
                try {
                    frame.bitmap = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError unused) {
                    FileLog.d("[VideoFramesRewinder] failed to create bitmap: out of memory");
                }
            }
            while (true) {
                i10 = i12;
                i11 = i15;
                if (this.meta[c10] + ((long) Math.ceil(f10)) >= j12) {
                    break;
                }
                this.mDecoder.c(null, true, 0.0f, this.meta[4], false);
                i12 = i10;
                i15 = i11;
                c10 = 3;
            }
            if (this.mDecoder.c(frame.bitmap, true, 0.0f, this.meta[4], false) == 0) {
                i16++;
                if (i16 > 6) {
                    break;
                }
                j10 = j11;
            } else {
                long j13 = this.meta[3];
                frame.position = j13;
                arrayList.add(frame);
                j10 = j13;
            }
            i15 = i11 + 1;
            i12 = i10;
            i13 = 0;
        }
        AndroidUtilities.runOnUIThread(new v(this, arrayList, currentTimeMillis, 11));
    }

    private void prepare(long j10) {
        if (this.isPreparing) {
            return;
        }
        FileLog.d("[VideoFramesRewinder] starting preparing " + j10 + "ms");
        this.isPreparing = true;
        this.prepareToMs = j10;
        this.prepareWithSpeed = this.lastSpeed;
        Utilities.themeQueue.postRunnable(this.prepareRunnable);
    }

    public void clearCurrent() {
        if (this.currentFrame != null) {
            this.currentFrame = null;
            invalidate();
        }
    }

    public void draw(Canvas canvas, int i10, int i11) {
        this.f20311w = i10;
        this.h = i11;
        if (this.mDecoder != null && this.currentFrame != null) {
            canvas.save();
            canvas.scale(i10 / this.currentFrame.bitmap.getWidth(), i11 / this.currentFrame.bitmap.getHeight());
            canvas.drawBitmap(this.currentFrame.bitmap, 0.0f, 0.0f, this.paint);
            canvas.restore();
        }
    }

    public boolean isReady() {
        if (this.mDecoder != null) {
            return true;
        }
        return false;
    }

    public void release() {
        if (this.isPreparing) {
            this.stop.set(true);
            this.destroyAfterPrepare = true;
            return;
        }
        AnimatedFileNative animatedFileNative = this.mDecoder;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.mDecoder = null;
        }
        int i10 = 0;
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
        while (i10 < size) {
            Frame frame = arrayList.get(i10);
            i10++;
            AndroidUtilities.recycleBitmap(frame.bitmap);
        }
        this.freeFrames.clear();
    }

    public void seek(long j10, float f10) {
        if (this.mDecoder == null) {
            return;
        }
        this.lastSeek = j10;
        this.lastSpeed = f10;
        this.until.set(j10);
        Iterator<Frame> it = this.frames.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Frame next = it.next();
            arrayList.add(Long.valueOf(next.position));
            float f11 = 25.0f * f10;
            if (((float) Math.abs(next.position - j10)) < f11) {
                if (this.currentFrame != next) {
                    FileLog.d("[VideoFramesRewinder] found a frame " + next.position + "ms to fit to " + j10 + "ms from " + this.frames.size() + " frames");
                    this.currentFrame = next;
                    invalidate();
                    int i10 = 0;
                    while (it.hasNext()) {
                        it.next();
                        it.remove();
                        i10++;
                    }
                    if (i10 > 0) {
                        FileLog.d("[VideoFramesRewinder] also deleted " + i10 + " frames after this frame");
                    }
                }
                for (int size = arrayList.size() - 2; size >= 0; size--) {
                    long longValue = ((Long) arrayList.get(size + 1)).longValue();
                    long longValue2 = ((Long) arrayList.get(size)).longValue();
                    if (((float) Math.abs(longValue - longValue2)) > f11) {
                        prepare(longValue2);
                        return;
                    }
                }
                prepare(Math.max(0L, this.frames.first().position - 20));
                return;
            }
        }
        FileLog.d("[VideoFramesRewinder] didn't find a frame, wanting to prepare " + j10 + "ms");
        prepare(Math.max(0L, j10));
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    public void setup(File file) {
        if (file == null) {
            release();
            return;
        }
        this.stop.set(false);
        this.mDecoder = AnimatedFileNative.a(file.getAbsolutePath(), this.meta, UserConfig.selectedAccount, 0L, null, true);
    }
}
