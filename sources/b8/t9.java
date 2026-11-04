package b8;

import android.os.Bundle;
import java.util.ArrayList;
public abstract class t9 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            c9.t tVar = (c9.t) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", tVar.f4281a);
            bundle.putLong("event_timestamp", tVar.f4282b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
