package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class n5f implements f5f {
    public final ArrayList a;

    public n5f(Context context, b5f b5fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        b5fVar.getClass();
        arrayList.add(new k6f(context, b5fVar));
    }

    @Override
    public final void a(zhc zhcVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f5f) obj).a(zhcVar);
        }
    }
}
