package mi;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f14845a;

    public void a(HashMap hashMap) {
        if (this.f14845a == null) {
            this.f14845a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f14845a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }
}
