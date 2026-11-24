package defpackage;

import java.util.LinkedHashMap;
public class fg6 {
    public final byte a;
    public final z24 b;
    public final ie7 c;
    public int d;
    public int e;
    public int f;

    public fg6(int i) {
        this.a = i;
        if (i > 0) {
            this.b = new z24((byte) 14);
            this.c = new ie7((byte) 21);
            return;
        }
        w26.j("maxSize <= 0");
        throw null;
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            Object obj2 = ((LinkedHashMap) this.b.b).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        synchronized (this.c) {
            this.d++;
            put = ((LinkedHashMap) this.b.b).put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        c(this.a);
        return put;
    }

    public final void c(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg6.c(int):void");
    }

    public final String toString() {
        int i;
        String str;
        synchronized (this.c) {
            int i2 = this.e;
            int i3 = this.f + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + ((int) this.a) + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + i + "%]";
        }
        return str;
    }
}
