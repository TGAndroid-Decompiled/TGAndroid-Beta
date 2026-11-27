package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public abstract class ptd {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(pcc pccVar) {
        boolean z;
        if (pccVar != null && !b) {
            ArrayList arrayList = e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                e = arrayList;
            }
            arrayList.add(pccVar);
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
            Utilities.e.c(new kc((byte) 12));
        }
    }

    public static void c(n01 n01Var) {
        if (n01Var != null && n01Var.d != null) {
            b();
            n01 n01Var2 = (n01) d.get(n01Var.a);
            if (n01Var2 != null) {
                n01Var2.d = n01Var.d;
            } else {
                c.add(n01Var);
                d.put(n01Var.a, n01Var);
            }
            hl.r(new kc((byte) 11));
            hl.d3(new kc((byte) 11), 1000L);
        }
    }
}
