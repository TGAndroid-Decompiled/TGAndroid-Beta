package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
public final class b implements JniPtrImplBase.RawPtrReleaser {
    @Override
    public final void release(long j) {
        JniZero.lambda$init$1(j);
    }
}
