package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class hsd extends d05 {
    public final vla F;
    public final vla G;
    public final vla H;

    public hsd(k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(23, k05Var, l05Var, oxbVar, context, looper);
        this.F = new vla(0);
        this.G = new vla(0);
        this.H = new vla(0);
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof q7f) {
            return (q7f) queryLocalInterface;
        }
        return new v3d(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", (byte) 5);
    }

    @Override
    public final a94[] f() {
        return cpd.a;
    }

    @Override
    public final int i() {
        return 11717000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override
    public final String n() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override
    public final void t(int i) {
        super.t(i);
        synchronized (this.F) {
            this.F.clear();
        }
        synchronized (this.G) {
            this.G.clear();
        }
        synchronized (this.H) {
            this.H.clear();
        }
    }

    @Override
    public final boolean x() {
        return true;
    }
}
