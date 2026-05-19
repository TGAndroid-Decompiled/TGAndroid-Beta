package org.telegram.messenger.utils;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.Choreographer;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import me.vkryl.core.reference.ReferenceList;

public final class Choreographer60FpsContent implements Choreographer.FrameCallback {
    private static Choreographer60FpsContent sInstance;
    private long mAccumulatedNs;
    private final Choreographer mChoreographer;
    private int mCounter;
    private final ReferenceList mDrawablesToInvalidate;
    private final ReferenceList mDrawablesToInvalidate30fps;
    private final SparseArray mGroups;
    private long mLastVsyncNs;
    private final Set mOneShot;
    private final ReferenceList mViewsToInvalidate;

    public interface FrameCallback {
        void doFrame(long j);
    }

    public static Choreographer60FpsContent getInstance() {
        if (sInstance == null) {
            sInstance = new Choreographer60FpsContent();
        }
        return sInstance;
    }

    public void postInvalidateDrawable(Drawable drawable) {
        this.mDrawablesToInvalidate.add(drawable);
    }

    public void postInvalidateDrawable30fps(Drawable drawable) {
        this.mDrawablesToInvalidate30fps.add(drawable);
    }

    public void addFrameCallback(FrameCallback frameCallback) {
        addFrameCallback(frameCallback, 60);
    }

    public void addFrameCallback(FrameCallback frameCallback, int i) {
        int iMax = Math.max(1, Math.min(i, 60));
        removeFrameCallback(frameCallback);
        getOrCreateGroup(iMax).callbacks.add(frameCallback);
    }

    public void removeFrameCallback(FrameCallback frameCallback) {
        for (int i = 0; i < this.mGroups.size(); i++) {
            CallbackGroup callbackGroup = (CallbackGroup) this.mGroups.valueAt(i);
            if (callbackGroup.callbacks.remove(frameCallback)) {
                if (callbackGroup.callbacks.isEmpty()) {
                    this.mGroups.removeAt(i);
                    return;
                }
                return;
            }
        }
    }

    private Choreographer60FpsContent() {
        Choreographer choreographer = Choreographer.getInstance();
        this.mChoreographer = choreographer;
        this.mOneShot = new LinkedHashSet();
        this.mGroups = new SparseArray();
        this.mDrawablesToInvalidate = new ReferenceList();
        this.mDrawablesToInvalidate30fps = new ReferenceList();
        this.mViewsToInvalidate = new ReferenceList();
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

    private void dispatchFrame(long r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.utils.Choreographer60FpsContent.dispatchFrame(long):void");
    }

    private CallbackGroup getOrCreateGroup(int i) {
        CallbackGroup callbackGroup = (CallbackGroup) this.mGroups.get(i);
        if (callbackGroup != null) {
            return callbackGroup;
        }
        CallbackGroup callbackGroup2 = new CallbackGroup(1000000000 / i, 60 % i == 0 ? 60 / i : 0);
        this.mGroups.put(i, callbackGroup2);
        return callbackGroup2;
    }

    private static final class CallbackGroup {
        long accumulatedNs;
        final CopyOnWriteArrayList callbacks = new CopyOnWriteArrayList();
        final long intervalNs;
        final int stride;

        CallbackGroup(long j, int i) {
            this.intervalNs = j;
            this.stride = i;
        }
    }
}
