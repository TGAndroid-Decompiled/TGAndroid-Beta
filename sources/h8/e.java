package h8;

import a9.v;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import n6.l;
import v7.j8;
import v7.s8;
import v7.w7;
public abstract class e {
    public static boolean f10902a = false;
    public static int f10903b = 1;

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", vVar.f366a);
            bundle.putLong("event_timestamp", vVar.f367b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static synchronized int b(Context context) {
        String str;
        synchronized (e.class) {
            try {
                l.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat("null"));
                if (f10902a) {
                    return 0;
                }
                try {
                    i8.e a2 = j8.a(context);
                    try {
                        i8.a W0 = a2.W0();
                        l.h(W0);
                        w7.f47653a = W0;
                        s7.e Y0 = a2.Y0();
                        if (s8.f47571a == null) {
                            l.i(Y0, "delegate must not be null");
                            s8.f47571a = Y0;
                        }
                        f10902a = true;
                        try {
                            Parcel N0 = a2.N0(a2.O0(), 9);
                            int readInt = N0.readInt();
                            N0.recycle();
                            if (readInt == 2) {
                                f10903b = 2;
                            }
                            x6.b bVar = new x6.b(context);
                            Parcel O0 = a2.O0();
                            s7.b.c(O0, bVar);
                            O0.writeInt(0);
                            a2.S0(O0, 10);
                        } catch (RemoteException e7) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e7);
                        }
                        int i10 = f10903b;
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
                } catch (k6.f e11) {
                    return e11.f14817a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
