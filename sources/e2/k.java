package e2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class k implements Iterable {
    public final Object f8364a = new Object();
    public final HashMap f8365b = new HashMap();
    public Set f8366c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int h(n2.j jVar) {
        int i10;
        synchronized (this.f8364a) {
            try {
                if (this.f8365b.containsKey(jVar)) {
                    i10 = ((Integer) this.f8365b.get(jVar)).intValue();
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
        synchronized (this.f8364a) {
            it = this.d.iterator();
        }
        return it;
    }

    public final void m(n2.j jVar) {
        synchronized (this.f8364a) {
            try {
                Integer num = (Integer) this.f8365b.get(jVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(jVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f8365b.remove(jVar);
                    HashSet hashSet = new HashSet(this.f8366c);
                    hashSet.remove(jVar);
                    this.f8366c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f8365b.put(jVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
