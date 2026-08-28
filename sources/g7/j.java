package g7;

import android.os.Bundle;
import java.util.ArrayList;
public abstract class j {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            k8.t tVar = (k8.t) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", tVar.f14705a);
            bundle.putLong("event_timestamp", tVar.f14706b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
