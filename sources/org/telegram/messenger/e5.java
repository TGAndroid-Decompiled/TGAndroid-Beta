package org.telegram.messenger;

import android.database.ContentObserver;
public final class e5 extends ContentObserver {
    public final ai.o f23265a;
    public final g5 f23266b;

    public e5(g5 g5Var) {
        super(null);
        this.f23266b = g5Var;
        this.f23265a = new ai.o(29);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f23266b.f23678f) {
            try {
                if (this.f23266b.d) {
                    return;
                }
                Utilities.f22416e.a(this.f23265a);
                Utilities.f22416e.d(this.f23265a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
