package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8323r;
    public static final int[] f8324s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8325a;
    public final b f8326b;
    public k d;
    public j f8331i;
    public final i f8332j;
    public final h f8333k;
    public final d f8334l;
    public final f f8335m;
    public final e f8336n;
    public String f8337o;
    public final int[] f8338p;
    public final int[] f8339q;
    public b2 f8327c = b2.f8274a;
    public boolean f8328e = false;
    public String f8329f = null;
    public final StringBuilder f8330g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8323r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8320k = new cd.c();
        this.f8332j = jVar;
        this.f8333k = new j(3);
        this.f8334l = new k(5, 0);
        this.f8335m = new f();
        this.f8336n = new e();
        this.f8338p = new int[1];
        this.f8339q = new int[2];
        this.f8325a = aVar;
        this.f8326b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8325a.a();
        this.f8327c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8326b;
        if (bVar.size() < 0) {
            a aVar = this.f8325a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8272f + aVar.f8271e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8332j;
            jVar.k();
        } else {
            jVar = this.f8333k;
            jVar.b();
        }
        this.f8331i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8328e) {
            this.d = kVar;
            this.f8328e = true;
            int i7 = kVar.f8322b;
            if (i7 == 2) {
                this.f8337o = ((i) kVar).f8314c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8320k != null) {
                b bVar = this.f8326b;
                if (bVar.size() < 0) {
                    a aVar = this.f8325a;
                    com.google.android.gms.internal.clearcut.y0 y0Var = new com.google.android.gms.internal.clearcut.y0(1);
                    y0Var.f6967b = aVar.f8272f + aVar.f8271e;
                    y0Var.f6968c = "Attributes incorrectly present on end tag";
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
        if (this.f8329f == null) {
            this.f8329f = str;
            return;
        }
        StringBuilder sb2 = this.f8330g;
        if (sb2.length() == 0) {
            sb2.append(this.f8329f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8336n);
    }

    public final void j() {
        g(this.f8335m);
    }

    public final void k() {
        j jVar = this.f8331i;
        if (jVar.f8315e != null) {
            jVar.j();
        }
        g(this.f8331i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8326b;
        if (bVar.size() < 0) {
            a aVar = this.f8325a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8272f + aVar.f8271e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8326b;
        if (bVar.size() < 0) {
            a aVar = this.f8325a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8272f + aVar.f8271e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8337o != null && this.f8331i.i().equalsIgnoreCase(this.f8337o)) {
            return true;
        }
        return false;
    }
}
