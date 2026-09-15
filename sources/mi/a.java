package mi;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f14835a;

    public void a(HashMap hashMap) {
        if (this.f14835a == null) {
            this.f14835a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f14835a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }
}
