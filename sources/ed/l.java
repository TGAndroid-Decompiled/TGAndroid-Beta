package ed;

import java.util.Arrays;
public final class l {
    public static final char[] f8881r;
    public static final int[] f8882s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8883a;
    public final b f8884b;
    public k d;
    public j f8889i;
    public final i f8890j;
    public final h f8891k;
    public final d f8892l;
    public final f f8893m;
    public final e f8894n;
    public String f8895o;
    public final int[] f8896p;
    public final int[] f8897q;
    public b2 f8885c = b2.f8832a;
    public boolean f8886e = false;
    public String f8887f = null;
    public final StringBuilder f8888g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8881r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8878k = new dd.c();
        this.f8890j = jVar;
        this.f8891k = new j(3);
        this.f8892l = new k(5, 0);
        this.f8893m = new f();
        this.f8894n = new e();
        this.f8896p = new int[1];
        this.f8897q = new int[2];
        this.f8883a = aVar;
        this.f8884b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8883a.a();
        this.f8885c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8884b;
        if (bVar.size() < 0) {
            a aVar = this.f8883a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f8830f + aVar.f8829e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: ed.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8890j;
            jVar.k();
        } else {
            jVar = this.f8891k;
            jVar.b();
        }
        this.f8889i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8886e) {
            this.d = kVar;
            this.f8886e = true;
            int i10 = kVar.f8880b;
            if (i10 == 2) {
                this.f8895o = ((i) kVar).f8872c;
                return;
            } else if (i10 == 3 && ((h) kVar).f8878k != null) {
                b bVar = this.f8884b;
                if (bVar.size() < 0) {
                    a aVar = this.f8883a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f388c = aVar.f8830f + aVar.f8829e;
                    bVar2.f387b = "Attributes incorrectly present on end tag";
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
        if (this.f8887f == null) {
            this.f8887f = str;
            return;
        }
        StringBuilder sb2 = this.f8888g;
        if (sb2.length() == 0) {
            sb2.append(this.f8887f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8894n);
    }

    public final void j() {
        g(this.f8893m);
    }

    public final void k() {
        j jVar = this.f8889i;
        if (jVar.f8873e != null) {
            jVar.j();
        }
        g(this.f8889i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8884b;
        if (bVar.size() < 0) {
            a aVar = this.f8883a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f8830f + aVar.f8829e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8884b;
        if (bVar.size() < 0) {
            a aVar = this.f8883a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f8830f + aVar.f8829e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8895o != null && this.f8889i.i().equalsIgnoreCase(this.f8895o)) {
            return true;
        }
        return false;
    }
}
