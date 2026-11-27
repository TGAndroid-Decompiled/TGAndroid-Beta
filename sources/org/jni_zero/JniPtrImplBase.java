package org.jni_zero;

import org.jni_zero.JniTypeToken;
abstract class JniPtrImplBase<T extends JniTypeToken> implements JniPtr<T> {
    static RawPtrReleaser sRawPtrReleaser;
    static TrackerFactory sTrackerFactory;
    long mNativePtr;

    interface RawPtrReleaser {
        void release(long j);
    }

    public interface Tracker {
        void destroy();
    }

    interface TrackerFactory {
        Tracker create(Object obj, String str);
    }

    public JniPtrImplBase(long j) {
        this.mNativePtr = j;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof JniPtrImplBase) && this.mNativePtr == ((JniPtrImplBase) obj).mNativePtr) {
            return true;
        }
        return false;
    }

    public abstract long getNativePtr();

    public int hashCode() {
        long j = this.mNativePtr;
        return (int) (j ^ (j >>> 32));
    }
}
