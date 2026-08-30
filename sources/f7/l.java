package f7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.s3;
public final class l extends b6.g {
    public final a0.k R;
    public final a0.k S;
    public final a0.k T;

    public l(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, s3 s3Var) {
        super(context, looper, 23, s3Var, kVar, lVar, 0);
        this.R = new a0.k(0);
        this.S = new a0.k(0);
        this.T = new a0.k(0);
    }

    @Override
    public final void A(int i10) {
        super.A(i10);
        synchronized (this.R) {
            this.R.clear();
        }
        synchronized (this.S) {
            this.S.clear();
        }
        synchronized (this.T) {
            this.T.clear();
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof a0) {
            return (a0) queryLocalInterface;
        }
        return new a7.a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 4);
    }

    @Override
    public final y5.c[] r() {
        return u7.k.f45194a;
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
