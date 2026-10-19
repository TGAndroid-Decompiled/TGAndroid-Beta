package fd;

import java.util.Arrays;
public final class k {
    public static final char[] f10565r;
    public static final int[] f10566s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f10567a;
    public final b f10568b;
    public f2.f d;
    public j f10572i;
    public final i f10573j;
    public final h f10574k;
    public final d f10575l;
    public final f f10576m;
    public final e f10577n;
    public String f10578o;
    public final int[] f10579p;
    public final int[] f10580q;
    public a2 f10569c = a2.f10521a;
    public boolean e = false;
    public String f10570f = null;
    public final StringBuilder f10571g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f10565r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f10564k = new ed.c();
        this.f10573j = jVar;
        this.f10574k = new j(3);
        this.f10575l = new f2.f(5, 1);
        this.f10576m = new f();
        this.f10577n = new e();
        this.f10579p = new int[1];
        this.f10580q = new int[2];
        this.f10567a = aVar;
        this.f10568b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f10567a.a();
        this.f10569c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f10568b;
        if (bVar.size() < 0) {
            a aVar = this.f10567a;
            bVar.add(new ba.a("Invalid character reference: %s", aVar.f10519f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: fd.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f10573j;
            jVar.k();
        } else {
            jVar = this.f10574k;
            jVar.b();
        }
        this.f10572i = jVar;
        return jVar;
    }

    public final void e() {
        f2.f.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(f2.f fVar) {
        if (!this.e) {
            this.d = fVar;
            this.e = true;
            int i10 = fVar.f10289b;
            if (i10 == 2) {
                this.f10578o = ((i) fVar).f10559c;
                return;
            } else if (i10 == 3 && ((h) fVar).f10564k != null) {
                b bVar = this.f10568b;
                if (bVar.size() < 0) {
                    a aVar = this.f10567a;
                    ba.a aVar2 = new ba.a();
                    aVar2.f4229c = aVar.f10519f + aVar.e;
                    aVar2.f4228b = "Attributes incorrectly present on end tag";
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
        if (this.f10570f == null) {
            this.f10570f = str;
            return;
        }
        StringBuilder sb2 = this.f10571g;
        if (sb2.length() == 0) {
            sb2.append(this.f10570f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f10577n);
    }

    public final void j() {
        g(this.f10576m);
    }

    public final void k() {
        j jVar = this.f10572i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f10572i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f10568b;
        if (bVar.size() < 0) {
            a aVar = this.f10567a;
            bVar.add(new ba.a("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f10519f + aVar.e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f10568b;
        if (bVar.size() < 0) {
            a aVar = this.f10567a;
            bVar.add(new ba.a("Unexpected character '%s' in input state [%s]", aVar.f10519f + aVar.e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f10578o != null && this.f10572i.i().equalsIgnoreCase(this.f10578o)) {
            return true;
        }
        return false;
    }
}
