package a7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h6.m;
import j$.util.Objects;
import l8.f;
import m.q3;
public final class c {
    public final int f300a;
    public final q3 f301b;

    public c(q3 q3Var, int i7) {
        this.f300a = i7;
        switch (i7) {
            case 1:
                Objects.requireNonNull(q3Var);
                this.f301b = q3Var;
                return;
            default:
                Objects.requireNonNull(q3Var);
                this.f301b = q3Var;
                return;
        }
    }

    public final int a() {
        switch (this.f300a) {
            case 0:
                return 1;
            default:
                return 5;
        }
    }

    public final void b() {
        switch (this.f300a) {
            case 0:
                m mVar = (m) this.f301b.f19226b;
                ViewGroup viewGroup = (ViewGroup) mVar.f14264b;
                f fVar = (f) mVar.f14265c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel P0 = fVar.P0();
                    v7.b.b(P0, bundle);
                    fVar.T0(P0, 2);
                    l8.c.b(bundle, null);
                    Parcel O0 = fVar.O0(fVar.P0(), 8);
                    a M0 = b.M0(O0.readStrongBinder());
                    O0.recycle();
                    mVar.d = (View) b.N0(M0);
                    viewGroup.removeAllViews();
                    viewGroup.addView((View) mVar.d);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                m mVar2 = (m) this.f301b.f19226b;
                mVar2.getClass();
                try {
                    f fVar2 = (f) mVar2.f14265c;
                    fVar2.T0(fVar2.P0(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new RuntimeException(e11);
                }
        }
    }
}
