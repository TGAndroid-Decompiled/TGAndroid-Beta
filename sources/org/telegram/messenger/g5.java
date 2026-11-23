package org.telegram.messenger;

import android.database.ContentObserver;
public final class g5 extends ContentObserver {
    public final j2 f24272a;
    public final i5 f24273b;

    public g5(i5 i5Var) {
        super(null);
        this.f24273b = i5Var;
        this.f24272a = new j2(1);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f24273b.f24692f) {
            try {
                if (this.f24273b.d) {
                    return;
                }
                Utilities.f22877e.a(this.f24272a);
                Utilities.f22877e.d(this.f24272a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
