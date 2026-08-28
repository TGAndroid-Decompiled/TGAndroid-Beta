package h7;

import android.content.Context;
import java.util.ArrayList;
public final class ha implements ja {
    public final ArrayList f9948a;

    public ha(Context context, ga gaVar) {
        ArrayList arrayList = new ArrayList();
        this.f9948a = arrayList;
        gaVar.getClass();
        arrayList.add(new la(context, gaVar));
    }

    @Override
    public final void a(a6.a aVar) {
        ArrayList arrayList = this.f9948a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((ja) obj).a(aVar);
        }
    }
}
