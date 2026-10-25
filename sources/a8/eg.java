package a8;

import android.content.Context;
import java.util.ArrayList;
public final class eg implements dg {
    public final ArrayList f440a;

    public eg(Context context, cg cgVar) {
        ArrayList arrayList = new ArrayList();
        this.f440a = arrayList;
        cgVar.getClass();
        arrayList.add(new pg(context, cgVar));
    }

    @Override
    public final void a(ng ngVar) {
        ArrayList arrayList = this.f440a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((dg) obj).a(ngVar);
        }
    }
}
