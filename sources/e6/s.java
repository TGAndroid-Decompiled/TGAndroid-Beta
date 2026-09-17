package e6;

import android.util.LruCache;
import java.util.ArrayList;
public final class s extends LruCache {
    public final c f8903a;

    public s(c cVar) {
        super(20);
        this.f8903a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f8903a.f8855g;
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
