package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class ug6 {
    public static final kc5 a;

    static {
        Object obj;
        int i = hdb.a;
        try {
            System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            it.getClass();
            Iterator it2 = s4a.a(new rs2(new t4a(it, (byte) 1))).iterator();
            if (!it2.hasNext()) {
                obj = null;
            } else {
                Object next = it2.next();
                if (it2.hasNext()) {
                    ((ck) next).getClass();
                    do {
                        ((ck) it2.next()).getClass();
                    } while (it2.hasNext());
                    obj = next;
                } else {
                    obj = next;
                }
            }
            if (((ck) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    a = new kc5(lc5.a(mainLooper), false);
                    return;
                } else {
                    sc8.j("The main looper is not available");
                    return;
                }
            }
            sc8.j("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
