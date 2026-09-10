package ji;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f11945a;

    public void a(HashMap hashMap) {
        if (this.f11945a == null) {
            this.f11945a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f11945a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }
}
