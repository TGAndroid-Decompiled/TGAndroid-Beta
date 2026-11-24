package defpackage;

import android.util.LruCache;
import java.util.ArrayList;
public final class dbf extends LruCache {
    public final wr6 a;

    public dbf(wr6 wr6Var) {
        super(20);
        this.a = wr6Var;
    }

    @Override
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.a.g;
        Integer num = (Integer) obj;
        zr6 zr6Var = (zr6) obj2;
        zr6 zr6Var2 = (zr6) obj3;
        if (!z) {
            return;
        }
        fre.h(arrayList);
        arrayList.add(num);
    }
}
