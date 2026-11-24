package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class n6d extends xx4 {
    public final Context F;

    public n6d(ey4 ey4Var, fy4 fy4Var, ntb ntbVar, Context context, Looper looper) {
        super(45, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = context;
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (queryLocalInterface instanceof hce) {
            return (hce) queryLocalInterface;
        }
        return new hce(iBinder);
    }

    @Override
    public final int i() {
        return 12200000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
