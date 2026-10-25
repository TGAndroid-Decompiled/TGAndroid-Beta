package a8;

import android.os.Bundle;
import java.util.ArrayList;
public abstract class r9 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b9.u uVar = (b9.u) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", uVar.f3716a);
            bundle.putLong("event_timestamp", uVar.f3717b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
