package mi;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f14810a;

    public void a(HashMap hashMap) {
        if (this.f14810a == null) {
            this.f14810a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f14810a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }
}
