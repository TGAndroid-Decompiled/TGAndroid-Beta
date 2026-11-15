package org.telegram.messenger;

import android.database.ContentObserver;
public final class e5 extends ContentObserver {
    public final ai.o f23272a;
    public final g5 f23273b;

    public e5(g5 g5Var) {
        super(null);
        this.f23273b = g5Var;
        this.f23272a = new ai.o(29);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f23273b.f23680f) {
            try {
                if (this.f23273b.d) {
                    return;
                }
                Utilities.f22416e.a(this.f23272a);
                Utilities.f22416e.d(this.f23272a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
