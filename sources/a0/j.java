package a0;

import java.util.LinkedHashMap;
public class j {
    public final int f21a;
    public final ja.c f22b;
    public final ab.a f23c;
    public int d;
    public int f24e;
    public int f25f;

    public j(int i10) {
        this.f21a = i10;
        if (i10 > 0) {
            this.f22b = new ja.c(4);
            this.f23c = new ab.a(3);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f23c) {
            ja.c cVar = this.f22b;
            cVar.getClass();
            Object obj = ((LinkedHashMap) cVar.f9988a).get(key);
            if (obj != null) {
                this.f24e++;
                return obj;
            }
            this.f25f++;
            return null;
        }
    }

    public final Object b(Object key, Object obj) {
        Object put;
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f23c) {
            this.d++;
            ja.c cVar = this.f22b;
            cVar.getClass();
            put = ((LinkedHashMap) cVar.f9988a).put(key, obj);
            if (put != null) {
                this.d--;
            }
        }
        c(this.f21a);
        return put;
    }

    public final void c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: a0.j.c(int):void");
    }

    public final String toString() {
        int i10;
        String str;
        synchronized (this.f23c) {
            try {
                int i11 = this.f24e;
                int i12 = this.f25f + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=" + this.f21a + ",hits=" + this.f24e + ",misses=" + this.f25f + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
