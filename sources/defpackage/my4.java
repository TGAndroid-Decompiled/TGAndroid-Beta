package defpackage;

import android.os.Bundle;
import org.telegram.messenger.a;
public final class my4 implements ey4 {
    public final lh5 a;

    public my4(lh5 lh5Var) {
        this.a = lh5Var;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        eb6 eb6Var = (eb6) this.a;
        eb6Var.M = true;
        try {
            ((xl3) a.i()).checkLocationSettings(eb6Var.O, new ya6(eb6Var, (byte) 1));
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
        this.a.getClass();
    }
}
