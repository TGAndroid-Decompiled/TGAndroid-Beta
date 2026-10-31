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
    public final Object f6155a = new Object();
    public final HashMap f6156b = new HashMap();
    public Set f6157c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    @Override
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f6155a) {
            it = this.d.iterator();
        }
        return it;
    }

    public final int l(n2.j jVar) {
        int i10;
        synchronized (this.f6155a) {
            try {
                if (this.f6156b.containsKey(jVar)) {
                    i10 = ((Integer) this.f6156b.get(jVar)).intValue();
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final void m(n2.j jVar) {
        synchronized (this.f6155a) {
            try {
                Integer num = (Integer) this.f6156b.get(jVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(jVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f6156b.remove(jVar);
                    HashSet hashSet = new HashSet(this.f6157c);
                    hashSet.remove(jVar);
                    this.f6157c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f6156b.put(jVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
