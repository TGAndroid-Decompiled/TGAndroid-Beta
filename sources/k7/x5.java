package k7;

import android.os.Bundle;
import java.util.ArrayList;
public abstract class x5 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o8.s sVar = (o8.s) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", sVar.f16661a);
            bundle.putLong("event_timestamp", sVar.f16662b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
