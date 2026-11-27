package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniTypeToken;
class JniUniquePtrImpl<T extends JniTypeToken> extends JniPtrImplBase<T> implements JniUniquePtr<T> {
    static final boolean $assertionsDisabled = false;
    private final long mDeleter;
    private final JniPtrImplBase.Tracker mTracker;

    public JniUniquePtrImpl(long j, long j2, String str) {
        super(j);
        JniPtrImplBase.Tracker create;
        this.mDeleter = j2;
        JniPtrImplBase.TrackerFactory trackerFactory = JniPtrImplBase.sTrackerFactory;
        if (trackerFactory == null) {
            create = null;
        } else {
            create = trackerFactory.create(this, str);
        }
        this.mTracker = create;
    }

    @Override
    public void destroy() {
        if (this.mNativePtr != 0) {
            JniPtrImplBase.Tracker tracker = this.mTracker;
            if (tracker != null) {
                tracker.destroy();
            }
            long j = this.mNativePtr;
            this.mNativePtr = 0L;
            if (this.mDeleter != 0) {
                CommonApisJni.get().deleteDeleterBasePtr(j, this.mDeleter);
            }
        }
    }

    @Override
    public long getNativePtr() {
        long j = this.mNativePtr;
        if (j != 0) {
            return j;
        }
        grb.i("Safe JNI Pointer violation: Attempted to access a JniUniquePtr after it was destroyed.");
        return 0L;
    }

    public JniUniquePtrImpl(long j, long j2) {
        this(j, j2, null);
    }
}
