package a0;

import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.h1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public class a extends AbstractSet {
    public final int f0a;
    public final Map f1b;

    public a(int i10, Map map) {
        this.f0a = i10;
        this.f1b = map;
    }

    @Override
    public boolean add(Object obj) {
        switch (this.f0a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((d1) this.f1b).f((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override
    public void clear() {
        switch (this.f0a) {
            case 1:
                ((d1) this.f1b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f0a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((d1) this.f1b).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override
    public Iterator iterator() {
        switch (this.f0a) {
            case 0:
                return new d((f) this.f1b);
            default:
                return new h1((d1) this.f1b);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f0a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((d1) this.f1b).remove(entry.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f0a) {
            case 0:
                return ((f) this.f1b).f31c;
            default:
                return ((d1) this.f1b).size();
        }
    }
}
