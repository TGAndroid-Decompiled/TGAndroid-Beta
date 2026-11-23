package l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
public final class g extends q6.h {
    public final z5.b F;

    public g(Context context, Looper looper, ga.d dVar, z5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, dVar, kVar, lVar, 0);
        bVar = bVar == null ? z5.b.f61609c : bVar;
        t1.a aVar = new t1.a(10, (byte) 0);
        aVar.f57641b = Boolean.FALSE;
        z5.b bVar2 = z5.b.f61609c;
        bVar.getClass();
        aVar.f57641b = Boolean.valueOf(bVar.f61610a);
        aVar.f57642c = bVar.f61611b;
        aVar.f57642c = e.a();
        this.F = new z5.b(aVar);
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
        bundle.putBoolean("force_save_dialog", bVar.f61610a);
        bundle.putString("log_session_id", bVar.f61611b);
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
