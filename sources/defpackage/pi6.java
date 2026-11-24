package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public abstract class pi6 {
    public static boolean a = false;
    public static int b = 1;
    public static final cff c = new cff((byte) 16);

    public static synchronized int a(Context context) {
        String str;
        synchronized (pi6.class) {
            fre.i(context, "Context is null");
            Log.d("pi6", "preferredRenderer: null");
            if (a) {
                return 0;
            }
            try {
                itd a2 = u0f.a(context);
                try {
                    hbd Z = a2.Z();
                    fre.h(Z);
                    hqd.a = Z;
                    phe b0 = a2.b0();
                    if (eod.a == null) {
                        fre.i(b0, "delegate must not be null");
                        eod.a = b0;
                    }
                    a = true;
                    try {
                        Parcel Q = a2.Q(a2.R(), 9);
                        int readInt = Q.readInt();
                        Q.recycle();
                        if (readInt == 2) {
                            b = 2;
                        }
                        bo7 bo7Var = new bo7(context);
                        Parcel R = a2.R();
                        sgd.c(R, bo7Var);
                        R.writeInt(0);
                        a2.V(R, 10);
                    } catch (RemoteException e) {
                        Log.e("pi6", "Failed to retrieve renderer type or log initialization.", e);
                    }
                    int i = b;
                    if (i != 1) {
                        if (i != 2) {
                            str = "null";
                        } else {
                            str = "LATEST";
                        }
                    } else {
                        str = "LEGACY";
                    }
                    Log.d("pi6", "loadedRenderer: ".concat(str));
                    return 0;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (xy4 e3) {
                return e3.a;
            }
        }
    }
}
