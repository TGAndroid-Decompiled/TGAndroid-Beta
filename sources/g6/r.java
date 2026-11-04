package g6;

import android.util.LruCache;
import java.util.ArrayList;
public final class r extends LruCache {
    public final c f12032a;

    public r(c cVar) {
        super(20);
        this.f12032a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f12032a.f11985g;
        Integer num = (Integer) obj;
        e6.o oVar = (e6.o) obj2;
        e6.o oVar2 = (e6.o) obj3;
        if (!z10) {
            return;
        }
        p6.m.g(arrayList);
        arrayList.add(num);
    }
}
