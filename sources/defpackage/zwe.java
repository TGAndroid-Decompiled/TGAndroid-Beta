package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class zwe implements oxe {
    public final ArrayList a;

    public zwe(Context context, hwe hweVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        hweVar.getClass();
        arrayList.add(new tye(context, hweVar));
    }

    @Override
    public final void a(qx qxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((oxe) obj).a(qxVar);
        }
    }
}
