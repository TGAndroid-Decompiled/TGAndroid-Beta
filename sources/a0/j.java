package a0;

import java.util.LinkedHashMap;
public class j {
    public final int f19a;
    public final a3.c f20b;
    public final ab.a f21c;
    public int d;
    public int e;
    public int f22f;

    public j(int i10) {
        this.f19a = i10;
        if (i10 > 0) {
            this.f20b = new a3.c();
            this.f21c = new ab.a(3);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f21c) {
            a3.c cVar = this.f20b;
            cVar.getClass();
            Object obj = ((LinkedHashMap) cVar.f46b).get(key);
            if (obj != null) {
                this.e++;
                return obj;
            }
            this.f22f++;
            return null;
        }
    }

    public final Object b(Object key, Object obj) {
        Object put;
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f21c) {
            this.d++;
            a3.c cVar = this.f20b;
            cVar.getClass();
            put = ((LinkedHashMap) cVar.f46b).put(key, obj);
            if (put != null) {
                this.d--;
            }
        }
        c(this.f19a);
        return put;
    }

    public final void c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: a0.j.c(int):void");
    }

    public final String toString() {
        int i10;
        String str;
        synchronized (this.f21c) {
            try {
                int i11 = this.e;
                int i12 = this.f22f + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=" + this.f19a + ",hits=" + this.e + ",misses=" + this.f22f + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
