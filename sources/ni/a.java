package ni;

import ai.h7;
import android.util.SparseArray;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class a {
    public SparseArray f16871a;

    public final void a(HashMap hashMap) {
        if (this.f16871a == null) {
            this.f16871a = new SparseArray(hashMap.size());
            ArrayList arrayList = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList, Comparator$CC.comparingInt(new h7(4)));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Map.Entry entry = (Map.Entry) obj;
                this.f16871a.append(((String) entry.getKey()).hashCode(), (String) entry.getValue());
            }
            return;
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f16871a.put(((String) entry2.getKey()).hashCode(), (String) entry2.getValue());
        }
    }
}
