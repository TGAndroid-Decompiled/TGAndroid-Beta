package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class n3f implements x3f {
    public final ArrayList a;

    public n3f(Context context, g3f g3fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        g3fVar.getClass();
        arrayList.add(new q4f(context, g3fVar));
    }

    @Override
    public final void a(qx qxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((x3f) obj).a(qxVar);
        }
    }
}
