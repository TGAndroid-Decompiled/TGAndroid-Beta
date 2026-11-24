package defpackage;

import android.util.LruCache;
import java.util.ArrayList;
public final class edf extends LruCache {
    public final xt6 a;

    public edf(xt6 xt6Var) {
        super(20);
        this.a = xt6Var;
    }

    @Override
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.a.g;
        Integer num = (Integer) obj;
        au6 au6Var = (au6) obj2;
        au6 au6Var2 = (au6) obj3;
        if (!z) {
            return;
        }
        ite.h(arrayList);
        arrayList.add(num);
    }
}
