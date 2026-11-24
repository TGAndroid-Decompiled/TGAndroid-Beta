package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public abstract class crd {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(qac qacVar) {
        boolean z;
        if (qacVar != null && !b) {
            ArrayList arrayList = e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                e = arrayList;
            }
            arrayList.add(qacVar);
            z = true;
        } else {
            z = false;
        }
        b();
        if (z) {
            return null;
        }
        return c;
    }

    public static void b() {
        if (!a && !b) {
            a = true;
            c = new ArrayList();
            d = new LongSparseArray();
            Utilities.e.c(new jd((byte) 12));
        }
    }

    public static void c(m11 m11Var) {
        if (m11Var != null && m11Var.d != null) {
            b();
            m11 m11Var2 = (m11) d.get(m11Var.a);
            if (m11Var2 != null) {
                m11Var2.d = m11Var.d;
            } else {
                c.add(m11Var);
                d.put(m11Var.a, m11Var);
            }
            gm.r(new jd((byte) 11));
            gm.d3(new jd((byte) 11), 1000L);
        }
    }
}
