package gd;

import java.util.Arrays;
public final class k {
    public static final char[] f12454r;
    public static final int[] f12455s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f12456a;
    public final b f12457b;
    public f2.f d;
    public j f12461i;
    public final i f12462j;
    public final h f12463k;
    public final d f12464l;
    public final f f12465m;
    public final e f12466n;
    public String f12467o;
    public final int[] f12468p;
    public final int[] f12469q;
    public a2 f12458c = a2.f12410a;
    public boolean e = false;
    public String f12459f = null;
    public final StringBuilder f12460g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f12454r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f12453k = new fd.c();
        this.f12462j = jVar;
        this.f12463k = new j(3);
        this.f12464l = new f2.f(5, 1);
        this.f12465m = new f();
        this.f12466n = new e();
        this.f12468p = new int[1];
        this.f12469q = new int[2];
        this.f12456a = aVar;
        this.f12457b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f12456a.a();
        this.f12458c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f12457b;
        if (bVar.size() < 0) {
            a aVar = this.f12456a;
            bVar.add(new ca.a("Invalid character reference: %s", aVar.f12408f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: gd.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f12462j;
            jVar.k();
        } else {
            jVar = this.f12463k;
            jVar.b();
        }
        this.f12461i = jVar;
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
            int i10 = fVar.f10062b;
            if (i10 == 2) {
                this.f12467o = ((i) fVar).f12448c;
                return;
            } else if (i10 == 3 && ((h) fVar).f12453k != null) {
                b bVar = this.f12457b;
                if (bVar.size() < 0) {
                    a aVar = this.f12456a;
                    ca.a aVar2 = new ca.a();
                    aVar2.f6170c = aVar.f12408f + aVar.e;
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
        if (this.f12459f == null) {
            this.f12459f = str;
            return;
        }
        StringBuilder sb2 = this.f12460g;
        if (sb2.length() == 0) {
            sb2.append(this.f12459f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f12466n);
    }

    public final void j() {
        g(this.f12465m);
    }

    public final void k() {
        j jVar = this.f12461i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f12461i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f12457b;
        if (bVar.size() < 0) {
            a aVar = this.f12456a;
            bVar.add(new ca.a("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f12408f + aVar.e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f12457b;
        if (bVar.size() < 0) {
            a aVar = this.f12456a;
            bVar.add(new ca.a("Unexpected character '%s' in input state [%s]", aVar.f12408f + aVar.e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f12467o != null && this.f12461i.i().equalsIgnoreCase(this.f12467o)) {
            return true;
        }
        return false;
    }
}
