package fd;

import java.util.Arrays;
public final class k {
    public static final char[] f9123r;
    public static final int[] f9124s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f9125a;
    public final b f9126b;
    public f2.e d;
    public j f9130i;
    public final i f9131j;
    public final h f9132k;
    public final d f9133l;
    public final f f9134m;
    public final e f9135n;
    public String f9136o;
    public final int[] f9137p;
    public final int[] f9138q;
    public a2 f9127c = a2.f9079a;
    public boolean e = false;
    public String f9128f = null;
    public final StringBuilder f9129g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f9123r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f9122k = new ed.c();
        this.f9131j = jVar;
        this.f9132k = new j(3);
        this.f9133l = new f2.e(5, 1);
        this.f9134m = new f();
        this.f9135n = new e();
        this.f9137p = new int[1];
        this.f9138q = new int[2];
        this.f9125a = aVar;
        this.f9126b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f9125a.a();
        this.f9127c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f9126b;
        if (bVar.size() < 0) {
            a aVar = this.f9125a;
            bVar.add(new ba.a("Invalid character reference: %s", aVar.f9077f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: fd.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f9131j;
            jVar.k();
        } else {
            jVar = this.f9132k;
            jVar.b();
        }
        this.f9130i = jVar;
        return jVar;
    }

    public final void e() {
        f2.e.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(f2.e eVar) {
        if (!this.e) {
            this.d = eVar;
            this.e = true;
            int i10 = eVar.f8844b;
            if (i10 == 2) {
                this.f9136o = ((i) eVar).f9117c;
                return;
            } else if (i10 == 3 && ((h) eVar).f9122k != null) {
                b bVar = this.f9126b;
                if (bVar.size() < 0) {
                    a aVar = this.f9125a;
                    ba.a aVar2 = new ba.a();
                    aVar2.f2618c = aVar.f9077f + aVar.e;
                    aVar2.f2617b = "Attributes incorrectly present on end tag";
                    bVar.add(aVar2);
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
        if (this.f9128f == null) {
            this.f9128f = str;
            return;
        }
        StringBuilder sb2 = this.f9129g;
        if (sb2.length() == 0) {
            sb2.append(this.f9128f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f9135n);
    }

    public final void j() {
        g(this.f9134m);
    }

    public final void k() {
        j jVar = this.f9130i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f9130i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f9126b;
        if (bVar.size() < 0) {
            a aVar = this.f9125a;
            bVar.add(new ba.a("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f9077f + aVar.e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f9126b;
        if (bVar.size() < 0) {
            a aVar = this.f9125a;
            bVar.add(new ba.a("Unexpected character '%s' in input state [%s]", aVar.f9077f + aVar.e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f9136o != null && this.f9130i.i().equalsIgnoreCase(this.f9136o)) {
            return true;
        }
        return false;
    }
}
