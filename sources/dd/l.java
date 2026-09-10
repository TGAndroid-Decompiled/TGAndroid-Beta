package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f6466r;
    public static final int[] f6467s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f6468a;
    public final b f6469b;
    public k d;
    public j f6473i;
    public final i f6474j;
    public final h f6475k;
    public final d f6476l;
    public final f f6477m;
    public final e f6478n;
    public String f6479o;
    public final int[] f6480p;
    public final int[] f6481q;
    public b2 f6470c = b2.f6420a;
    public boolean e = false;
    public String f6471f = null;
    public final StringBuilder f6472g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f6466r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f6463k = new cd.c();
        this.f6474j = jVar;
        this.f6475k = new j(3);
        this.f6476l = new k(5, 0);
        this.f6477m = new f();
        this.f6478n = new e();
        this.f6480p = new int[1];
        this.f6481q = new int[2];
        this.f6468a = aVar;
        this.f6469b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f6468a.a();
        this.f6470c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f6469b;
        if (bVar.size() < 0) {
            a aVar = this.f6468a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f6418f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f6474j;
            jVar.k();
        } else {
            jVar = this.f6475k;
            jVar.b();
        }
        this.f6473i = jVar;
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
            int i10 = kVar.f6465b;
            if (i10 == 2) {
                this.f6479o = ((i) kVar).f6458c;
                return;
            } else if (i10 == 3 && ((h) kVar).f6463k != null) {
                b bVar = this.f6469b;
                if (bVar.size() < 0) {
                    a aVar = this.f6468a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f359c = aVar.f6418f + aVar.e;
                    bVar2.f358b = "Attributes incorrectly present on end tag";
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
        if (this.f6471f == null) {
            this.f6471f = str;
            return;
        }
        StringBuilder sb2 = this.f6472g;
        if (sb2.length() == 0) {
            sb2.append(this.f6471f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f6478n);
    }

    public final void j() {
        g(this.f6477m);
    }

    public final void k() {
        j jVar = this.f6473i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f6473i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f6469b;
        if (bVar.size() < 0) {
            a aVar = this.f6468a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f6418f + aVar.e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f6469b;
        if (bVar.size() < 0) {
            a aVar = this.f6468a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f6418f + aVar.e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f6479o != null && this.f6473i.i().equalsIgnoreCase(this.f6479o)) {
            return true;
        }
        return false;
    }
}
