package h8;

import a9.w;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import n6.m;
import v7.h8;
import v7.u7;
import v7.u8;
public abstract class e {
    public static boolean f11035a = false;
    public static int f11036b = 1;

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", wVar.f379a);
            bundle.putLong("event_timestamp", wVar.f380b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static synchronized int b(Context context) {
        String str;
        synchronized (e.class) {
            try {
                m.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat("null"));
                if (f11035a) {
                    return 0;
                }
                try {
                    i8.e a2 = h8.a(context);
                    try {
                        i8.a V0 = a2.V0();
                        m.h(V0);
                        u7.f49412a = V0;
                        s7.e X0 = a2.X0();
                        if (u8.f49413a == null) {
                            m.i(X0, "delegate must not be null");
                            u8.f49413a = X0;
                        }
                        f11035a = true;
                        try {
                            Parcel M0 = a2.M0(a2.N0(), 9);
                            int readInt = M0.readInt();
                            M0.recycle();
                            if (readInt == 2) {
                                f11036b = 2;
                            }
                            x6.b bVar = new x6.b(context);
                            Parcel N0 = a2.N0();
                            s7.b.c(N0, bVar);
                            N0.writeInt(0);
                            a2.R0(N0, 10);
                        } catch (RemoteException e7) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e7);
                        }
                        int i10 = f11036b;
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
                    return e11.f14707a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
