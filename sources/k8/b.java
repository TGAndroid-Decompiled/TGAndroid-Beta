package k8;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c8.d1;
import c8.q9;
import c8.z0;
import l8.d;
import n6.f;
import q6.m;
import v7.e;
public abstract class b {
    public static boolean f17231a = false;
    public static int f17232b = 1;

    public static synchronized int a(Context context) {
        String str;
        synchronized (b.class) {
            try {
                m.h(context, "Context is null");
                Log.d("b", "preferredRenderer: ".concat("null"));
                if (f17231a) {
                    return 0;
                }
                try {
                    d a10 = d1.a(context);
                    try {
                        l8.a x12 = a10.x1();
                        m.g(x12);
                        z0.f5982a = x12;
                        e z12 = a10.z1();
                        if (q9.f5818a == null) {
                            m.h(z12, "delegate must not be null");
                            q9.f5818a = z12;
                        }
                        f17231a = true;
                        try {
                            Parcel o12 = a10.o1(a10.p1(), 9);
                            int readInt = o12.readInt();
                            o12.recycle();
                            if (readInt == 2) {
                                f17232b = 2;
                            }
                            a7.b bVar = new a7.b(context);
                            Parcel p12 = a10.p1();
                            v7.b.c(p12, bVar);
                            p12.writeInt(0);
                            a10.t1(p12, 10);
                        } catch (RemoteException e10) {
                            Log.e("b", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i7 = f17232b;
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
                    return e12.f20502a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
