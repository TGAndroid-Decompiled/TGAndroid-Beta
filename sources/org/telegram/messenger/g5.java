package org.telegram.messenger;

import android.database.ContentObserver;
public final class g5 extends ContentObserver {
    public final j2 f24173a;
    public final i5 f24174b;

    public g5(i5 i5Var) {
        super(null);
        this.f24174b = i5Var;
        this.f24173a = new j2(1);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f24174b.f24569f) {
            try {
                if (this.f24174b.d) {
                    return;
                }
                Utilities.f22782e.a(this.f24173a);
                Utilities.f22782e.d(this.f24173a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
