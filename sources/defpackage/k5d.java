package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class k5d extends zz4 {
    public final oib F;

    public k5d(Context context, Looper looper, ovb ovbVar, oib oibVar, f05 f05Var, g05 g05Var) {
        super(270, f05Var, g05Var, ovbVar, context, looper);
        this.F = oibVar;
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof c5d) {
            return (c5d) queryLocalInterface;
        }
        return new f1d(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 1);
    }

    @Override
    public final o94[] f() {
        return wfd.c;
    }

    @Override
    public final Bundle h() {
        oib oibVar = this.F;
        oibVar.getClass();
        Bundle bundle = new Bundle();
        String str = oibVar.a;
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
