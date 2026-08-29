package i3;

import android.util.SparseArray;
import j7.l1;
import java.util.HashMap;
import v2.d;
public abstract class a {
    public static final SparseArray f8213a = new SparseArray();
    public static final HashMap f8214b;

    static {
        HashMap hashMap = new HashMap();
        f8214b = hashMap;
        hashMap.put(d.f49328a, 0);
        hashMap.put(d.f49329b, 1);
        hashMap.put(d.f49330c, 2);
        for (d dVar : hashMap.keySet()) {
            f8213a.append(((Integer) f8214b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f8214b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f8213a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(l1.k(i10, "Unknown Priority for value "));
    }
}
