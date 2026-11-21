package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8349r;
    public static final int[] f8350s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8351a;
    public final b f8352b;
    public k d;
    public j f8357i;
    public final i f8358j;
    public final h f8359k;
    public final d f8360l;
    public final f f8361m;
    public final e f8362n;
    public String f8363o;
    public final int[] f8364p;
    public final int[] f8365q;
    public b2 f8353c = b2.f8300a;
    public boolean f8354e = false;
    public String f8355f = null;
    public final StringBuilder f8356g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8349r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8346k = new cd.c();
        this.f8358j = jVar;
        this.f8359k = new j(3);
        this.f8360l = new k(5, 0);
        this.f8361m = new f();
        this.f8362n = new e();
        this.f8364p = new int[1];
        this.f8365q = new int[2];
        this.f8351a = aVar;
        this.f8352b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8351a.a();
        this.f8353c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8352b;
        if (bVar.size() < 0) {
            a aVar = this.f8351a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8298f + aVar.f8297e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8358j;
            jVar.k();
        } else {
            jVar = this.f8359k;
            jVar.b();
        }
        this.f8357i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8354e) {
            this.d = kVar;
            this.f8354e = true;
            int i7 = kVar.f8348b;
            if (i7 == 2) {
                this.f8363o = ((i) kVar).f8340c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8346k != null) {
                b bVar = this.f8352b;
                if (bVar.size() < 0) {
                    a aVar = this.f8351a;
                    com.google.android.gms.internal.clearcut.y0 y0Var = new com.google.android.gms.internal.clearcut.y0(1);
                    y0Var.f6993b = aVar.f8298f + aVar.f8297e;
                    y0Var.f6994c = "Attributes incorrectly present on end tag";
                    bVar.add(y0Var);
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
        if (this.f8355f == null) {
            this.f8355f = str;
            return;
        }
        StringBuilder sb2 = this.f8356g;
        if (sb2.length() == 0) {
            sb2.append(this.f8355f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8362n);
    }

    public final void j() {
        g(this.f8361m);
    }

    public final void k() {
        j jVar = this.f8357i;
        if (jVar.f8341e != null) {
            jVar.j();
        }
        g(this.f8357i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8352b;
        if (bVar.size() < 0) {
            a aVar = this.f8351a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8298f + aVar.f8297e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8352b;
        if (bVar.size() < 0) {
            a aVar = this.f8351a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8298f + aVar.f8297e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8363o != null && this.f8357i.i().equalsIgnoreCase(this.f8363o)) {
            return true;
        }
        return false;
    }
}
