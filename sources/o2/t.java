package o2;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
public final class t {
    public SparseArray f17100a;

    public void a(HashMap hashMap) {
        if (this.f17100a == null) {
            this.f17100a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f17100a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }
}
