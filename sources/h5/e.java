package h5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class e implements Iterable {
    public final Object f6935a = new Object();
    public final HashMap f6936b = new HashMap();
    public Set f6937c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int i(o3.m mVar) {
        int i10;
        synchronized (this.f6935a) {
            try {
                if (this.f6936b.containsKey(mVar)) {
                    i10 = ((Integer) this.f6936b.get(mVar)).intValue();
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f6935a) {
            it = this.d.iterator();
        }
        return it;
    }

    public final void n(o3.m mVar) {
        synchronized (this.f6935a) {
            try {
                Integer num = (Integer) this.f6936b.get(mVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(mVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f6936b.remove(mVar);
                    HashSet hashSet = new HashSet(this.f6937c);
                    hashSet.remove(mVar);
                    this.f6937c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f6936b.put(mVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
