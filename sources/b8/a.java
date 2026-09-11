package b8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;
public final class a extends n6.g {
    public final Context U;

    public a(Context context, Looper looper, k kVar, l lVar, p3 p3Var) {
        super(context, looper, 45, p3Var, kVar, lVar, 0);
        this.U = context;
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
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new d(iBinder);
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
