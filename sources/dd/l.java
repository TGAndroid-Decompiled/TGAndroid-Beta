package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f7679r;
    public static final int[] f7680s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f7681a;
    public final b f7682b;
    public k d;
    public j f7686i;
    public final i f7687j;
    public final h f7688k;
    public final d f7689l;
    public final f f7690m;
    public final e f7691n;
    public String f7692o;
    public final int[] f7693p;
    public final int[] f7694q;
    public b2 f7683c = b2.f7633a;
    public boolean e = false;
    public String f7684f = null;
    public final StringBuilder f7685g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f7679r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f7676k = new cd.c();
        this.f7687j = jVar;
        this.f7688k = new j(3);
        this.f7689l = new k(5, 0);
        this.f7690m = new f();
        this.f7691n = new e();
        this.f7693p = new int[1];
        this.f7694q = new int[2];
        this.f7681a = aVar;
        this.f7682b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f7681a.a();
        this.f7683c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f7682b;
        if (bVar.size() < 0) {
            a aVar = this.f7681a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f7631f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f7687j;
            jVar.k();
        } else {
            jVar = this.f7688k;
            jVar.b();
        }
        this.f7686i = jVar;
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
            int i10 = kVar.f7678b;
            if (i10 == 2) {
                this.f7692o = ((i) kVar).f7671c;
                return;
            } else if (i10 == 3 && ((h) kVar).f7676k != null) {
                b bVar = this.f7682b;
                if (bVar.size() < 0) {
                    a aVar = this.f7681a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f363c = aVar.f7631f + aVar.e;
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
        if (this.f7684f == null) {
            this.f7684f = str;
            return;
        }
        StringBuilder sb2 = this.f7685g;
        if (sb2.length() == 0) {
            sb2.append(this.f7684f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f7691n);
    }

    public final void j() {
        g(this.f7690m);
    }

    public final void k() {
        j jVar = this.f7686i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f7686i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f7682b;
        if (bVar.size() < 0) {
            a aVar = this.f7681a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f7631f + aVar.e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f7682b;
        if (bVar.size() < 0) {
            a aVar = this.f7681a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f7631f + aVar.e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f7692o != null && this.f7686i.i().equalsIgnoreCase(this.f7692o)) {
            return true;
        }
        return false;
    }
}
