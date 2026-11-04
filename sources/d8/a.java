package d8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import p6.h;
public final class a extends h {
    public final Context F;

    public a(Context context, Looper looper, k kVar, l lVar, o3 o3Var) {
        super(context, looper, 45, o3Var, kVar, lVar, 0);
        this.F = context;
    }

    @Override
    public final int d() {
        return 12200000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
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
    public final String n() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override
    public final boolean w() {
        return true;
    }
}
