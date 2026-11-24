package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class qnd extends xx4 {
    public final aia F;
    public final aia G;
    public final aia H;

    public qnd(ey4 ey4Var, fy4 fy4Var, ntb ntbVar, Context context, Looper looper) {
        super(23, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = new aia(0);
        this.G = new aia(0);
        this.H = new aia(0);
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof z2f) {
            return (z2f) queryLocalInterface;
        }
        return new ezc(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", (byte) 5);
    }

    @Override
    public final f84[] f() {
        return lkd.a;
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
