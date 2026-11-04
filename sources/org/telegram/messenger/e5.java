package org.telegram.messenger;

import android.database.ContentObserver;
public final class e5 extends ContentObserver {
    public final ai.y1 f22317a;
    public final g5 f22318b;

    public e5(g5 g5Var) {
        super(null);
        this.f22318b = g5Var;
        this.f22317a = new ai.y1(27);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z10) {
        super.onChange(z10);
        synchronized (this.f22318b.f22652f) {
            try {
                if (this.f22318b.d) {
                    return;
                }
                Utilities.f21387e.a(this.f22317a);
                Utilities.f21387e.e(this.f22317a, 500L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
