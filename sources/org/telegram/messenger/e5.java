package org.telegram.messenger;

import android.database.ContentObserver;
public final class e5 extends ContentObserver {
    public final ai.m0 f22189a;
    public final g5 f22190b;

    public e5(g5 g5Var) {
        super(null);
        this.f22190b = g5Var;
        this.f22189a = new ai.m0(25);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z9) {
        super.onChange(z9);
        synchronized (this.f22190b.f22609f) {
            try {
                if (this.f22190b.d) {
                    return;
                }
                Utilities.f21336e.a(this.f22189a);
                Utilities.f21336e.d(this.f22189a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
