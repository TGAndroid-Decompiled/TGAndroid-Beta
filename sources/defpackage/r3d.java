package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class r3d extends xx4 {
    public final Bundle F;

    public r3d(ey4 ey4Var, fy4 fy4Var, ntb ntbVar, Context context, Looper looper) {
        super(212, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = new Bundle();
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof l4d) {
            return (l4d) queryLocalInterface;
        }
        return new ezc(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", (byte) 2);
    }

    @Override
    public final f84[] f() {
        return aed.b;
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
