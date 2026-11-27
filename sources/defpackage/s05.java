package defpackage;

import android.os.Bundle;
import org.telegram.messenger.a;
public final class s05 implements k05 {
    public final nj5 a;

    public s05(nj5 nj5Var) {
        this.a = nj5Var;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        id6 id6Var = (id6) this.a;
        id6Var.M = true;
        try {
            ((pm3) a.i()).checkLocationSettings(id6Var.O, new bd6(id6Var, (byte) 1));
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
        this.a.getClass();
    }
}
