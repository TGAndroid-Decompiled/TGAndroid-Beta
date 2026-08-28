package j7;

import android.content.Context;
import java.util.ArrayList;
public final class uf implements tf {
    public final ArrayList f14118a;

    public uf(Context context, sf sfVar) {
        ArrayList arrayList = new ArrayList();
        this.f14118a = arrayList;
        sfVar.getClass();
        arrayList.add(new xf(context, sfVar));
    }

    @Override
    public final void a(a6.a aVar) {
        ArrayList arrayList = this.f14118a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((tf) obj).a(aVar);
        }
    }
}
