package mi;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f14833a;

    public void a(HashMap hashMap) {
        if (this.f14833a == null) {
            this.f14833a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f14833a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }
}
