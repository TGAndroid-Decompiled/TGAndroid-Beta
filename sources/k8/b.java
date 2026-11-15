package k8;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c8.b1;
import c8.f1;
import c8.p9;
import l8.d;
import n6.f;
import q6.m;
import v7.e;
public abstract class b {
    public static boolean f17790a = false;
    public static int f17791b = 1;

    public static synchronized int a(Context context) {
        String str;
        synchronized (b.class) {
            try {
                m.h(context, "Context is null");
                Log.d("b", "preferredRenderer: ".concat("null"));
                if (f17790a) {
                    return 0;
                }
                try {
                    d a10 = f1.a(context);
                    try {
                        l8.a x12 = a10.x1();
                        m.g(x12);
                        b1.f4207a = x12;
                        e z12 = a10.z1();
                        if (p9.f4624a == null) {
                            m.h(z12, "delegate must not be null");
                            p9.f4624a = z12;
                        }
                        f17790a = true;
                        try {
                            Parcel o12 = a10.o1(a10.p1(), 9);
                            int readInt = o12.readInt();
                            o12.recycle();
                            if (readInt == 2) {
                                f17791b = 2;
                            }
                            a7.b bVar = new a7.b(context);
                            Parcel p12 = a10.p1();
                            v7.b.c(p12, bVar);
                            p12.writeInt(0);
                            a10.t1(p12, 10);
                        } catch (RemoteException e10) {
                            Log.e("b", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i7 = f17791b;
                        if (i7 != 1) {
                            if (i7 != 2) {
                                str = "null";
                            } else {
                                str = "LATEST";
                            }
                        } else {
                            str = "LEGACY";
                        }
                        Log.d("b", "loadedRenderer: ".concat(str));
                        return 0;
                    } catch (RemoteException e11) {
                        throw new RuntimeException(e11);
                    }
                } catch (f e12) {
                    return e12.f21071a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
