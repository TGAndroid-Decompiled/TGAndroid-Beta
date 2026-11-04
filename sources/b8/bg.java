package b8;

import android.content.Context;
import java.util.ArrayList;
public final class bg implements ag {
    public final ArrayList f2492a;

    public bg(Context context, zf zfVar) {
        ArrayList arrayList = new ArrayList();
        this.f2492a = arrayList;
        zfVar.getClass();
        arrayList.add(new mg(context, zfVar));
    }

    @Override
    public final void a(kg kgVar) {
        ArrayList arrayList = this.f2492a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((ag) obj).a(kgVar);
        }
    }
}
