package org.telegram.messenger;

import android.database.ContentObserver;
public final class g5 extends ContentObserver {
    public final ag.f3 f15676a;
    public final i5 f15677b;

    public g5(i5 i5Var) {
        super(null);
        this.f15677b = i5Var;
        this.f15676a = new ag.f3(14);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f15677b.f16066f) {
            try {
                if (this.f15677b.d) {
                    return;
                }
                Utilities.e.a(this.f15676a);
                Utilities.e.d(this.f15676a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
