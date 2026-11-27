package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
public abstract class mbd {
    public static final he6 a = new he6("CastDynamiteModule", null);

    public static fcd a(Context context, ld1 ld1Var, hhd hhdVar, HashMap hashMap) {
        fcd v3dVar;
        hcd b = b(context);
        br7 br7Var = new br7(context.getApplicationContext());
        Parcel R = b.R();
        ald.d(R, br7Var);
        ald.c(R, ld1Var);
        ald.d(R, hhdVar);
        R.writeMap(hashMap);
        Parcel T = b.T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = bcd.b;
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof fcd) {
                v3dVar = (fcd) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", (byte) 3);
            }
        }
        T.recycle();
        return v3dVar;
    }

    public static hcd b(Context context) {
        try {
            IBinder b = vs3.c(context, vs3.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof hcd) {
                return (hcd) queryLocalInterface;
            }
            return new v3d(b, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", (byte) 3);
        } catch (ss3 e) {
            throw new Exception(e);
        }
    }
}
