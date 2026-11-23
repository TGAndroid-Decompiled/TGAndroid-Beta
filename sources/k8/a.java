package k8;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c8.e1;
import c8.k1;
import c8.s9;
import l8.d;
import n6.f;
import q6.m;
import v7.e;
public abstract class a {
    public static boolean f18278a = false;
    public static int f18279b = 1;

    public static synchronized int a(Context context) {
        String str;
        synchronized (a.class) {
            try {
                m.i(context, "Context is null");
                Log.d("a", "preferredRenderer: ".concat("null"));
                if (f18278a) {
                    return 0;
                }
                try {
                    d a10 = k1.a(context);
                    try {
                        l8.a x12 = a10.x1();
                        m.h(x12);
                        e1.f4541a = x12;
                        e z12 = a10.z1();
                        if (s9.f4949a == null) {
                            m.i(z12, "delegate must not be null");
                            s9.f4949a = z12;
                        }
                        f18278a = true;
                        try {
                            Parcel o12 = a10.o1(a10.p1(), 9);
                            int readInt = o12.readInt();
                            o12.recycle();
                            if (readInt == 2) {
                                f18279b = 2;
                            }
                            a7.b bVar = new a7.b(context);
                            Parcel p12 = a10.p1();
                            v7.b.c(p12, bVar);
                            p12.writeInt(0);
                            a10.t1(p12, 10);
                        } catch (RemoteException e10) {
                            Log.e("a", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i7 = f18279b;
                        if (i7 != 1) {
                            if (i7 != 2) {
                                str = "null";
                            } else {
                                str = "LATEST";
                            }
                        } else {
                            str = "LEGACY";
                        }
                        Log.d("a", "loadedRenderer: ".concat(str));
                        return 0;
                    } catch (RemoteException e11) {
                        throw new RuntimeException(e11);
                    }
                } catch (f e12) {
                    return e12.f21528a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
