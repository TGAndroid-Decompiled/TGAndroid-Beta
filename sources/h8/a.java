package h8;

import a9.w;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import i8.e;
import java.util.ArrayList;
import k6.f;
import n6.l;
import v7.n8;
import v7.t7;
import v7.z7;
public abstract class a {
    public static boolean f7636a = false;
    public static int f7637b = 1;

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
        synchronized (a.class) {
            try {
                l.h(context, "Context is null");
                Log.d("a", "preferredRenderer: ".concat("null"));
                if (f7636a) {
                    return 0;
                }
                try {
                    e a2 = z7.a(context);
                    try {
                        i8.a X0 = a2.X0();
                        l.g(X0);
                        t7.f50614a = X0;
                        s7.e Z0 = a2.Z0();
                        if (n8.f50520a == null) {
                            l.h(Z0, "delegate must not be null");
                            n8.f50520a = Z0;
                        }
                        f7636a = true;
                        try {
                            Parcel O0 = a2.O0(a2.P0(), 9);
                            int readInt = O0.readInt();
                            O0.recycle();
                            if (readInt == 2) {
                                f7637b = 2;
                            }
                            x6.b bVar = new x6.b(context);
                            Parcel P0 = a2.P0();
                            s7.b.c(P0, bVar);
                            P0.writeInt(0);
                            a2.T0(P0, 10);
                        } catch (RemoteException e) {
                            Log.e("a", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        int i10 = f7637b;
                        if (i10 != 1) {
                            if (i10 != 2) {
                                str = "null";
                            } else {
                                str = "LATEST";
                            }
                        } else {
                            str = "LEGACY";
                        }
                        Log.d("a", "loadedRenderer: ".concat(str));
                        return 0;
                    } catch (RemoteException e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (f e10) {
                    return e10.f10937a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
