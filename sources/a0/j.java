package a0;

import java.util.LinkedHashMap;
public class j {
    public final int f22a;
    public final ob.c f23b;
    public final pb.b f24c;
    public int d;
    public int f25e;
    public int f26f;

    public j(int i7) {
        this.f22a = i7;
        if (i7 > 0) {
            this.f23b = new ob.c(7);
            this.f24c = new pb.b(4);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f24c) {
            ob.c cVar = this.f23b;
            cVar.getClass();
            Object obj = ((LinkedHashMap) cVar.f21780b).get(key);
            if (obj != null) {
                this.f25e++;
                return obj;
            }
            this.f26f++;
            return null;
        }
    }

    public final Object b(Object key, Object obj) {
        Object put;
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f24c) {
            this.d++;
            ob.c cVar = this.f23b;
            cVar.getClass();
            put = ((LinkedHashMap) cVar.f21780b).put(key, obj);
            if (put != null) {
                this.d--;
            }
        }
        c(this.f22a);
        return put;
    }

    public final void c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: a0.j.c(int):void");
    }

    public final String toString() {
        int i7;
        String str;
        synchronized (this.f24c) {
            try {
                int i10 = this.f25e;
                int i11 = this.f26f + i10;
                if (i11 != 0) {
                    i7 = (i10 * 100) / i11;
                } else {
                    i7 = 0;
                }
                str = "LruCache[maxSize=" + this.f22a + ",hits=" + this.f25e + ",misses=" + this.f26f + ",hitRate=" + i7 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
