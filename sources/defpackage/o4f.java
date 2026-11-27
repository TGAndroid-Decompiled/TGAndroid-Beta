package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class o4f extends fba {
    public final byte b = 0;
    public final AbstractMap c;

    public o4f(lmf lmfVar, lp2 lp2Var) {
        super((byte) 1);
        lp2Var.getClass();
        this.c = lp2Var;
    }

    @Override
    public final void clear() {
        switch (this.b) {
            case 0:
                ((e3) this.c).clear();
                return;
            default:
                Iterator it = iterator();
                while (true) {
                    xbf xbfVar = (xbf) it;
                    if (xbfVar.hasNext()) {
                        xbfVar.next();
                        xbfVar.remove();
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
                    return ((lp2) ((e3) abstractMap).d).entrySet().contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return ((lp2) abstractMap).containsKey(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.b) {
            case 1:
                return ((lp2) this.c).keySet().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override
    public final boolean equals(Object obj) {
        switch (this.b) {
            case 1:
                if (this != obj && !((lp2) this.c).keySet().equals(obj)) {
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
                return ((lp2) this.c).keySet().hashCode();
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
                return ((e3) abstractMap).isEmpty();
            default:
                return ((lp2) abstractMap).isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return new d3((e3) abstractMap, (byte) 0);
            default:
                return new xbf(this, ((lp2) abstractMap).entrySet().iterator());
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
                lp2 lp2Var = ((lmf) ((e3) abstractMap).e).c;
                lp2Var.getClass();
                try {
                    obj2 = lp2Var.remove(key);
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
                Collection collection2 = (Collection) ((lp2) abstractMap).remove(obj);
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
                        return g5f.a(this, collection);
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
                            lq5.j(uh9.k(size, "expectedSize cannot be negative but was: "));
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
                    lmf lmfVar = (lmf) ((e3) this.c).e;
                    o4f o4fVar = lmfVar.a;
                    if (o4fVar == null) {
                        o4fVar = new o4f(lmfVar, lmfVar.c);
                        lmfVar.a = o4fVar;
                    }
                    return o4fVar.retainAll(hashSet);
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
                return ((lp2) ((e3) abstractMap).d).size();
            default:
                return ((lp2) abstractMap).size();
        }
    }

    public o4f(e3 e3Var) {
        super((byte) 1);
        this.c = e3Var;
    }
}
