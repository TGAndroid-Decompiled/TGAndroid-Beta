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
    public final Object f8361a = new Object();
    public final HashMap f8362b = new HashMap();
    public Set f8363c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int h(n2.k kVar) {
        int i10;
        synchronized (this.f8361a) {
            try {
                if (this.f8362b.containsKey(kVar)) {
                    i10 = ((Integer) this.f8362b.get(kVar)).intValue();
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
        synchronized (this.f8361a) {
            it = this.d.iterator();
        }
        return it;
    }

    public final void m(n2.k kVar) {
        synchronized (this.f8361a) {
            try {
                Integer num = (Integer) this.f8362b.get(kVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(kVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f8362b.remove(kVar);
                    HashSet hashSet = new HashSet(this.f8363c);
                    hashSet.remove(kVar);
                    this.f8363c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f8362b.put(kVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
