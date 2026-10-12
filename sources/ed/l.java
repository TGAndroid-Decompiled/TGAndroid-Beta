package ed;

import java.util.Arrays;
public final class l {
    public static final char[] f8879r;
    public static final int[] f8880s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8881a;
    public final b f8882b;
    public k d;
    public j f8887i;
    public final i f8888j;
    public final h f8889k;
    public final d f8890l;
    public final f f8891m;
    public final e f8892n;
    public String f8893o;
    public final int[] f8894p;
    public final int[] f8895q;
    public b2 f8883c = b2.f8830a;
    public boolean f8884e = false;
    public String f8885f = null;
    public final StringBuilder f8886g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8879r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8876k = new dd.c();
        this.f8888j = jVar;
        this.f8889k = new j(3);
        this.f8890l = new k(5, 0);
        this.f8891m = new f();
        this.f8892n = new e();
        this.f8894p = new int[1];
        this.f8895q = new int[2];
        this.f8881a = aVar;
        this.f8882b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8881a.a();
        this.f8883c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8882b;
        if (bVar.size() < 0) {
            a aVar = this.f8881a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f8828f + aVar.f8827e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: ed.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8888j;
            jVar.k();
        } else {
            jVar = this.f8889k;
            jVar.b();
        }
        this.f8887i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8884e) {
            this.d = kVar;
            this.f8884e = true;
            int i10 = kVar.f8878b;
            if (i10 == 2) {
                this.f8893o = ((i) kVar).f8870c;
                return;
            } else if (i10 == 3 && ((h) kVar).f8876k != null) {
                b bVar = this.f8882b;
                if (bVar.size() < 0) {
                    a aVar = this.f8881a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f390c = aVar.f8828f + aVar.f8827e;
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
        if (this.f8885f == null) {
            this.f8885f = str;
            return;
        }
        StringBuilder sb2 = this.f8886g;
        if (sb2.length() == 0) {
            sb2.append(this.f8885f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8892n);
    }

    public final void j() {
        g(this.f8891m);
    }

    public final void k() {
        j jVar = this.f8887i;
        if (jVar.f8871e != null) {
            jVar.j();
        }
        g(this.f8887i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8882b;
        if (bVar.size() < 0) {
            a aVar = this.f8881a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f8828f + aVar.f8827e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8882b;
        if (bVar.size() < 0) {
            a aVar = this.f8881a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f8828f + aVar.f8827e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8893o != null && this.f8887i.i().equalsIgnoreCase(this.f8893o)) {
            return true;
        }
        return false;
    }
}
