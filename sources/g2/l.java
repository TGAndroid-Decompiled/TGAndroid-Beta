package g2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class l implements Iterable {
    public final Object f11861a = new Object();
    public final HashMap f11862b = new HashMap();
    public Set f11863c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int h(p2.j jVar) {
        int i3;
        synchronized (this.f11861a) {
            try {
                if (this.f11862b.containsKey(jVar)) {
                    i3 = ((Integer) this.f11862b.get(jVar)).intValue();
                } else {
                    i3 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i3;
    }

    public final void i(p2.j jVar) {
        synchronized (this.f11861a) {
            try {
                Integer num = (Integer) this.f11862b.get(jVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(jVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f11862b.remove(jVar);
                    HashSet hashSet = new HashSet(this.f11863c);
                    hashSet.remove(jVar);
                    this.f11863c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f11862b.put(jVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f11861a) {
            it = this.d.iterator();
        }
        return it;
    }
}
