package defpackage;

import android.database.ContentObserver;
import org.telegram.messenger.Utilities;
public final class ou2 extends ContentObserver {
    public final jc a;
    public final qu2 b;

    public ou2(qu2 qu2Var) {
        super(null);
        this.b = qu2Var;
        this.a = new jc((byte) 26);
    }

    @Override
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override
    public final void onChange(boolean z) {
        super.onChange(z);
        synchronized (this.b.f) {
            if (this.b.d) {
                return;
            }
            Utilities.e.a(this.a);
            Utilities.e.d(this.a, 500L);
        }
    }
}
