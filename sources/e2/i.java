package e2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class i implements Iterable {
    public final Object f7888a = new Object();
    public final HashMap f7889b = new HashMap();
    public Set f7890c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int i(n2.j jVar) {
        int i10;
        synchronized (this.f7888a) {
            try {
                if (this.f7889b.containsKey(jVar)) {
                    i10 = ((Integer) this.f7889b.get(jVar)).intValue();
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
        synchronized (this.f7888a) {
            it = this.d.iterator();
        }
        return it;
    }

    public final void n(n2.j jVar) {
        synchronized (this.f7888a) {
            try {
                Integer num = (Integer) this.f7889b.get(jVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(jVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f7889b.remove(jVar);
                    HashSet hashSet = new HashSet(this.f7890c);
                    hashSet.remove(jVar);
                    this.f7890c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f7889b.put(jVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
