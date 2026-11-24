package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
public abstract class gl8 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(fl8.a, 0);
        hashMap.put(fl8.b, 1);
        hashMap.put(fl8.c, 2);
        for (fl8 fl8Var : hashMap.keySet()) {
            a.append(((Integer) b.get(fl8Var)).intValue(), fl8Var);
        }
    }

    public static int a(fl8 fl8Var) {
        Integer num = (Integer) b.get(fl8Var);
        if (num != null) {
            return num.intValue();
        }
        zo4.j(fl8Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static fl8 b(int i) {
        fl8 fl8Var = (fl8) a.get(i);
        if (fl8Var != null) {
            return fl8Var;
        }
        u36.j(hg9.j(i, "Unknown Priority for value "));
        return null;
    }
}
