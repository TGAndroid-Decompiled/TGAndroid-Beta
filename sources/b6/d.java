package b6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
import z5.g;
import z5.p;
public final class d extends g {
    public final p Q;

    public d(Context context, Looper looper, s3 s3Var, p pVar, k kVar, l lVar) {
        super(context, looper, 270, s3Var, kVar, lVar, 0);
        this.Q = pVar;
    }

    @Override
    public final int k() {
        return 203400000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 10);
    }

    @Override
    public final w5.c[] r() {
        return w6.b.f49792b;
    }

    @Override
    public final Bundle t() {
        p pVar = this.Q;
        pVar.getClass();
        Bundle bundle = new Bundle();
        String str = pVar.f50664a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final boolean y() {
        return true;
    }
}
