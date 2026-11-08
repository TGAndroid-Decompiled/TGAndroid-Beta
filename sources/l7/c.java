package l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;
public final class c extends q6.h {
    public final Bundle F;

    public c(Context context, Looper looper, k kVar, l lVar, q3 q3Var) {
        super(context, looper, 212, q3Var, kVar, lVar, 0);
        this.F = new Bundle();
    }

    @Override
    public final int d() {
        return 17895000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 7);
    }

    @Override
    public final n6.c[] k() {
        return d.f18200b;
    }

    @Override
    public final Bundle m() {
        return this.F;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean x() {
        return true;
    }
}
