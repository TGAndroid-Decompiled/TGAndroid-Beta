package i8;

import a8.dd;
import a8.od;
import a8.vc;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Date;
import o6.l;
public abstract class e {
    public static boolean f13886a = false;
    public static int f13887b = 1;

    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date b(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }

    public static synchronized int c(Context context) {
        String str;
        synchronized (e.class) {
            try {
                l.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat("null"));
                if (f13886a) {
                    return 0;
                }
                try {
                    j8.e a2 = dd.a(context);
                    try {
                        j8.a V0 = a2.V0();
                        l.h(V0);
                        vc.f969a = V0;
                        t7.e X0 = a2.X0();
                        if (od.f654a == null) {
                            l.i(X0, "delegate must not be null");
                            od.f654a = X0;
                        }
                        f13886a = true;
                        try {
                            Parcel M0 = a2.M0(a2.N0(), 9);
                            int readInt = M0.readInt();
                            M0.recycle();
                            if (readInt == 2) {
                                f13887b = 2;
                            }
                            y6.b bVar = new y6.b(context);
                            Parcel N0 = a2.N0();
                            t7.b.c(N0, bVar);
                            N0.writeInt(0);
                            a2.R0(N0, 10);
                        } catch (RemoteException e) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        int i10 = f13887b;
                        if (i10 != 1) {
                            if (i10 != 2) {
                                str = "null";
                            } else {
                                str = "LATEST";
                            }
                        } else {
                            str = "LEGACY";
                        }
                        Log.d("e", "loadedRenderer: ".concat(str));
                        return 0;
                    } catch (RemoteException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (l6.f e11) {
                    return e11.f16932a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
