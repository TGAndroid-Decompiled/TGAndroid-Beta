package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class e8f implements o8f {
    public final ArrayList a;

    public e8f(Context context, y7f y7fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        y7fVar.getClass();
        arrayList.add(new h9f(context, y7fVar));
    }

    @Override
    public final void a(rx rxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o8f) obj).a(rxVar);
        }
    }
}
