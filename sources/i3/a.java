package i3;

import android.util.SparseArray;
import java.util.HashMap;
import kh.a2;
import v2.d;
public abstract class a {
    public static final SparseArray f7238a = new SparseArray();
    public static final HashMap f7239b;

    static {
        HashMap hashMap = new HashMap();
        f7239b = hashMap;
        hashMap.put(d.f45560a, 0);
        hashMap.put(d.f45561b, 1);
        hashMap.put(d.f45562c, 2);
        for (d dVar : hashMap.keySet()) {
            f7238a.append(((Integer) f7239b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f7239b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f7238a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(a2.j(i10, "Unknown Priority for value "));
    }
}
