package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class vi6 {
    public static final ie5 a;

    static {
        Object obj;
        int i = ifb.a;
        try {
            System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            it.getClass();
            Iterator it2 = u6a.a(new cu2(new v6a(it, (byte) 1))).iterator();
            if (!it2.hasNext()) {
                obj = null;
            } else {
                Object next = it2.next();
                if (it2.hasNext()) {
                    ((cl) next).getClass();
                    do {
                        ((cl) it2.next()).getClass();
                    } while (it2.hasNext());
                    obj = next;
                } else {
                    obj = next;
                }
            }
            if (((cl) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    a = new ie5(je5.a(mainLooper), false);
                    return;
                } else {
                    dq9.m("The main looper is not available");
                    return;
                }
            }
            dq9.m("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
