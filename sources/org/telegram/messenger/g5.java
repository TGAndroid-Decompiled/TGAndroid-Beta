package org.telegram.messenger;

import android.database.ContentObserver;
public final class g5 extends ContentObserver {
    public final j2 f24170a;
    public final i5 f24171b;

    public g5(i5 i5Var) {
        super(null);
        this.f24171b = i5Var;
        this.f24170a = new j2(1);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f24171b.f24566f) {
            try {
                if (this.f24171b.d) {
                    return;
                }
                Utilities.f22779e.a(this.f24170a);
                Utilities.f22779e.d(this.f24170a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
