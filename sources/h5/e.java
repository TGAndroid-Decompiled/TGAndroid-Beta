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
    public final Object f7249a = new Object();
    public final HashMap f7250b = new HashMap();
    public Set f7251c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int i(o3.l lVar) {
        int i10;
        synchronized (this.f7249a) {
            try {
                if (this.f7250b.containsKey(lVar)) {
                    i10 = ((Integer) this.f7250b.get(lVar)).intValue();
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
        synchronized (this.f7249a) {
            it = this.d.iterator();
        }
        return it;
    }

    public final void n(o3.l lVar) {
        synchronized (this.f7249a) {
            try {
                Integer num = (Integer) this.f7250b.get(lVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(lVar);
                this.d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f7250b.remove(lVar);
                    HashSet hashSet = new HashSet(this.f7251c);
                    hashSet.remove(lVar);
                    this.f7251c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f7250b.put(lVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
