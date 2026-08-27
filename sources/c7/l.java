package c7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.t3;

public final class l extends y5.g {
    public final a0.k Q;
    public final a0.k R;
    public final a0.k S;

    public l(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, t3 t3Var) {
        super(context, looper, 23, t3Var, kVar, lVar, 0);
        this.Q = new a0.k(0);
        this.R = new a0.k(0);
        this.S = new a0.k(0);
    }

    @Override
    public final void A(int i10) {
        super.A(i10);
        synchronized (this.Q) {
            this.Q.clear();
        }
        synchronized (this.R) {
            this.R.clear();
        }
        synchronized (this.S) {
            this.S.clear();
        }
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int k() {
        return 11717000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof b0 ? (b0) iInterfaceQueryLocalInterface : new b0(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 0);
    }

    @Override
    public final v5.c[] r() {
        return r7.k.f46872a;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override
    public final String w() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
