package g3;

import android.util.SparseArray;
import j3.r0;
import java.util.HashMap;
import t2.d;
public abstract class a {
    public static final SparseArray f7074a = new SparseArray();
    public static final HashMap f7075b;

    static {
        HashMap hashMap = new HashMap();
        f7075b = hashMap;
        hashMap.put(d.f47601a, 0);
        hashMap.put(d.f47602b, 1);
        hashMap.put(d.f47603c, 2);
        for (d dVar : hashMap.keySet()) {
            f7074a.append(((Integer) f7075b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f7075b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i9) {
        d dVar = (d) f7074a.get(i9);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(r0.l(i9, "Unknown Priority for value "));
    }
}
