package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8304r;
    public static final int[] f8305s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8306a;
    public final b f8307b;
    public k d;
    public j f8312i;
    public final i f8313j;
    public final h f8314k;
    public final d f8315l;
    public final f f8316m;
    public final e f8317n;
    public String f8318o;
    public final int[] f8319p;
    public final int[] f8320q;
    public b2 f8308c = b2.f8255a;
    public boolean f8309e = false;
    public String f8310f = null;
    public final StringBuilder f8311g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8304r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8301k = new cd.c();
        this.f8313j = jVar;
        this.f8314k = new j(3);
        this.f8315l = new k(5, 0);
        this.f8316m = new f();
        this.f8317n = new e();
        this.f8319p = new int[1];
        this.f8320q = new int[2];
        this.f8306a = aVar;
        this.f8307b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8306a.a();
        this.f8308c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8307b;
        if (bVar.size() < 0) {
            a aVar = this.f8306a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f8253f + aVar.f8252e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8313j;
            jVar.k();
        } else {
            jVar = this.f8314k;
            jVar.b();
        }
        this.f8312i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8309e) {
            this.d = kVar;
            this.f8309e = true;
            int i10 = kVar.f8303b;
            if (i10 == 2) {
                this.f8318o = ((i) kVar).f8295c;
                return;
            } else if (i10 == 3 && ((h) kVar).f8301k != null) {
                b bVar = this.f8307b;
                if (bVar.size() < 0) {
                    a aVar = this.f8306a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f390c = aVar.f8253f + aVar.f8252e;
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
        if (this.f8310f == null) {
            this.f8310f = str;
            return;
        }
        StringBuilder sb2 = this.f8311g;
        if (sb2.length() == 0) {
            sb2.append(this.f8310f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8317n);
    }

    public final void j() {
        g(this.f8316m);
    }

    public final void k() {
        j jVar = this.f8312i;
        if (jVar.f8296e != null) {
            jVar.j();
        }
        g(this.f8312i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8307b;
        if (bVar.size() < 0) {
            a aVar = this.f8306a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f8253f + aVar.f8252e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8307b;
        if (bVar.size() < 0) {
            a aVar = this.f8306a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f8253f + aVar.f8252e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8318o != null && this.f8312i.i().equalsIgnoreCase(this.f8318o)) {
            return true;
        }
        return false;
    }
}
