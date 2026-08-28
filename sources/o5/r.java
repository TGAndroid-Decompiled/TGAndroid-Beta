package o5;

import android.util.LruCache;
import java.util.ArrayList;
public final class r extends LruCache {
    public final c f19008a;

    public r(c cVar) {
        super(20);
        this.f19008a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f19008a.f18963g;
        Integer num = (Integer) obj;
        m5.o oVar = (m5.o) obj2;
        m5.o oVar2 = (m5.o) obj3;
        if (!z10) {
            return;
        }
        x5.l.h(arrayList);
        arrayList.add(num);
    }
}
