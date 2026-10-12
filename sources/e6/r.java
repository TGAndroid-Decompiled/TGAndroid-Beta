package e6;

import android.util.LruCache;
import java.util.ArrayList;
public final class r extends LruCache {
    public final c f8512a;

    public r(c cVar) {
        super(20);
        this.f8512a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f8512a.f8469g;
        Integer num = (Integer) obj;
        c6.o oVar = (c6.o) obj2;
        c6.o oVar2 = (c6.o) obj3;
        if (!z10) {
            return;
        }
        n6.l.h(arrayList);
        arrayList.add(num);
    }
}
