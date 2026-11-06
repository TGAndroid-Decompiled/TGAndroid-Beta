package h6;

import android.util.LruCache;
import java.util.ArrayList;
public final class r extends LruCache {
    public final c f14273a;

    public r(c cVar) {
        super(20);
        this.f14273a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z9, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f14273a.f14226g;
        Integer num = (Integer) obj;
        f6.o oVar = (f6.o) obj2;
        f6.o oVar2 = (f6.o) obj3;
        if (!z9) {
            return;
        }
        q6.m.g(arrayList);
        arrayList.add(num);
    }
}
