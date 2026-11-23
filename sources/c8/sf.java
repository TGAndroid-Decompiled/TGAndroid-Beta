package c8;

import android.content.Context;
import java.util.ArrayList;
public final class sf implements rf {
    public final ArrayList f4987a;

    public sf(Context context, qf qfVar) {
        ArrayList arrayList = new ArrayList();
        this.f4987a = arrayList;
        qfVar.getClass();
        arrayList.add(new vf(context, qfVar));
    }

    @Override
    public final void a(a8.xa xaVar) {
        ArrayList arrayList = this.f4987a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((rf) obj).a(xaVar);
        }
    }
}
