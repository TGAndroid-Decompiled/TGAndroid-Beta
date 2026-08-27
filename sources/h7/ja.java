package h7;

import android.content.Context;
import java.util.ArrayList;

public final class ja implements ia {

    public final ArrayList f8431a;

    public ja(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.f8431a = arrayList;
        haVar.getClass();
        arrayList.add(new la(context, haVar));
    }

    @Override
    public final void a(g5.b bVar) {
        ArrayList arrayList = this.f8431a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ia) obj).a(bVar);
        }
    }
}
