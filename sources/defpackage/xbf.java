package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class xbf implements Iterator {
    public Map.Entry a;
    public final Iterator b;

    public xbf(o4f o4fVar, Iterator it) {
        this.b = it;
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override
    public final void remove() {
        boolean z;
        Map.Entry entry = this.a;
        if (entry != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Collection collection = (Collection) entry.getValue();
            this.b.remove();
            collection.size();
            collection.clear();
            this.a = null;
            return;
        }
        grb.i("no calls to next() since the last call to remove()");
    }
}
