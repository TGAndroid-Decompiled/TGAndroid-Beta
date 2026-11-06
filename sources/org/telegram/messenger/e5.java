package org.telegram.messenger;

import android.database.ContentObserver;
public final class e5 extends ContentObserver {
    public final ai.m0 f22158a;
    public final g5 f22159b;

    public e5(g5 g5Var) {
        super(null);
        this.f22159b = g5Var;
        this.f22158a = new ai.m0(23);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z9) {
        super.onChange(z9);
        synchronized (this.f22159b.f22583f) {
            try {
                if (this.f22159b.d) {
                    return;
                }
                Utilities.f21333e.a(this.f22158a);
                Utilities.f21333e.d(this.f22158a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
