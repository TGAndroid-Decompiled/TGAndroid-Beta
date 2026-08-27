package a6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;
import y5.g;
import y5.p;

public final class d extends g {
    public final p Q;

    public d(Context context, Looper looper, t3 t3Var, p pVar, k kVar, l lVar) {
        super(context, looper, 270, t3Var, kVar, lVar, 0);
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 10);
    }

    @Override
    public final v5.c[] r() {
        return v6.b.f48817b;
    }

    @Override
    public final Bundle t() {
        p pVar = this.Q;
        pVar.getClass();
        Bundle bundle = new Bundle();
        String str = pVar.f49681a;
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
