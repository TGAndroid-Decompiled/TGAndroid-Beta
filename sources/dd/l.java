package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8320r;
    public static final int[] f8321s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8322a;
    public final b f8323b;
    public k d;
    public j f8328i;
    public final i f8329j;
    public final h f8330k;
    public final d f8331l;
    public final f f8332m;
    public final e f8333n;
    public String f8334o;
    public final int[] f8335p;
    public final int[] f8336q;
    public b2 f8324c = b2.f8271a;
    public boolean f8325e = false;
    public String f8326f = null;
    public final StringBuilder f8327g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8320r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8317k = new cd.c();
        this.f8329j = jVar;
        this.f8330k = new j(3);
        this.f8331l = new k(5, 0);
        this.f8332m = new f();
        this.f8333n = new e();
        this.f8335p = new int[1];
        this.f8336q = new int[2];
        this.f8322a = aVar;
        this.f8323b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8322a.a();
        this.f8324c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8323b;
        if (bVar.size() < 0) {
            a aVar = this.f8322a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8269f + aVar.f8268e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8329j;
            jVar.k();
        } else {
            jVar = this.f8330k;
            jVar.b();
        }
        this.f8328i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8325e) {
            this.d = kVar;
            this.f8325e = true;
            int i7 = kVar.f8319b;
            if (i7 == 2) {
                this.f8334o = ((i) kVar).f8311c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8317k != null) {
                b bVar = this.f8323b;
                if (bVar.size() < 0) {
                    a aVar = this.f8322a;
                    com.google.android.gms.internal.clearcut.y0 y0Var = new com.google.android.gms.internal.clearcut.y0(1);
                    y0Var.f6964b = aVar.f8269f + aVar.f8268e;
                    y0Var.f6965c = "Attributes incorrectly present on end tag";
                    bVar.add(y0Var);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("There is an unread token pending!");
    }

    public final void h(String str) {
        if (this.f8326f == null) {
            this.f8326f = str;
            return;
        }
        StringBuilder sb2 = this.f8327g;
        if (sb2.length() == 0) {
            sb2.append(this.f8326f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8333n);
    }

    public final void j() {
        g(this.f8332m);
    }

    public final void k() {
        j jVar = this.f8328i;
        if (jVar.f8312e != null) {
            jVar.j();
        }
        g(this.f8328i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8323b;
        if (bVar.size() < 0) {
            a aVar = this.f8322a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8269f + aVar.f8268e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8323b;
        if (bVar.size() < 0) {
            a aVar = this.f8322a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8269f + aVar.f8268e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8334o != null && this.f8328i.i().equalsIgnoreCase(this.f8334o)) {
            return true;
        }
        return false;
    }
}
