package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
public abstract class uye {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zzc zzcVar = (zzc) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", zzcVar.a);
            bundle.putLong("event_timestamp", zzcVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
