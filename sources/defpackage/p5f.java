package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class p5f implements z5f {
    public final ArrayList a;

    public p5f(Context context, i5f i5fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        i5fVar.getClass();
        arrayList.add(new s6f(context, i5fVar));
    }

    @Override
    public final void a(ry ryVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((z5f) obj).a(ryVar);
        }
    }
}
