package gd;

import java.util.Arrays;
public final class k {
    public static final char[] f12455r;
    public static final int[] f12456s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f12457a;
    public final b f12458b;
    public f2.f d;
    public j f12462i;
    public final i f12463j;
    public final h f12464k;
    public final d f12465l;
    public final f f12466m;
    public final e f12467n;
    public String f12468o;
    public final int[] f12469p;
    public final int[] f12470q;
    public a2 f12459c = a2.f12411a;
    public boolean e = false;
    public String f12460f = null;
    public final StringBuilder f12461g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f12455r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f12454k = new fd.c();
        this.f12463j = jVar;
        this.f12464k = new j(3);
        this.f12465l = new f2.f(5, 1);
        this.f12466m = new f();
        this.f12467n = new e();
        this.f12469p = new int[1];
        this.f12470q = new int[2];
        this.f12457a = aVar;
        this.f12458b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f12457a.a();
        this.f12459c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f12458b;
        if (bVar.size() < 0) {
            a aVar = this.f12457a;
            bVar.add(new ca.a("Invalid character reference: %s", aVar.f12409f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: gd.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f12463j;
            jVar.k();
        } else {
            jVar = this.f12464k;
            jVar.b();
        }
        this.f12462i = jVar;
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
            int i10 = fVar.f10063b;
            if (i10 == 2) {
                this.f12468o = ((i) fVar).f12449c;
                return;
            } else if (i10 == 3 && ((h) fVar).f12454k != null) {
                b bVar = this.f12458b;
                if (bVar.size() < 0) {
                    a aVar = this.f12457a;
                    ca.a aVar2 = new ca.a();
                    aVar2.f6170c = aVar.f12409f + aVar.e;
                    aVar2.f6169b = "Attributes incorrectly present on end tag";
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
        if (this.f12460f == null) {
            this.f12460f = str;
            return;
        }
        StringBuilder sb2 = this.f12461g;
        if (sb2.length() == 0) {
            sb2.append(this.f12460f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f12467n);
    }

    public final void j() {
        g(this.f12466m);
    }

    public final void k() {
        j jVar = this.f12462i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f12462i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f12458b;
        if (bVar.size() < 0) {
            a aVar = this.f12457a;
            bVar.add(new ca.a("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f12409f + aVar.e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f12458b;
        if (bVar.size() < 0) {
            a aVar = this.f12457a;
            bVar.add(new ca.a("Unexpected character '%s' in input state [%s]", aVar.f12409f + aVar.e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f12468o != null && this.f12462i.i().equalsIgnoreCase(this.f12468o)) {
            return true;
        }
        return false;
    }
}
