package i7;

import android.os.Bundle;
import java.util.ArrayList;
public abstract class a0 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m8.t tVar = (m8.t) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", tVar.f16926a);
            bundle.putLong("event_timestamp", tVar.f16927b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
