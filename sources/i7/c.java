package i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
public final class c extends n6.g {
    public final Bundle U;

    public c(Context context, Looper looper, k kVar, l lVar, s3 s3Var) {
        super(context, looper, 212, s3Var, kVar, lVar, 0);
        this.U = new Bundle();
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int l() {
        return 17895000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 5);
    }

    @Override
    public final k6.c[] r() {
        return d.f12731b;
    }

    @Override
    public final Bundle t() {
        return this.U;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override
    public final boolean y() {
        return true;
    }
}
