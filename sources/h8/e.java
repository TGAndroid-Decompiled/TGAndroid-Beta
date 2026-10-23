package h8;

import a9.w;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import n6.l;
import v7.a8;
import v7.o8;
import v7.s7;
public abstract class e {
    public static boolean f11686a = false;
    public static int f11687b = 1;

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", wVar.f357a);
            bundle.putLong("event_timestamp", wVar.f358b);
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
                if (f11686a) {
                    return 0;
                }
                try {
                    i8.e a2 = a8.a(context);
                    try {
                        i8.a V0 = a2.V0();
                        l.h(V0);
                        s7.f48144a = V0;
                        s7.e X0 = a2.X0();
                        if (o8.f48113a == null) {
                            l.i(X0, "delegate must not be null");
                            o8.f48113a = X0;
                        }
                        f11686a = true;
                        try {
                            Parcel M0 = a2.M0(a2.N0(), 9);
                            int readInt = M0.readInt();
                            M0.recycle();
                            if (readInt == 2) {
                                f11687b = 2;
                            }
                            x6.b bVar = new x6.b(context);
                            Parcel N0 = a2.N0();
                            s7.b.c(N0, bVar);
                            N0.writeInt(0);
                            a2.R0(N0, 10);
                        } catch (RemoteException e) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        int i10 = f11687b;
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
                    } catch (RemoteException e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (k6.f e10) {
                    return e10.f14974a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
