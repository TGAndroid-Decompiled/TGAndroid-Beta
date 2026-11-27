package org.jni_zero;
public final class JniZeroInternal {
    private JniZeroInternal() {
    }

    public static JniRawPtr<?> createRawPtr(long j) {
        if (j == 0) {
            return null;
        }
        return new JniRawPtrImpl(j);
    }

    public static long getNativePtr(JniPtr<?> jniPtr) {
        if (jniPtr == null) {
            return 0L;
        }
        return ((JniPtrImplBase) jniPtr).getNativePtr();
    }
}
