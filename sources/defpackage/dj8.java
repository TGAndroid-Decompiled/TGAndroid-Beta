package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
public abstract class dj8 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(cj8.a, 0);
        hashMap.put(cj8.b, 1);
        hashMap.put(cj8.c, 2);
        for (cj8 cj8Var : hashMap.keySet()) {
            a.append(((Integer) b.get(cj8Var)).intValue(), cj8Var);
        }
    }

    public static int a(cj8 cj8Var) {
        Integer num = (Integer) b.get(cj8Var);
        if (num != null) {
            return num.intValue();
        }
        wn4.i(cj8Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static cj8 b(int i) {
        cj8 cj8Var = (cj8) a.get(i);
        if (cj8Var != null) {
            return cj8Var;
        }
        w26.j(de9.k(i, "Unknown Priority for value "));
        return null;
    }
}
