package f6;

import android.util.LruCache;
import java.util.ArrayList;
public final class s extends LruCache {
    public final c f10238a;

    public s(c cVar) {
        super(20);
        this.f10238a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f10238a.f10193g;
        Integer num = (Integer) obj;
        d6.o oVar = (d6.o) obj2;
        d6.o oVar2 = (d6.o) obj3;
        if (!z10) {
            return;
        }
        o6.l.h(arrayList);
        arrayList.add(num);
    }
}
