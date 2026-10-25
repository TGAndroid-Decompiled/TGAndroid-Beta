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
    public final Object f9676a = new Object();
    public final HashMap f9677b = new HashMap();
    public Set f9678c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int h(n2.j jVar) {
        int i10;
        synchronized (this.f9676a) {
            try {
                if (this.f9677b.containsKey(jVar)) {
                    i10 = ((Integer) this.f9677b.get(jVar)).intValue();
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
        synchronized (this.f9676a) {
            it = this.d.iterator();
        }
        return it;
    }

    public final void m(n2.j jVar) {
        synchronized (this.f9676a) {
            try {
                Integer num = (Integer) this.f9677b.get(jVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(jVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f9677b.remove(jVar);
                    HashSet hashSet = new HashSet(this.f9678c);
                    hashSet.remove(jVar);
                    this.f9678c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f9677b.put(jVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
