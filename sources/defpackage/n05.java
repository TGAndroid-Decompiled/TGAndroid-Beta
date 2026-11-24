package defpackage;

import android.os.Bundle;
import org.telegram.messenger.a;
public final class n05 implements f05 {
    public final kj5 a;

    public n05(kj5 kj5Var) {
        this.a = kj5Var;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        dd6 dd6Var = (dd6) this.a;
        dd6Var.M = true;
        try {
            ((in3) a.i()).checkLocationSettings(dd6Var.O, new xc6(dd6Var, (byte) 1));
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
        this.a.getClass();
    }
}
