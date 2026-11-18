package h6;

import android.util.LruCache;
import java.util.ArrayList;
public final class s extends LruCache {
    public final c f13947a;

    public s(c cVar) {
        super(20);
        this.f13947a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f13947a.f13897g;
        Integer num = (Integer) obj;
        f6.o oVar = (f6.o) obj2;
        f6.o oVar2 = (f6.o) obj3;
        if (!z10) {
            return;
        }
        q6.m.h(arrayList);
        arrayList.add(num);
    }
}
