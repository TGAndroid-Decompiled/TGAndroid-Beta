package a0;

import java.util.LinkedHashMap;
import t7.u;
public class k {
    public final int f24a;
    public final xa.c f25b;
    public final u f26c;
    public int d;
    public int f27e;
    public int f28f;

    public k(int i10) {
        this.f24a = i10;
        if (i10 > 0) {
            this.f25b = new xa.c(5);
            this.f26c = new u(3);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f26c) {
            xa.c cVar = this.f25b;
            cVar.getClass();
            Object obj = ((LinkedHashMap) cVar.f49360b).get(key);
            if (obj != null) {
                this.f27e++;
                return obj;
            }
            this.f28f++;
            return null;
        }
    }

    public final Object b(Object key, Object obj) {
        Object put;
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f26c) {
            this.d++;
            xa.c cVar = this.f25b;
            cVar.getClass();
            put = ((LinkedHashMap) cVar.f49360b).put(key, obj);
            if (put != null) {
                this.d--;
            }
        }
        c(this.f24a);
        return put;
    }

    public final void c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: a0.k.c(int):void");
    }

    public final String toString() {
        int i10;
        String str;
        synchronized (this.f26c) {
            try {
                int i11 = this.f27e;
                int i12 = this.f28f + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=" + this.f24a + ",hits=" + this.f27e + ",misses=" + this.f28f + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
