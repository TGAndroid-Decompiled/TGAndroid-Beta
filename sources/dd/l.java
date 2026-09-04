package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f6774r;
    public static final int[] f6775s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f6776a;
    public final b f6777b;
    public k d;
    public j f6782i;
    public final i f6783j;
    public final h f6784k;
    public final d f6785l;
    public final f f6786m;
    public final e f6787n;
    public String f6788o;
    public final int[] f6789p;
    public final int[] f6790q;
    public b2 f6778c = b2.f6726a;
    public boolean f6779e = false;
    public String f6780f = null;
    public final StringBuilder f6781g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f6774r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.v = new cd.c();
        this.f6783j = jVar;
        this.f6784k = new j(3);
        this.f6785l = new k(5, 0);
        this.f6786m = new f();
        this.f6787n = new e();
        this.f6789p = new int[1];
        this.f6790q = new int[2];
        this.f6776a = aVar;
        this.f6777b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f6776a.a();
        this.f6778c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f6777b;
        if (bVar.size() < 0) {
            a aVar = this.f6776a;
            bVar.add(new aa.b("Invalid character reference: %s", aVar.f6724f + aVar.f6723e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f6783j;
            jVar.q();
        } else {
            jVar = this.f6784k;
            jVar.f();
        }
        this.f6782i = jVar;
        return jVar;
    }

    public final void e() {
        k.g(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f6779e) {
            this.d = kVar;
            this.f6779e = true;
            int i10 = kVar.f6773b;
            if (i10 == 2) {
                this.f6788o = ((i) kVar).f6766c;
                return;
            } else if (i10 == 3 && ((h) kVar).v != null) {
                b bVar = this.f6777b;
                if (bVar.size() < 0) {
                    a aVar = this.f6776a;
                    aa.b bVar2 = new aa.b();
                    bVar2.f375c = aVar.f6724f + aVar.f6723e;
                    bVar2.f374b = "Attributes incorrectly present on end tag";
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
        if (this.f6780f == null) {
            this.f6780f = str;
            return;
        }
        StringBuilder sb2 = this.f6781g;
        if (sb2.length() == 0) {
            sb2.append(this.f6780f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f6787n);
    }

    public final void j() {
        g(this.f6786m);
    }

    public final void k() {
        j jVar = this.f6782i;
        if (jVar.f6767e != null) {
            jVar.p();
        }
        g(this.f6782i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f6777b;
        if (bVar.size() < 0) {
            a aVar = this.f6776a;
            bVar.add(new aa.b("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f6724f + aVar.f6723e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f6777b;
        if (bVar.size() < 0) {
            a aVar = this.f6776a;
            bVar.add(new aa.b("Unexpected character '%s' in input state [%s]", aVar.f6724f + aVar.f6723e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f6788o != null && this.f6782i.o().equalsIgnoreCase(this.f6788o)) {
            return true;
        }
        return false;
    }
}
