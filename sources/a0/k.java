package a0;

import java.util.LinkedHashMap;
public class k {
    public final int f22a;
    public final a6.i f23b;
    public final rb.a f24c;
    public int d;
    public int e;
    public int f25f;

    public k(int i10) {
        this.f22a = i10;
        if (i10 > 0) {
            this.f23b = new a6.i(6);
            this.f24c = new rb.a(3);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f24c) {
            a6.i iVar = this.f23b;
            iVar.getClass();
            Object obj = ((LinkedHashMap) iVar.f303b).get(key);
            if (obj != null) {
                this.e++;
                return obj;
            }
            this.f25f++;
            return null;
        }
    }

    public final Object b(Object key, Object obj) {
        Object put;
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f24c) {
            this.d++;
            a6.i iVar = this.f23b;
            iVar.getClass();
            put = ((LinkedHashMap) iVar.f303b).put(key, obj);
            if (put != null) {
                this.d--;
            }
        }
        c(this.f22a);
        return put;
    }

    public final void c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: a0.k.c(int):void");
    }

    public final String toString() {
        int i10;
        String str;
        synchronized (this.f24c) {
            try {
                int i11 = this.e;
                int i12 = this.f25f + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=" + this.f22a + ",hits=" + this.e + ",misses=" + this.f25f + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
