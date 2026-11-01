package org.telegram.messenger;

import android.database.ContentObserver;
public final class g5 extends ContentObserver {
    public final ag.f3 f15861a;
    public final i5 f15862b;

    public g5(i5 i5Var) {
        super(null);
        this.f15862b = i5Var;
        this.f15861a = new ag.f3(14);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f15862b.f16219f) {
            try {
                if (this.f15862b.d) {
                    return;
                }
                Utilities.e.a(this.f15861a);
                Utilities.e.d(this.f15861a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
