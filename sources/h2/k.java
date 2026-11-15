package h2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class k implements Iterable {
    public final Object f13460a = new Object();
    public final HashMap f13461b = new HashMap();
    public Set f13462c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int f(q2.k kVar) {
        int i7;
        synchronized (this.f13460a) {
            try {
                if (this.f13461b.containsKey(kVar)) {
                    i7 = ((Integer) this.f13461b.get(kVar)).intValue();
                } else {
                    i7 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i7;
    }

    public final void i(q2.k kVar) {
        synchronized (this.f13460a) {
            try {
                Integer num = (Integer) this.f13461b.get(kVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(kVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f13461b.remove(kVar);
                    HashSet hashSet = new HashSet(this.f13462c);
                    hashSet.remove(kVar);
                    this.f13462c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f13461b.put(kVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f13460a) {
            it = this.d.iterator();
        }
        return it;
    }
}
