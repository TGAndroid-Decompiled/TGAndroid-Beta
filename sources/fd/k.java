package fd;

import java.util.Arrays;
public final class k {
    public static final char[] f9120r;
    public static final int[] f9121s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f9122a;
    public final b f9123b;
    public f2.e d;
    public j f9127i;
    public final i f9128j;
    public final h f9129k;
    public final d f9130l;
    public final f f9131m;
    public final e f9132n;
    public String f9133o;
    public final int[] f9134p;
    public final int[] f9135q;
    public a2 f9124c = a2.f9076a;
    public boolean e = false;
    public String f9125f = null;
    public final StringBuilder f9126g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f9120r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f9119k = new ed.c();
        this.f9128j = jVar;
        this.f9129k = new j(3);
        this.f9130l = new f2.e(5, 1);
        this.f9131m = new f();
        this.f9132n = new e();
        this.f9134p = new int[1];
        this.f9135q = new int[2];
        this.f9122a = aVar;
        this.f9123b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f9122a.a();
        this.f9124c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f9123b;
        if (bVar.size() < 0) {
            a aVar = this.f9122a;
            bVar.add(new ba.a("Invalid character reference: %s", aVar.f9074f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: fd.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f9128j;
            jVar.k();
        } else {
            jVar = this.f9129k;
            jVar.b();
        }
        this.f9127i = jVar;
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
            int i10 = eVar.f8841b;
            if (i10 == 2) {
                this.f9133o = ((i) eVar).f9114c;
                return;
            } else if (i10 == 3 && ((h) eVar).f9119k != null) {
                b bVar = this.f9123b;
                if (bVar.size() < 0) {
                    a aVar = this.f9122a;
                    ba.a aVar2 = new ba.a();
                    aVar2.f2614c = aVar.f9074f + aVar.e;
                    aVar2.f2613b = "Attributes incorrectly present on end tag";
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
        if (this.f9125f == null) {
            this.f9125f = str;
            return;
        }
        StringBuilder sb2 = this.f9126g;
        if (sb2.length() == 0) {
            sb2.append(this.f9125f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f9132n);
    }

    public final void j() {
        g(this.f9131m);
    }

    public final void k() {
        j jVar = this.f9127i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f9127i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f9123b;
        if (bVar.size() < 0) {
            a aVar = this.f9122a;
            bVar.add(new ba.a("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f9074f + aVar.e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f9123b;
        if (bVar.size() < 0) {
            a aVar = this.f9122a;
            bVar.add(new ba.a("Unexpected character '%s' in input state [%s]", aVar.f9074f + aVar.e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f9133o != null && this.f9127i.i().equalsIgnoreCase(this.f9133o)) {
            return true;
        }
        return false;
    }
}
