package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
public final class gbd extends d05 {
    public final Context F;

    public gbd(k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(45, k05Var, l05Var, oxbVar, context, looper);
        this.F = context;
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (queryLocalInterface instanceof xge) {
            return (xge) queryLocalInterface;
        }
        return new xge(iBinder);
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
