package a0;

import d7.u;
import java.util.LinkedHashMap;
public class j {
    public final int f21a;
    public final k5.i f22b;
    public final u f23c;
    public int d;
    public int f24e;
    public int f25f;

    public j(int i9) {
        this.f21a = i9;
        if (i9 > 0) {
            this.f22b = new k5.i(4);
            this.f23c = new u(3);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f23c) {
            k5.i iVar = this.f22b;
            iVar.getClass();
            Object obj = ((LinkedHashMap) iVar.f14659b).get(key);
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
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f23c) {
            this.d++;
            k5.i iVar = this.f22b;
            iVar.getClass();
            put = ((LinkedHashMap) iVar.f14659b).put(key, obj);
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
        int i9;
        String str;
        synchronized (this.f23c) {
            try {
                int i10 = this.f24e;
                int i11 = this.f25f + i10;
                if (i11 != 0) {
                    i9 = (i10 * 100) / i11;
                } else {
                    i9 = 0;
                }
                str = "LruCache[maxSize=" + this.f21a + ",hits=" + this.f24e + ",misses=" + this.f25f + ",hitRate=" + i9 + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
