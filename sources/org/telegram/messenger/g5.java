package org.telegram.messenger;

import android.database.ContentObserver;
public final class g5 extends ContentObserver {
    public final j2 f24092a;
    public final i5 f24093b;

    public g5(i5 i5Var) {
        super(null);
        this.f24093b = i5Var;
        this.f24092a = new j2(1);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f24093b.f24604f) {
            try {
                if (this.f24093b.d) {
                    return;
                }
                Utilities.f22810e.a(this.f24092a);
                Utilities.f22810e.d(this.f24092a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
