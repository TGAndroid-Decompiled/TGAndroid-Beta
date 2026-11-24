package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
public final class uja extends AbstractMap {
    public static final int f = 0;
    public List a;
    public Map b;
    public boolean c;
    public volatile ls d;
    public Map e;

    public static uja g() {
        ?? abstractMap = new AbstractMap();
        abstractMap.a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        abstractMap.b = map;
        abstractMap.e = map;
        return abstractMap;
    }

    public final int b(Comparable comparable) {
        int i;
        int size = this.a.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((vja) this.a.get(i2)).a);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((vja) this.a.get(i4)).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void c() {
        if (!this.c) {
            return;
        }
        fvc.b();
    }

    @Override
    public final void clear() {
        c();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (b(comparable) < 0 && !this.b.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Map.Entry d(int i) {
        return (Map.Entry) this.a.get(i);
    }

    public final Set e() {
        if (this.b.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.b.entrySet();
    }

    @Override
    public final Set entrySet() {
        if (this.d == null) {
            this.d = new ls(this, (byte) 1);
        }
        return this.d;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof uja)) {
                return super.equals(obj);
            }
            uja ujaVar = (uja) obj;
            int size = size();
            if (size == ujaVar.size()) {
                int size2 = this.a.size();
                if (size2 != ujaVar.a.size()) {
                    return ((AbstractSet) entrySet()).equals(ujaVar.entrySet());
                }
                for (int i = 0; i < size2; i++) {
                    if (d(i).equals(ujaVar.d(i))) {
                    }
                }
                if (size2 != size) {
                    return this.b.equals(ujaVar.b);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final SortedMap f() {
        c();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    @Override
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        if (b >= 0) {
            return ((vja) this.a.get(b)).b;
        }
        return this.b.get(comparable);
    }

    @Override
    public final Object put(Comparable comparable, Object obj) {
        c();
        int b = b(comparable);
        if (b >= 0) {
            return ((vja) this.a.get(b)).setValue(obj);
        }
        c();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(16);
        }
        int i = -(b + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            vja vjaVar = (vja) this.a.remove(15);
            f().put(vjaVar.a, vjaVar.b);
        }
        this.a.add(i, new vja(this, comparable, obj));
        return null;
    }

    @Override
    public final int hashCode() {
        int size = this.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((vja) this.a.get(i2)).hashCode();
        }
        if (this.b.size() > 0) {
            return this.b.hashCode() + i;
        }
        return i;
    }

    public final Object i(int i) {
        c();
        Object obj = ((vja) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new vja(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        if (b >= 0) {
            return i(b);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    @Override
    public final int size() {
        return this.b.size() + this.a.size();
    }
}
