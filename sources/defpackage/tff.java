package defpackage;

import android.util.LruCache;
import java.util.ArrayList;
public final class tff extends LruCache {
    public final bu6 a;

    public tff(bu6 bu6Var) {
        super(20);
        this.a = bu6Var;
    }

    @Override
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.a.g;
        Integer num = (Integer) obj;
        eu6 eu6Var = (eu6) obj2;
        eu6 eu6Var2 = (eu6) obj3;
        if (!z) {
            return;
        }
        xve.h(arrayList);
        arrayList.add(num);
    }
}
