package org.telegram.messenger.utils;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.vkryl.core.reference.ReferenceList;

public final class Choreographer60FpsContent implements Choreographer.FrameCallback {
    public static Choreographer60FpsContent sInstance;
    public long mAccumulatedNs;
    public final Choreographer mChoreographer;
    public int mCounter;
    public final ReferenceList mDrawablesToInvalidate;
    public final ReferenceList mDrawablesToInvalidate30fps;
    public final SparseArray mGroups;
    public long mLastVsyncNs;
    public final LinkedHashSet mOneShot;
    public final ReferenceList mViewsToInvalidate;

    public final class CallbackGroup {
        public long accumulatedNs;
        public final long intervalNs;
        public ReferenceList runnableCallbacksOnce;
        public final int stride;
        public final ReferenceList callbacks = new ReferenceList(true);
        public final ReferenceList runnableCallbacks = new ReferenceList(true);

        public CallbackGroup(long j, int i) {
            this.intervalNs = j;
            this.stride = i;
        }
    }

    public interface FrameCallback {
        void doFrame(long j);
    }

    public Choreographer60FpsContent() {
        Choreographer choreographer = Choreographer.getInstance();
        this.mChoreographer = choreographer;
        this.mOneShot = new LinkedHashSet();
        this.mGroups = new SparseArray();
        this.mDrawablesToInvalidate = new ReferenceList(true);
        this.mDrawablesToInvalidate30fps = new ReferenceList(true);
        this.mViewsToInvalidate = new ReferenceList(true);
        choreographer.postFrameCallback(this);
    }

    public static void checkMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }

    public static Choreographer60FpsContent getInstance() {
        checkMainThread();
        if (sInstance == null) {
            sInstance = new Choreographer60FpsContent();
        }
        return sInstance;
    }

    public final void addFrameCallback(int i, Runnable runnable) {
        checkMainThread();
        if (runnable == null) {
            return;
        }
        int iMax = Math.max(1, Math.min(i, 60));
        removeFrameCallback(runnable);
        getOrCreateGroup(iMax).runnableCallbacks.add(runnable);
    }

    @Override
    public final void doFrame(long j) {
        ReferenceList referenceList;
        Iterator it;
        Iterator it2;
        Iterator it3;
        long j2 = this.mLastVsyncNs;
        if (j2 == 0) {
            this.mLastVsyncNs = j;
        } else {
            long j3 = (j - j2) + this.mAccumulatedNs;
            this.mAccumulatedNs = j3;
            this.mLastVsyncNs = j;
            if (j3 >= 16666666) {
                this.mAccumulatedNs = j3 % 16666666;
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.mGroups;
                    if (i >= sparseArray.size()) {
                        break;
                    }
                    CallbackGroup callbackGroup = (CallbackGroup) sparseArray.valueAt(i);
                    int i2 = callbackGroup.stride;
                    if (i2 <= 0) {
                        long j4 = callbackGroup.accumulatedNs + 16666666;
                        callbackGroup.accumulatedNs = j4;
                        long j5 = callbackGroup.intervalNs;
                        if (j4 >= j5) {
                            callbackGroup.accumulatedNs = j4 % j5;
                            referenceList = callbackGroup.runnableCallbacksOnce;
                            if (referenceList != null) {
                                callbackGroup.runnableCallbacksOnce = null;
                                it3 = referenceList.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                            }
                            it = callbackGroup.callbacks.iterator();
                            while (it.hasNext()) {
                                ((FrameCallback) it.next()).doFrame(j);
                            }
                            it2 = callbackGroup.runnableCallbacks.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                        }
                    } else if (this.mCounter % i2 == 0) {
                        referenceList = callbackGroup.runnableCallbacksOnce;
                        if (referenceList != null) {
                            callbackGroup.runnableCallbacksOnce = null;
                            it3 = referenceList.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                        }
                        it = callbackGroup.callbacks.iterator();
                        while (it.hasNext()) {
                            ((FrameCallback) it.next()).doFrame(j);
                        }
                        it2 = callbackGroup.runnableCallbacks.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                    }
                    i++;
                }
                LinkedHashSet linkedHashSet = this.mOneShot;
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    ((FrameCallback) it4.next()).doFrame(j);
                }
                ReferenceList referenceList2 = this.mViewsToInvalidate;
                Iterator it5 = referenceList2.iterator();
                while (it5.hasNext()) {
                    ((View) it5.next()).invalidate();
                }
                ReferenceList referenceList3 = this.mDrawablesToInvalidate;
                Iterator it6 = referenceList3.iterator();
                while (it6.hasNext()) {
                    ((Drawable) it6.next()).invalidateSelf();
                }
                referenceList2.clear();
                referenceList3.clear();
                linkedHashSet.clear();
                if (this.mCounter % 2 == 0) {
                    ReferenceList referenceList4 = this.mDrawablesToInvalidate30fps;
                    Iterator it7 = referenceList4.iterator();
                    while (it7.hasNext()) {
                        ((Drawable) it7.next()).invalidateSelf();
                    }
                    referenceList4.clear();
                }
                this.mCounter++;
            }
        }
        this.mChoreographer.postFrameCallback(this);
    }

    public final CallbackGroup getOrCreateGroup(int i) {
        SparseArray sparseArray = this.mGroups;
        CallbackGroup callbackGroup = (CallbackGroup) sparseArray.get(i);
        if (callbackGroup != null) {
            return callbackGroup;
        }
        CallbackGroup callbackGroup2 = new CallbackGroup(1000000000 / ((long) i), 60 % i == 0 ? 60 / i : 0);
        sparseArray.put(i, callbackGroup2);
        return callbackGroup2;
    }

    public final void removeFrameCallback(Runnable runnable) {
        checkMainThread();
        if (runnable == null) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.mGroups;
            if (i >= sparseArray.size() || ((CallbackGroup) sparseArray.valueAt(i)).runnableCallbacks.remove(runnable)) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void removeFrameCallback(FrameCallback frameCallback) {
        checkMainThread();
        if (frameCallback == null) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.mGroups;
            if (i >= sparseArray.size() || ((CallbackGroup) sparseArray.valueAt(i)).callbacks.remove(frameCallback)) {
                return;
            } else {
                i++;
            }
        }
    }
}
