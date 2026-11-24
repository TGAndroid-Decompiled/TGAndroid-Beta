package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class ls extends AbstractSet {
    public final byte a;
    public final Map b;

    public ls(Map map, byte b) {
        this.a = b;
        this.b = map;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((uja) this.b).put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override
    public final void clear() {
        switch (this.a) {
            case 1:
                ((uja) this.b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((uja) this.b).get(entry.getKey());
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
    public final Iterator iterator() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                return new os((ps) map);
            default:
                return new wja((uja) map);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((uja) this.b).remove(entry.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override
    public final int size() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                return ((ps) map).c;
            default:
                return ((uja) map).size();
        }
    }
}
