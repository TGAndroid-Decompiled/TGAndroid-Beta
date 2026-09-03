package i3;

import android.util.SparseArray;
import java.util.HashMap;
import kf.k0;
import v2.d;
public abstract class a {
    public static final SparseArray f7221a = new SparseArray();
    public static final HashMap f7222b;

    static {
        HashMap hashMap = new HashMap();
        f7222b = hashMap;
        hashMap.put(d.f45624a, 0);
        hashMap.put(d.f45625b, 1);
        hashMap.put(d.f45626c, 2);
        for (d dVar : hashMap.keySet()) {
            f7221a.append(((Integer) f7222b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f7222b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f7221a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(k0.j(i10, "Unknown Priority for value "));
    }
}
