package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f6802r;
    public static final int[] f6803s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f6804a;
    public final b f6805b;
    public k d;
    public j f6810i;
    public final i f6811j;
    public final h f6812k;
    public final d f6813l;
    public final f f6814m;
    public final e f6815n;
    public String f6816o;
    public final int[] f6817p;
    public final int[] f6818q;
    public b2 f6806c = b2.f6753a;
    public boolean f6807e = false;
    public String f6808f = null;
    public final StringBuilder f6809g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f6802r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f6799k = new cd.c();
        this.f6811j = jVar;
        this.f6812k = new j(3);
        this.f6813l = new k(5, 0);
        this.f6814m = new f();
        this.f6815n = new e();
        this.f6817p = new int[1];
        this.f6818q = new int[2];
        this.f6804a = aVar;
        this.f6805b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f6804a.a();
        this.f6806c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f6805b;
        if (bVar.size() < 0) {
            a aVar = this.f6804a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f6751f + aVar.f6750e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f6811j;
            jVar.k();
        } else {
            jVar = this.f6812k;
            jVar.b();
        }
        this.f6810i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f6807e) {
            this.d = kVar;
            this.f6807e = true;
            int i10 = kVar.f6801b;
            if (i10 == 2) {
                this.f6816o = ((i) kVar).f6793c;
                return;
            } else if (i10 == 3 && ((h) kVar).f6799k != null) {
                b bVar = this.f6805b;
                if (bVar.size() < 0) {
                    a aVar = this.f6804a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f387c = aVar.f6751f + aVar.f6750e;
                    bVar2.f386b = "Attributes incorrectly present on end tag";
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
        if (this.f6808f == null) {
            this.f6808f = str;
            return;
        }
        StringBuilder sb2 = this.f6809g;
        if (sb2.length() == 0) {
            sb2.append(this.f6808f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f6815n);
    }

    public final void j() {
        g(this.f6814m);
    }

    public final void k() {
        j jVar = this.f6810i;
        if (jVar.f6794e != null) {
            jVar.j();
        }
        g(this.f6810i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f6805b;
        if (bVar.size() < 0) {
            a aVar = this.f6804a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f6751f + aVar.f6750e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f6805b;
        if (bVar.size() < 0) {
            a aVar = this.f6804a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f6751f + aVar.f6750e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f6816o != null && this.f6810i.i().equalsIgnoreCase(this.f6816o)) {
            return true;
        }
        return false;
    }
}
