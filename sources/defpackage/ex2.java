package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class ex2 implements Iterable {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int h(mr3 mr3Var) {
        int i;
        synchronized (this.a) {
            if (this.b.containsKey(mr3Var)) {
                i = ((Integer) this.b.get(mr3Var)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final void i(mr3 mr3Var) {
        synchronized (this.a) {
            Integer num = (Integer) this.b.get(mr3Var);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(mr3Var);
            this.d = DesugarCollections.unmodifiableList(arrayList);
            int intValue = num.intValue();
            HashMap hashMap = this.b;
            if (intValue == 1) {
                hashMap.remove(mr3Var);
                HashSet hashSet = new HashSet(this.c);
                hashSet.remove(mr3Var);
                this.c = DesugarCollections.unmodifiableSet(hashSet);
            } else {
                hashMap.put(mr3Var, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
