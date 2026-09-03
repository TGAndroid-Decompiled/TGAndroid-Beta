package i3;

import android.util.SparseArray;
import java.util.HashMap;
import v2.d;
public abstract class a {
    public static final SparseArray f7784a = new SparseArray();
    public static final HashMap f7785b;

    static {
        HashMap hashMap = new HashMap();
        f7785b = hashMap;
        hashMap.put(d.f48886a, 0);
        hashMap.put(d.f48887b, 1);
        hashMap.put(d.f48888c, 2);
        for (d dVar : hashMap.keySet()) {
            f7784a.append(((Integer) f7785b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f7785b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f7784a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(l.d.j(i10, "Unknown Priority for value "));
    }
}
