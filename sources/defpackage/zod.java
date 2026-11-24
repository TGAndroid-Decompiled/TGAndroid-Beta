package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public abstract class zod {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(p8c p8cVar) {
        boolean z;
        if (p8cVar != null && !b) {
            ArrayList arrayList = e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                e = arrayList;
            }
            arrayList.add(p8cVar);
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
            Utilities.e.c(new jc((byte) 12));
        }
    }

    public static void c(e01 e01Var) {
        if (e01Var != null && e01Var.d != null) {
            b();
            e01 e01Var2 = (e01) d.get(e01Var.a);
            if (e01Var2 != null) {
                e01Var2.d = e01Var.d;
            } else {
                c.add(e01Var);
                d.put(e01Var.a, e01Var);
            }
            gl.r(new jc((byte) 11));
            gl.e3(new jc((byte) 11), 1000L);
        }
    }
}
