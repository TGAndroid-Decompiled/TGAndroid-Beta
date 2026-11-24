package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class p8d extends zz4 {
    public final Context F;

    public p8d(f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(45, f05Var, g05Var, ovbVar, context, looper);
        this.F = context;
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (queryLocalInterface instanceof iee) {
            return (iee) queryLocalInterface;
        }
        return new iee(iBinder);
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
