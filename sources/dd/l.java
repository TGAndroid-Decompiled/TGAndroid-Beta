package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f7695r;
    public static final int[] f7696s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f7697a;
    public final b f7698b;
    public k d;
    public j f7702i;
    public final i f7703j;
    public final h f7704k;
    public final d f7705l;
    public final f f7706m;
    public final e f7707n;
    public String f7708o;
    public final int[] f7709p;
    public final int[] f7710q;
    public b2 f7699c = b2.f7649a;
    public boolean e = false;
    public String f7700f = null;
    public final StringBuilder f7701g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f7695r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f7692k = new cd.c();
        this.f7703j = jVar;
        this.f7704k = new j(3);
        this.f7705l = new k(5, 0);
        this.f7706m = new f();
        this.f7707n = new e();
        this.f7709p = new int[1];
        this.f7710q = new int[2];
        this.f7697a = aVar;
        this.f7698b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f7697a.a();
        this.f7699c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f7698b;
        if (bVar.size() < 0) {
            a aVar = this.f7697a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f7647f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f7703j;
            jVar.k();
        } else {
            jVar = this.f7704k;
            jVar.b();
        }
        this.f7702i = jVar;
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
            int i10 = kVar.f7694b;
            if (i10 == 2) {
                this.f7708o = ((i) kVar).f7687c;
                return;
            } else if (i10 == 3 && ((h) kVar).f7692k != null) {
                b bVar = this.f7698b;
                if (bVar.size() < 0) {
                    a aVar = this.f7697a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f363c = aVar.f7647f + aVar.e;
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
        if (this.f7700f == null) {
            this.f7700f = str;
            return;
        }
        StringBuilder sb2 = this.f7701g;
        if (sb2.length() == 0) {
            sb2.append(this.f7700f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f7707n);
    }

    public final void j() {
        g(this.f7706m);
    }

    public final void k() {
        j jVar = this.f7702i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f7702i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f7698b;
        if (bVar.size() < 0) {
            a aVar = this.f7697a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f7647f + aVar.e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f7698b;
        if (bVar.size() < 0) {
            a aVar = this.f7697a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f7647f + aVar.e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f7708o != null && this.f7702i.i().equalsIgnoreCase(this.f7708o)) {
            return true;
        }
        return false;
    }
}
