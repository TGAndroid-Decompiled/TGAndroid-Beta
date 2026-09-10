package e6;

import android.util.LruCache;
import java.util.ArrayList;
public final class s extends LruCache {
    public final c f7340a;

    public s(c cVar) {
        super(20);
        this.f7340a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f7340a.f7294g;
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
