package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
public abstract class v8d {
    public static final ce6 a = new ce6("CastDynamiteModule", null);

    public static o9d a(Context context, le1 le1Var, qed qedVar, HashMap hashMap) {
        o9d f1dVar;
        q9d b = b(context);
        eq7 eq7Var = new eq7(context.getApplicationContext());
        Parcel R = b.R();
        kid.d(R, eq7Var);
        kid.c(R, le1Var);
        kid.d(R, qedVar);
        R.writeMap(hashMap);
        Parcel T = b.T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = k9d.b;
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof o9d) {
                f1dVar = (o9d) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", (byte) 3);
            }
        }
        T.recycle();
        return f1dVar;
    }

    public static q9d b(Context context) {
        try {
            IBinder b = nt3.c(context, nt3.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof q9d) {
                return (q9d) queryLocalInterface;
            }
            return new f1d(b, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", (byte) 3);
        } catch (kt3 e) {
            throw new Exception(e);
        }
    }
}
