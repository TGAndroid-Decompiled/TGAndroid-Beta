package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniTypeToken;
public interface JniRawPtr<T extends JniTypeToken> extends JniPtr<T> {

    class AnonymousClass1 extends JniRawPtrImpl<JniTypeToken> {
        public AnonymousClass1(long j) {
            super(j);
        }

        @Override
        public void release() {
            if (this.mNativePtr != 0) {
                JniPtrImplBase.Tracker tracker = this.mTracker;
                if (tracker != null) {
                    tracker.destroy();
                }
                this.mNativePtr = 0L;
            }
        }
    }

    void release();
}
