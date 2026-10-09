package ed;

import java.util.Arrays;
public final class l {
    public static final char[] f8882r;
    public static final int[] f8883s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8884a;
    public final b f8885b;
    public k d;
    public j f8890i;
    public final i f8891j;
    public final h f8892k;
    public final d f8893l;
    public final f f8894m;
    public final e f8895n;
    public String f8896o;
    public final int[] f8897p;
    public final int[] f8898q;
    public b2 f8886c = b2.f8833a;
    public boolean f8887e = false;
    public String f8888f = null;
    public final StringBuilder f8889g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8882r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8879k = new dd.c();
        this.f8891j = jVar;
        this.f8892k = new j(3);
        this.f8893l = new k(5, 0);
        this.f8894m = new f();
        this.f8895n = new e();
        this.f8897p = new int[1];
        this.f8898q = new int[2];
        this.f8884a = aVar;
        this.f8885b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8884a.a();
        this.f8886c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8885b;
        if (bVar.size() < 0) {
            a aVar = this.f8884a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f8831f + aVar.f8830e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: ed.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8891j;
            jVar.k();
        } else {
            jVar = this.f8892k;
            jVar.b();
        }
        this.f8890i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8887e) {
            this.d = kVar;
            this.f8887e = true;
            int i10 = kVar.f8881b;
            if (i10 == 2) {
                this.f8896o = ((i) kVar).f8873c;
                return;
            } else if (i10 == 3 && ((h) kVar).f8879k != null) {
                b bVar = this.f8885b;
                if (bVar.size() < 0) {
                    a aVar = this.f8884a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f388c = aVar.f8831f + aVar.f8830e;
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
        if (this.f8888f == null) {
            this.f8888f = str;
            return;
        }
        StringBuilder sb2 = this.f8889g;
        if (sb2.length() == 0) {
            sb2.append(this.f8888f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8895n);
    }

    public final void j() {
        g(this.f8894m);
    }

    public final void k() {
        j jVar = this.f8890i;
        if (jVar.f8874e != null) {
            jVar.j();
        }
        g(this.f8890i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8885b;
        if (bVar.size() < 0) {
            a aVar = this.f8884a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f8831f + aVar.f8830e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8885b;
        if (bVar.size() < 0) {
            a aVar = this.f8884a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f8831f + aVar.f8830e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8896o != null && this.f8890i.i().equalsIgnoreCase(this.f8896o)) {
            return true;
        }
        return false;
    }
}
