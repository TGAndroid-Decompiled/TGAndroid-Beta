package g3;

import android.util.SparseArray;
import java.util.HashMap;
import t2.d;

public abstract class a {

    public static final SparseArray f6352a = new SparseArray();

    public static final HashMap f6353b;

    static {
        HashMap map = new HashMap();
        f6353b = map;
        map.put(d.f48012a, 0);
        map.put(d.f48013b, 1);
        map.put(d.f48014c, 2);
        for (d dVar : map.keySet()) {
            f6352a.append(((Integer) f6353b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f6353b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f6352a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(i0.a.k(i10, "Unknown Priority for value "));
    }
}
