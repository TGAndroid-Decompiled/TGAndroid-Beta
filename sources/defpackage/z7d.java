package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class z7d extends d05 {
    public final jkb F;

    public z7d(Context context, Looper looper, oxb oxbVar, jkb jkbVar, k05 k05Var, l05 l05Var) {
        super(270, k05Var, l05Var, oxbVar, context, looper);
        this.F = jkbVar;
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof r7d) {
            return (r7d) queryLocalInterface;
        }
        return new v3d(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 1);
    }

    @Override
    public final a94[] f() {
        return mid.c;
    }

    @Override
    public final Bundle h() {
        jkb jkbVar = this.F;
        jkbVar.getClass();
        Bundle bundle = new Bundle();
        String str = jkbVar.a;
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
