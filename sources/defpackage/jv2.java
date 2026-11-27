package defpackage;

import android.database.ContentObserver;
import org.telegram.messenger.Utilities;
public final class jv2 extends ContentObserver {
    public final kc a;
    public final lv2 b;

    public jv2(lv2 lv2Var) {
        super(null);
        this.b = lv2Var;
        this.a = new kc((byte) 26);
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
