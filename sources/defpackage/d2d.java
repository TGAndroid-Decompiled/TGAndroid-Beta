package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import j$.util.Objects;
public final class d2d {
    public final byte a;
    public final eq2 b;

    public d2d(eq2 eq2Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(eq2Var);
                this.b = eq2Var;
                return;
            default:
                Objects.requireNonNull(eq2Var);
                this.b = eq2Var;
                return;
        }
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 5;
        }
    }

    public final void b() {
        byte b = this.a;
        eq2 eq2Var = this.b;
        switch (b) {
            case 0:
                vk9 vk9Var = (vk9) eq2Var.a;
                st stVar = (st) vk9Var.b;
                kwe kweVar = (kwe) vk9Var.c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel R = kweVar.R();
                    sgd.b(R, bundle);
                    kweVar.V(R, 2);
                    ohd.b(bundle, null);
                    Parcel Q = kweVar.Q(kweVar.R(), 8);
                    yi5 T = bo7.T(Q.readStrongBinder());
                    Q.recycle();
                    vk9Var.d = (View) bo7.U(T);
                    stVar.removeAllViews();
                    stVar.addView((View) vk9Var.d);
                    return;
                } catch (RemoteException e) {
                    fvc.g(e);
                    return;
                }
            default:
                vk9 vk9Var2 = (vk9) eq2Var.a;
                vk9Var2.getClass();
                try {
                    kwe kweVar2 = (kwe) vk9Var2.c;
                    kweVar2.V(kweVar2.R(), 3);
                    return;
                } catch (RemoteException e2) {
                    fvc.g(e2);
                    return;
                }
        }
    }
}
