package i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;
public final class g extends n6.g {
    public final w5.b U;

    public g(Context context, Looper looper, q3 q3Var, w5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, q3Var, kVar, lVar, 0);
        bVar = bVar == null ? w5.b.f44592c : bVar;
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.f15300b = Boolean.FALSE;
        w5.b bVar2 = w5.b.f44592c;
        bVar.getClass();
        aVar.f15300b = Boolean.valueOf(bVar.f44593a);
        aVar.f15301c = bVar.f44594b;
        aVar.f15301c = e.a();
        this.U = new w5.b(aVar);
    }

    @Override
    public final int l() {
        return 12800000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof h) {
            return (h) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 5);
    }

    @Override
    public final Bundle t() {
        w5.b bVar = this.U;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f44593a);
        bundle.putString("log_session_id", bVar.f44594b);
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
