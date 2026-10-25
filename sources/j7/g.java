package j7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;
import m4.w1;
public final class g extends o6.g {
    public final x5.b U;

    public g(Context context, Looper looper, r3 r3Var, x5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, r3Var, kVar, lVar, 0);
        bVar = bVar == null ? x5.b.f51402c : bVar;
        w1 w1Var = new w1(26, (byte) 0);
        w1Var.f18293b = Boolean.FALSE;
        x5.b bVar2 = x5.b.f51402c;
        bVar.getClass();
        w1Var.f18293b = Boolean.valueOf(bVar.f51403a);
        w1Var.f18294c = bVar.f51404b;
        w1Var.f18294c = e.a();
        this.U = new x5.b(w1Var);
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
        return new a8.a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 6);
    }

    @Override
    public final Bundle t() {
        x5.b bVar = this.U;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f51403a);
        bundle.putString("log_session_id", bVar.f51404b);
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
