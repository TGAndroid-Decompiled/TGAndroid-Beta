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
    public final Object f13804a = new Object();
    public final HashMap f13805b = new HashMap();
    public Set f13806c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int f(q2.j jVar) {
        int i7;
        synchronized (this.f13804a) {
            try {
                if (this.f13805b.containsKey(jVar)) {
                    i7 = ((Integer) this.f13805b.get(jVar)).intValue();
                } else {
                    i7 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i7;
    }

    public final void i(q2.j jVar) {
        synchronized (this.f13804a) {
            try {
                Integer num = (Integer) this.f13805b.get(jVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(jVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f13805b.remove(jVar);
                    HashSet hashSet = new HashSet(this.f13806c);
                    hashSet.remove(jVar);
                    this.f13806c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f13805b.put(jVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f13804a) {
            it = this.d.iterator();
        }
        return it;
    }
}
