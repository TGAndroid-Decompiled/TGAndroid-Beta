package a8;

import android.os.Bundle;
import java.util.ArrayList;
public abstract class s9 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d9.t tVar = (d9.t) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", tVar.f7642a);
            bundle.putLong("event_timestamp", tVar.f7643b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
