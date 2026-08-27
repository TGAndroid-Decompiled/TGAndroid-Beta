package o5;

import android.util.LruCache;
import java.util.ArrayList;

public final class q extends LruCache {

    public final c f19354a;

    public q(c cVar) {
        super(20);
        this.f19354a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.f19354a.f19310g;
        Integer num = (Integer) obj;
        if (z10) {
            y5.l.h(arrayList);
            arrayList.add(num);
        }
    }
}
