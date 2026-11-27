package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class i8d extends d05 {
    public final Bundle F;

    public i8d(k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(212, k05Var, l05Var, oxbVar, context, looper);
        this.F = new Bundle();
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof c9d) {
            return (c9d) queryLocalInterface;
        }
        return new v3d(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", (byte) 2);
    }

    @Override
    public final a94[] f() {
        return rid.b;
    }

    @Override
    public final Bundle h() {
        return this.F;
    }

    @Override
    public final int i() {
        return 17895000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean x() {
        return true;
    }
}
