package l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;
public final class g extends q6.h {
    public final z5.b F;

    public g(Context context, Looper looper, q3 q3Var, z5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, q3Var, kVar, lVar, 0);
        bVar = bVar == null ? z5.b.f59708c : bVar;
        ?? obj = new Object();
        obj.f57244a = Boolean.FALSE;
        z5.b bVar2 = z5.b.f59708c;
        bVar.getClass();
        obj.f57244a = Boolean.valueOf(bVar.f59709a);
        obj.f57245b = bVar.f59710b;
        obj.f57245b = e.a();
        this.F = new z5.b(obj);
    }

    @Override
    public final int d() {
        return 12800000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof h) {
            return (h) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 7);
    }

    @Override
    public final Bundle m() {
        z5.b bVar = this.F;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f59709a);
        bundle.putString("log_session_id", bVar.f59710b);
        return bundle;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
