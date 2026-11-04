package k7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
public final class g extends p6.h {
    public final y5.b F;

    public g(Context context, Looper looper, o3 o3Var, y5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, o3Var, kVar, lVar, 0);
        bVar = bVar == null ? y5.b.f59032c : bVar;
        ua.b bVar2 = new ua.b(5);
        bVar2.f55783b = Boolean.FALSE;
        y5.b bVar3 = y5.b.f59032c;
        bVar.getClass();
        bVar2.f55783b = Boolean.valueOf(bVar.f59033a);
        bVar2.f55784c = bVar.f59034b;
        bVar2.f55784c = e.a();
        this.F = new y5.b(bVar2);
    }

    @Override
    public final int d() {
        return 12800000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof h) {
            return (h) queryLocalInterface;
        }
        return new b8.a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 6);
    }

    @Override
    public final Bundle k() {
        y5.b bVar = this.F;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f59033a);
        bundle.putString("log_session_id", bVar.f59034b);
        return bundle;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
