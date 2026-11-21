package org.telegram.messenger;

import android.database.ContentObserver;
public final class g5 extends ContentObserver {
    public final j2 f24198a;
    public final i5 f24199b;

    public g5(i5 i5Var) {
        super(null);
        this.f24199b = i5Var;
        this.f24198a = new j2(1);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f24199b.f24594f) {
            try {
                if (this.f24199b.d) {
                    return;
                }
                Utilities.f22807e.a(this.f24198a);
                Utilities.f22807e.d(this.f24198a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
