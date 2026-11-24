package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class i3d extends xx4 {
    public final ngb F;

    public i3d(Context context, Looper looper, ntb ntbVar, ngb ngbVar, ey4 ey4Var, fy4 fy4Var) {
        super(270, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = ngbVar;
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a3d) {
            return (a3d) queryLocalInterface;
        }
        return new ezc(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 1);
    }

    @Override
    public final f84[] f() {
        return udd.c;
    }

    @Override
    public final Bundle h() {
        ngb ngbVar = this.F;
        ngbVar.getClass();
        Bundle bundle = new Bundle();
        String str = ngbVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override
    public final int i() {
        return 203400000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final boolean p() {
        return true;
    }
}
