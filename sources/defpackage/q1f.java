package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class q1f implements g2f {
    public final ArrayList a;

    public q1f(Context context, y0f y0fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        y0fVar.getClass();
        arrayList.add(new k3f(context, y0fVar));
    }

    @Override
    public final void a(rx rxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((g2f) obj).a(rxVar);
        }
    }
}
