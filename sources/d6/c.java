package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b6.g;
import b6.q;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
public final class c extends g {
    public final q R;

    public c(Context context, Looper looper, s3 s3Var, q qVar, k kVar, l lVar) {
        super(context, looper, 270, s3Var, kVar, lVar, 0);
        this.R = qVar;
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
        return new a7.a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 11);
    }

    @Override
    public final y5.c[] r() {
        return y6.b.f47196b;
    }

    @Override
    public final Bundle t() {
        q qVar = this.R;
        qVar.getClass();
        Bundle bundle = new Bundle();
        String str = qVar.f1647a;
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
