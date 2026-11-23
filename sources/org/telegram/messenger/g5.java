package org.telegram.messenger;

import android.database.ContentObserver;
public final class g5 extends ContentObserver {
    public final j2 f24056a;
    public final i5 f24057b;

    public g5(i5 i5Var) {
        super(null);
        this.f24057b = i5Var;
        this.f24056a = new j2(1);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f24057b.f24568f) {
            try {
                if (this.f24057b.d) {
                    return;
                }
                Utilities.f22774e.a(this.f24056a);
                Utilities.f22774e.d(this.f24056a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
