package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f7694r;
    public static final int[] f7695s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f7696a;
    public final b f7697b;
    public k d;
    public j f7701i;
    public final i f7702j;
    public final h f7703k;
    public final d f7704l;
    public final f f7705m;
    public final e f7706n;
    public String f7707o;
    public final int[] f7708p;
    public final int[] f7709q;
    public b2 f7698c = b2.f7648a;
    public boolean e = false;
    public String f7699f = null;
    public final StringBuilder f7700g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f7694r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f7691k = new cd.c();
        this.f7702j = jVar;
        this.f7703k = new j(3);
        this.f7704l = new k(5, 0);
        this.f7705m = new f();
        this.f7706n = new e();
        this.f7708p = new int[1];
        this.f7709q = new int[2];
        this.f7696a = aVar;
        this.f7697b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f7696a.a();
        this.f7698c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f7697b;
        if (bVar.size() < 0) {
            a aVar = this.f7696a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f7646f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f7702j;
            jVar.k();
        } else {
            jVar = this.f7703k;
            jVar.b();
        }
        this.f7701i = jVar;
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
            int i10 = kVar.f7693b;
            if (i10 == 2) {
                this.f7707o = ((i) kVar).f7686c;
                return;
            } else if (i10 == 3 && ((h) kVar).f7691k != null) {
                b bVar = this.f7697b;
                if (bVar.size() < 0) {
                    a aVar = this.f7696a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f360c = aVar.f7646f + aVar.e;
                    bVar2.f359b = "Attributes incorrectly present on end tag";
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
        if (this.f7699f == null) {
            this.f7699f = str;
            return;
        }
        StringBuilder sb2 = this.f7700g;
        if (sb2.length() == 0) {
            sb2.append(this.f7699f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f7706n);
    }

    public final void j() {
        g(this.f7705m);
    }

    public final void k() {
        j jVar = this.f7701i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f7701i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f7697b;
        if (bVar.size() < 0) {
            a aVar = this.f7696a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f7646f + aVar.e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f7697b;
        if (bVar.size() < 0) {
            a aVar = this.f7696a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f7646f + aVar.e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f7707o != null && this.f7701i.i().equalsIgnoreCase(this.f7707o)) {
            return true;
        }
        return false;
    }
}
