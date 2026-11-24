package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class t5d extends zz4 {
    public final Bundle F;

    public t5d(f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(212, f05Var, g05Var, ovbVar, context, looper);
        this.F = new Bundle();
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof n6d) {
            return (n6d) queryLocalInterface;
        }
        return new f1d(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", (byte) 2);
    }

    @Override
    public final o94[] f() {
        return bgd.b;
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
