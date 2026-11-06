package org.telegram.messenger;

import android.database.ContentObserver;
public final class e5 extends ContentObserver {
    public final ai.m0 f22165a;
    public final g5 f22166b;

    public e5(g5 g5Var) {
        super(null);
        this.f22166b = g5Var;
        this.f22165a = new ai.m0(23);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z9) {
        super.onChange(z9);
        synchronized (this.f22166b.f22590f) {
            try {
                if (this.f22166b.d) {
                    return;
                }
                Utilities.f21333e.a(this.f22165a);
                Utilities.f21333e.d(this.f22165a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
