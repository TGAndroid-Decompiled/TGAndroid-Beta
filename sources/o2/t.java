package o2;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
public final class t {
    public SparseArray f17109a;

    public void a(HashMap hashMap) {
        if (this.f17109a == null) {
            this.f17109a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f17109a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }
}
