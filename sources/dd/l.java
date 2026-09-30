package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f7689r;
    public static final int[] f7690s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f7691a;
    public final b f7692b;
    public k d;
    public j f7696i;
    public final i f7697j;
    public final h f7698k;
    public final d f7699l;
    public final f f7700m;
    public final e f7701n;
    public String f7702o;
    public final int[] f7703p;
    public final int[] f7704q;
    public b2 f7693c = b2.f7643a;
    public boolean e = false;
    public String f7694f = null;
    public final StringBuilder f7695g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f7689r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f7686k = new cd.c();
        this.f7697j = jVar;
        this.f7698k = new j(3);
        this.f7699l = new k(5, 0);
        this.f7700m = new f();
        this.f7701n = new e();
        this.f7703p = new int[1];
        this.f7704q = new int[2];
        this.f7691a = aVar;
        this.f7692b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f7691a.a();
        this.f7693c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f7692b;
        if (bVar.size() < 0) {
            a aVar = this.f7691a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f7641f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f7697j;
            jVar.k();
        } else {
            jVar = this.f7698k;
            jVar.b();
        }
        this.f7696i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.e) {
            this.d = kVar;
            this.e = true;
            int i10 = kVar.f7688b;
            if (i10 == 2) {
                this.f7702o = ((i) kVar).f7681c;
                return;
            } else if (i10 == 3 && ((h) kVar).f7686k != null) {
                b bVar = this.f7692b;
                if (bVar.size() < 0) {
                    a aVar = this.f7691a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f363c = aVar.f7641f + aVar.e;
                    bVar2.f362b = "Attributes incorrectly present on end tag";
                    bVar.add(bVar2);
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
        if (this.f7694f == null) {
            this.f7694f = str;
            return;
        }
        StringBuilder sb2 = this.f7695g;
        if (sb2.length() == 0) {
            sb2.append(this.f7694f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f7701n);
    }

    public final void j() {
        g(this.f7700m);
    }

    public final void k() {
        j jVar = this.f7696i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f7696i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f7692b;
        if (bVar.size() < 0) {
            a aVar = this.f7691a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f7641f + aVar.e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f7692b;
        if (bVar.size() < 0) {
            a aVar = this.f7691a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f7641f + aVar.e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f7702o != null && this.f7696i.i().equalsIgnoreCase(this.f7702o)) {
            return true;
        }
        return false;
    }
}
