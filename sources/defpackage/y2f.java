package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class y2f implements q2f {
    public final ArrayList a;

    public y2f(Context context, l2f l2fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        l2fVar.getClass();
        arrayList.add(new v3f(context, l2fVar));
    }

    @Override
    public final void a(rhb rhbVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((q2f) obj).a(rhbVar);
        }
    }
}
