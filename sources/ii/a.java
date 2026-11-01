package ii;

import android.util.SparseArray;
import bi.t6;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f8584a;

    public final void a(HashMap hashMap) {
        if (this.f8584a == null) {
            this.f8584a = new SparseArray(hashMap.size());
            ArrayList arrayList = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList, Comparator$CC.comparingInt(new t6(1)));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Map.Entry entry = (Map.Entry) obj;
                this.f8584a.append(((String) entry.getKey()).hashCode(), (String) entry.getValue());
            }
            return;
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f8584a.put(((String) entry2.getKey()).hashCode(), (String) entry2.getValue());
        }
    }
}
