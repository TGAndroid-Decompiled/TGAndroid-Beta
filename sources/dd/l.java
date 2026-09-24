package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f7677r;
    public static final int[] f7678s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f7679a;
    public final b f7680b;
    public k d;
    public j f7684i;
    public final i f7685j;
    public final h f7686k;
    public final d f7687l;
    public final f f7688m;
    public final e f7689n;
    public String f7690o;
    public final int[] f7691p;
    public final int[] f7692q;
    public b2 f7681c = b2.f7631a;
    public boolean e = false;
    public String f7682f = null;
    public final StringBuilder f7683g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f7677r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f7674k = new cd.c();
        this.f7685j = jVar;
        this.f7686k = new j(3);
        this.f7687l = new k(5, 0);
        this.f7688m = new f();
        this.f7689n = new e();
        this.f7691p = new int[1];
        this.f7692q = new int[2];
        this.f7679a = aVar;
        this.f7680b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f7679a.a();
        this.f7681c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f7680b;
        if (bVar.size() < 0) {
            a aVar = this.f7679a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f7629f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f7685j;
            jVar.k();
        } else {
            jVar = this.f7686k;
            jVar.b();
        }
        this.f7684i = jVar;
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
            int i10 = kVar.f7676b;
            if (i10 == 2) {
                this.f7690o = ((i) kVar).f7669c;
                return;
            } else if (i10 == 3 && ((h) kVar).f7674k != null) {
                b bVar = this.f7680b;
                if (bVar.size() < 0) {
                    a aVar = this.f7679a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f363c = aVar.f7629f + aVar.e;
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
        if (this.f7682f == null) {
            this.f7682f = str;
            return;
        }
        StringBuilder sb2 = this.f7683g;
        if (sb2.length() == 0) {
            sb2.append(this.f7682f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f7689n);
    }

    public final void j() {
        g(this.f7688m);
    }

    public final void k() {
        j jVar = this.f7684i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f7684i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f7680b;
        if (bVar.size() < 0) {
            a aVar = this.f7679a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f7629f + aVar.e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f7680b;
        if (bVar.size() < 0) {
            a aVar = this.f7679a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f7629f + aVar.e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f7690o != null && this.f7684i.i().equalsIgnoreCase(this.f7690o)) {
            return true;
        }
        return false;
    }
}
