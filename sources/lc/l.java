package lc;

import java.util.Arrays;
public final class l {
    public static final char[] f16819r;
    public static final int[] f16820s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f16821a;
    public final b f16822b;
    public k d;
    public j f16827i;
    public final i f16828j;
    public final h f16829k;
    public final d f16830l;
    public final f f16831m;
    public final e f16832n;
    public String f16833o;
    public final int[] f16834p;
    public final int[] f16835q;
    public b2 f16823c = b2.f16770a;
    public boolean f16824e = false;
    public String f16825f = null;
    public final StringBuilder f16826g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f16819r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f16816k = new kc.c();
        this.f16828j = jVar;
        this.f16829k = new j(3);
        this.f16830l = new k(5, 0);
        this.f16831m = new f();
        this.f16832n = new e();
        this.f16834p = new int[1];
        this.f16835q = new int[2];
        this.f16821a = aVar;
        this.f16822b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f16821a.a();
        this.f16823c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f16822b;
        if (bVar.size() < 0) {
            a aVar = this.f16821a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Invalid character reference: %s", aVar.f16768f + aVar.f16767e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: lc.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f16828j;
            jVar.l();
        } else {
            jVar = this.f16829k;
            jVar.c();
        }
        this.f16827i = jVar;
        return jVar;
    }

    public final void e() {
        k.d(this.h);
    }

    public final void f(char c10) {
        g(String.valueOf(c10));
    }

    public final void g(String str) {
        if (this.f16825f == null) {
            this.f16825f = str;
            return;
        }
        StringBuilder sb2 = this.f16826g;
        if (sb2.length() == 0) {
            sb2.append(this.f16825f);
        }
        sb2.append(str);
    }

    public final void h(k kVar) {
        if (!this.f16824e) {
            this.d = kVar;
            this.f16824e = true;
            int i9 = kVar.f16818b;
            if (i9 == 2) {
                this.f16833o = ((i) kVar).f16810c;
                return;
            } else if (i9 == 3 && ((h) kVar).f16816k != null) {
                b bVar = this.f16822b;
                if (bVar.size() < 0) {
                    a aVar = this.f16821a;
                    com.google.android.gms.internal.clearcut.a1 a1Var = new com.google.android.gms.internal.clearcut.a1();
                    a1Var.f3329b = aVar.f16768f + aVar.f16767e;
                    a1Var.f3330c = "Attributes incorrectly present on end tag";
                    bVar.add(a1Var);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("There is an unread token pending!");
    }

    public final void i() {
        h(this.f16832n);
    }

    public final void j() {
        h(this.f16831m);
    }

    public final void k() {
        j jVar = this.f16827i;
        if (jVar.f16811e != null) {
            jVar.k();
        }
        h(this.f16827i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f16822b;
        if (bVar.size() < 0) {
            a aVar = this.f16821a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f16768f + aVar.f16767e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f16822b;
        if (bVar.size() < 0) {
            a aVar = this.f16821a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Unexpected character '%s' in input state [%s]", aVar.f16768f + aVar.f16767e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f16833o != null && this.f16827i.j().equalsIgnoreCase(this.f16833o)) {
            return true;
        }
        return false;
    }
}
