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
    public final Object f8248a = new Object();
    public final HashMap f8249b = new HashMap();
    public Set f8250c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int h(n2.k kVar) {
        int i10;
        synchronized (this.f8248a) {
            try {
                if (this.f8249b.containsKey(kVar)) {
                    i10 = ((Integer) this.f8249b.get(kVar)).intValue();
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
        synchronized (this.f8248a) {
            it = this.d.iterator();
        }
        return it;
    }

    public final void m(n2.k kVar) {
        synchronized (this.f8248a) {
            try {
                Integer num = (Integer) this.f8249b.get(kVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(kVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f8249b.remove(kVar);
                    HashSet hashSet = new HashSet(this.f8250c);
                    hashSet.remove(kVar);
                    this.f8250c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f8249b.put(kVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
