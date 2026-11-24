package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class ogf implements ngf {
    public final ArrayList a;

    public ogf(Context context, hgf hgfVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        hgfVar.getClass();
        arrayList.add(new ygf(context, hgfVar));
    }

    @Override
    public final void a(ry ryVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ngf) obj).a(ryVar);
        }
    }
}
