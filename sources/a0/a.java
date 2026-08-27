package a0;

import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.h1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class a extends AbstractSet {

    public final int f0a;

    public final Map f1b;

    public a(Map map, int i10) {
        this.f0a = i10;
        this.f1b = map;
    }

    @Override
    public boolean add(Object obj) {
        switch (this.f0a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((d1) this.f1b).f((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override
    public void clear() {
        switch (this.f0a) {
            case 1:
                ((d1) this.f1b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f0a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((d1) this.f1b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
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
                if (!contains(entry)) {
                    return false;
                }
                ((d1) this.f1b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f0a) {
            case 0:
                return ((f) this.f1b).f28c;
            default:
                return ((d1) this.f1b).size();
        }
    }
}
