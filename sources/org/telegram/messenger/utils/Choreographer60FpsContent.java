package org.telegram.messenger.utils;

import android.view.Choreographer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class Choreographer60FpsContent implements Choreographer.FrameCallback {
    private static Choreographer60FpsContent sInstance;
    private long mAccumulatedNs;
    private final Choreographer mChoreographer;
    private long mLastVsyncNs;
    private final Set mOneShot;
    private final Set mPersistent;

    public interface FrameCallback {
        void doFrame(long j);
    }

    public static Choreographer60FpsContent getInstance() {
        if (sInstance == null) {
            sInstance = new Choreographer60FpsContent();
        }
        return sInstance;
    }

    public void addFrameCallback(FrameCallback frameCallback) {
        this.mPersistent.add(frameCallback);
    }

    public void removeFrameCallback(FrameCallback frameCallback) {
        this.mPersistent.remove(frameCallback);
    }

    private Choreographer60FpsContent() {
        Choreographer choreographer = Choreographer.getInstance();
        this.mChoreographer = choreographer;
        this.mOneShot = new LinkedHashSet();
        this.mPersistent = new CopyOnWriteArraySet();
        choreographer.postFrameCallback(this);
    }

    @Override
    public void doFrame(long j) {
        long j2 = this.mLastVsyncNs;
        if (j2 == 0) {
            this.mLastVsyncNs = j;
        } else {
            long j3 = this.mAccumulatedNs + (j - j2);
            this.mAccumulatedNs = j3;
            this.mLastVsyncNs = j;
            if (j3 >= 16666666) {
                this.mAccumulatedNs = j3 - 16666666;
                dispatchFrame(j);
            }
        }
        this.mChoreographer.postFrameCallback(this);
    }

    private void dispatchFrame(long j) {
        Iterator it = this.mPersistent.iterator();
        while (it.hasNext()) {
            ((FrameCallback) it.next()).doFrame(j);
        }
        Iterator it2 = this.mOneShot.iterator();
        while (it2.hasNext()) {
            ((FrameCallback) it2.next()).doFrame(j);
        }
        this.mOneShot.clear();
    }
}
