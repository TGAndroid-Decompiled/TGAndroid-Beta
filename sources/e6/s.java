package e6;

import android.util.LruCache;
import java.util.ArrayList;
public final class s extends LruCache {
    public final c f8703a;

    public s(c cVar) {
        super(20);
        this.f8703a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f8703a.f8655g;
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
