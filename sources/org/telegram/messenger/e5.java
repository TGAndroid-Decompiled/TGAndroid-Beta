package org.telegram.messenger;

import android.database.ContentObserver;
public final class e5 extends ContentObserver {
    public final ai.m0 f22193a;
    public final g5 f22194b;

    public e5(g5 g5Var) {
        super(null);
        this.f22194b = g5Var;
        this.f22193a = new ai.m0(25);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z9) {
        super.onChange(z9);
        synchronized (this.f22194b.f22613f) {
            try {
                if (this.f22194b.d) {
                    return;
                }
                Utilities.f21341e.a(this.f22193a);
                Utilities.f21341e.d(this.f22193a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
