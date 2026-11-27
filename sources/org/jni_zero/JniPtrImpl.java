package org.jni_zero;

import org.jni_zero.JniTypeToken;
class JniPtrImpl<T extends JniTypeToken> extends JniPtrImplBase<T> {
    public JniPtrImpl(long j) {
        super(j);
        if (j != 0) {
            return;
        }
        lq5.j("JNI Zero internal error: if the pointer is 0, it should be converted to null");
        throw null;
    }

    @Override
    public long getNativePtr() {
        long j = this.mNativePtr;
        if (j != 0) {
            return j;
        }
        grb.i("Safe JNI Pointer violation: Attempted to access a JniPtr after it was released.");
        return 0L;
    }

    public void release() {
        this.mNativePtr = 0L;
    }
}
