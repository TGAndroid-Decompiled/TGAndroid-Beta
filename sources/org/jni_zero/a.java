package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniZero;
public final class a implements JniPtrImplBase.TrackerFactory, JniPtrImplBase.Tracker {
    public final Object a;

    public a(Object obj) {
        this.a = obj;
    }

    @Override
    public final JniPtrImplBase.Tracker create(Object obj, String str) {
        return JniZero.a((JniZero.SafePointersTrackerFactory) this.a, obj, str);
    }

    @Override
    public final void destroy() {
        ((JniZero.SafePointersTracker) this.a).destroy();
    }
}
