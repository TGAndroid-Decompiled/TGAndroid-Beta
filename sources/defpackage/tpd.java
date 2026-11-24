package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class tpd extends zz4 {
    public final cka F;
    public final cka G;
    public final cka H;

    public tpd(f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(23, f05Var, g05Var, ovbVar, context, looper);
        this.F = new cka(0);
        this.G = new cka(0);
        this.H = new cka(0);
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof b5f) {
            return (b5f) queryLocalInterface;
        }
        return new f1d(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", (byte) 5);
    }

    @Override
    public final o94[] f() {
        return nmd.a;
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
