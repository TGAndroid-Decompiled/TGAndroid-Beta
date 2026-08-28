package l7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;
import x5.g;
public final class a extends g {
    public final Context Q;

    public a(Context context, Looper looper, k kVar, l lVar, t3 t3Var) {
        super(context, looper, 45, t3Var, kVar, lVar, 0);
        this.Q = context;
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int l() {
        return 12200000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override
    public final String v() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.safetynet.service.START";
    }
}
