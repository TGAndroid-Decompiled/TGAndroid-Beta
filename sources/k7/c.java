package k7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
public final class c extends p6.h {
    public final Bundle F;

    public c(Context context, Looper looper, k kVar, l lVar, o3 o3Var) {
        super(context, looper, 212, o3Var, kVar, lVar, 0);
        this.F = new Bundle();
    }

    @Override
    public final int d() {
        return 17895000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new b8.a(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 6);
    }

    @Override
    public final m6.c[] i() {
        return d.f16902b;
    }

    @Override
    public final Bundle k() {
        return this.F;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final boolean w() {
        return true;
    }
}
