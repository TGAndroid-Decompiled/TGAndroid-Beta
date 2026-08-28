package g7;

import android.content.Context;
import java.util.ArrayList;
public final class ja implements ia {
    public final ArrayList f7261a;

    public ja(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.f7261a = arrayList;
        haVar.getClass();
        arrayList.add(new la(context, haVar));
    }

    @Override
    public final void a(g5.b bVar) {
        ArrayList arrayList = this.f7261a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((ia) obj).a(bVar);
        }
    }
}
