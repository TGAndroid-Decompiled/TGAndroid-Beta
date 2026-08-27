package a0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class j {

    public final int f21a;

    public final ga.c f22b;

    public final xa.a f23c;
    public int d;

    public int f24e;

    public int f25f;

    public j(int i10) {
        this.f21a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f22b = new ga.c(4);
        this.f23c = new xa.a(2);
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f23c) {
            ga.c cVar = this.f22b;
            cVar.getClass();
            Object obj = ((LinkedHashMap) cVar.f6834b).get(key);
            if (obj != null) {
                this.f24e++;
                return obj;
            }
            this.f25f++;
            return null;
        }
    }

    public final Object b(Object key, Object obj) {
        Object objPut;
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f23c) {
            this.d++;
            ga.c cVar = this.f22b;
            cVar.getClass();
            objPut = ((LinkedHashMap) cVar.f6834b).put(key, obj);
            if (objPut != null) {
                this.d--;
            }
        }
        c(this.f21a);
        return objPut;
    }

    public final void c(int i10) {
        while (true) {
            synchronized (this.f23c) {
                try {
                    if (this.d < 0 || (((LinkedHashMap) this.f22b.f6834b).isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i10 && !((LinkedHashMap) this.f22b.f6834b).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) this.f22b.f6834b).entrySet();
                        kotlin.jvm.internal.j.d(setEntrySet, "map.entries");
                        Object next = null;
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it = setEntrySet.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        ga.c cVar = this.f22b;
                        cVar.getClass();
                        kotlin.jvm.internal.j.e(key, "key");
                        ((LinkedHashMap) cVar.f6834b).remove(key);
                        int i11 = this.d;
                        kotlin.jvm.internal.j.e(value, "value");
                        this.d = i11 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f23c) {
            try {
                int i10 = this.f24e;
                int i11 = this.f25f + i10;
                str = "LruCache[maxSize=" + this.f21a + ",hits=" + this.f24e + ",misses=" + this.f25f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
