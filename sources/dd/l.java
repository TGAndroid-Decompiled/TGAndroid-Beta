package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8303r;
    public static final int[] f8304s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8305a;
    public final b f8306b;
    public k d;
    public j f8311i;
    public final i f8312j;
    public final h f8313k;
    public final d f8314l;
    public final f f8315m;
    public final e f8316n;
    public String f8317o;
    public final int[] f8318p;
    public final int[] f8319q;
    public b2 f8307c = b2.f8254a;
    public boolean f8308e = false;
    public String f8309f = null;
    public final StringBuilder f8310g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8303r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8300k = new cd.c();
        this.f8312j = jVar;
        this.f8313k = new j(3);
        this.f8314l = new k(5, 0);
        this.f8315m = new f();
        this.f8316n = new e();
        this.f8318p = new int[1];
        this.f8319q = new int[2];
        this.f8305a = aVar;
        this.f8306b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8305a.a();
        this.f8307c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8306b;
        if (bVar.size() < 0) {
            a aVar = this.f8305a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f8252f + aVar.f8251e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8312j;
            jVar.k();
        } else {
            jVar = this.f8313k;
            jVar.b();
        }
        this.f8311i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8308e) {
            this.d = kVar;
            this.f8308e = true;
            int i10 = kVar.f8302b;
            if (i10 == 2) {
                this.f8317o = ((i) kVar).f8294c;
                return;
            } else if (i10 == 3 && ((h) kVar).f8300k != null) {
                b bVar = this.f8306b;
                if (bVar.size() < 0) {
                    a aVar = this.f8305a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f390c = aVar.f8252f + aVar.f8251e;
                    bVar2.f389b = "Attributes incorrectly present on end tag";
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
        if (this.f8309f == null) {
            this.f8309f = str;
            return;
        }
        StringBuilder sb2 = this.f8310g;
        if (sb2.length() == 0) {
            sb2.append(this.f8309f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8316n);
    }

    public final void j() {
        g(this.f8315m);
    }

    public final void k() {
        j jVar = this.f8311i;
        if (jVar.f8295e != null) {
            jVar.j();
        }
        g(this.f8311i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8306b;
        if (bVar.size() < 0) {
            a aVar = this.f8305a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f8252f + aVar.f8251e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8306b;
        if (bVar.size() < 0) {
            a aVar = this.f8305a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f8252f + aVar.f8251e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8317o != null && this.f8311i.i().equalsIgnoreCase(this.f8317o)) {
            return true;
        }
        return false;
    }
}
