package b7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.t3;
public final class m extends x5.g {
    public final a0.k Q;
    public final a0.k R;
    public final a0.k S;

    public m(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, t3 t3Var) {
        super(context, looper, 23, t3Var, kVar, lVar, 0);
        this.Q = new a0.k(0);
        this.R = new a0.k(0);
        this.S = new a0.k(0);
    }

    @Override
    public final void A(int i9) {
        super.A(i9);
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
    public final int l() {
        return 11717000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof c0) {
            return (c0) queryLocalInterface;
        }
        return new a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 0);
    }

    @Override
    public final u5.c[] r() {
        return q7.l.f46113a;
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
