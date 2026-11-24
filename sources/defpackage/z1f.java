package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class z1f extends p9a {
    public final byte b = 0;
    public final AbstractMap c;

    public z1f(wjf wjfVar, dq2 dq2Var) {
        super((byte) 1);
        dq2Var.getClass();
        this.c = dq2Var;
    }

    @Override
    public final void clear() {
        switch (this.b) {
            case 0:
                ((d3) this.c).clear();
                return;
            default:
                Iterator it = iterator();
                while (true) {
                    i9f i9fVar = (i9f) it;
                    if (i9fVar.hasNext()) {
                        i9fVar.next();
                        i9fVar.remove();
                    } else {
                        return;
                    }
                }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                try {
                    return ((dq2) ((d3) abstractMap).d).entrySet().contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return ((dq2) abstractMap).containsKey(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.b) {
            case 1:
                return ((dq2) this.c).keySet().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.b) {
            case 1:
                if (this != obj && !((dq2) this.c).keySet().equals(obj)) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.b) {
            case 1:
                return ((dq2) this.c).keySet().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override
    public final boolean isEmpty() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return ((d3) abstractMap).isEmpty();
            default:
                return ((dq2) abstractMap).isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return new c3((d3) abstractMap, (byte) 0);
            default:
                return new i9f(this, ((dq2) abstractMap).entrySet().iterator());
        }
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                dq2 dq2Var = ((wjf) ((d3) abstractMap).e).c;
                dq2Var.getClass();
                try {
                    obj2 = dq2Var.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection != null) {
                    collection.size();
                    collection.clear();
                }
                return true;
            default:
                Collection collection2 = (Collection) ((dq2) abstractMap).remove(obj);
                if (collection2 == null) {
                    return false;
                }
                int size = collection2.size();
                collection2.clear();
                if (size <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.b) {
            case 0:
                try {
                    if (collection != null) {
                        return p2f.a(this, collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    boolean z = false;
                    for (Object obj : collection) {
                        z |= remove(obj);
                    }
                    return z;
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int i;
        switch (this.b) {
            case 0:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    int size = collection.size();
                    if (size < 3) {
                        if (size >= 0) {
                            i = size + 1;
                        } else {
                            u36.j(hg9.j(size, "expectedSize cannot be negative but was: "));
                            return false;
                        }
                    } else if (size < 1073741824) {
                        i = (int) Math.ceil(size / 0.75d);
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                    HashSet hashSet = new HashSet(i);
                    for (Object obj : collection) {
                        if (contains(obj) && (obj instanceof Map.Entry)) {
                            hashSet.add(((Map.Entry) obj).getKey());
                        }
                    }
                    wjf wjfVar = (wjf) ((d3) this.c).e;
                    z1f z1fVar = wjfVar.a;
                    if (z1fVar == null) {
                        z1fVar = new z1f(wjfVar, wjfVar.c);
                        wjfVar.a = z1fVar;
                    }
                    return z1fVar.retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override
    public final int size() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return ((dq2) ((d3) abstractMap).d).size();
            default:
                return ((dq2) abstractMap).size();
        }
    }

    public z1f(d3 d3Var) {
        super((byte) 1);
        this.c = d3Var;
    }
}
