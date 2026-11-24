package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class nef implements mef {
    public final ArrayList a;

    public nef(Context context, gef gefVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        gefVar.getClass();
        arrayList.add(new xef(context, gefVar));
    }

    @Override
    public final void a(qx qxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((mef) obj).a(qxVar);
        }
    }
}
