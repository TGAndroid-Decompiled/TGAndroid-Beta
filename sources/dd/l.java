package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8352r;
    public static final int[] f8353s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8354a;
    public final b f8355b;
    public k d;
    public j f8360i;
    public final i f8361j;
    public final h f8362k;
    public final d f8363l;
    public final f f8364m;
    public final e f8365n;
    public String f8366o;
    public final int[] f8367p;
    public final int[] f8368q;
    public b2 f8356c = b2.f8303a;
    public boolean f8357e = false;
    public String f8358f = null;
    public final StringBuilder f8359g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8352r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8349k = new cd.c();
        this.f8361j = jVar;
        this.f8362k = new j(3);
        this.f8363l = new k(5, 0);
        this.f8364m = new f();
        this.f8365n = new e();
        this.f8367p = new int[1];
        this.f8368q = new int[2];
        this.f8354a = aVar;
        this.f8355b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8354a.a();
        this.f8356c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8355b;
        if (bVar.size() < 0) {
            a aVar = this.f8354a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8301f + aVar.f8300e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8361j;
            jVar.k();
        } else {
            jVar = this.f8362k;
            jVar.b();
        }
        this.f8360i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8357e) {
            this.d = kVar;
            this.f8357e = true;
            int i7 = kVar.f8351b;
            if (i7 == 2) {
                this.f8366o = ((i) kVar).f8343c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8349k != null) {
                b bVar = this.f8355b;
                if (bVar.size() < 0) {
                    a aVar = this.f8354a;
                    com.google.android.gms.internal.clearcut.y0 y0Var = new com.google.android.gms.internal.clearcut.y0(1);
                    y0Var.f6996b = aVar.f8301f + aVar.f8300e;
                    y0Var.f6997c = "Attributes incorrectly present on end tag";
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
        if (this.f8358f == null) {
            this.f8358f = str;
            return;
        }
        StringBuilder sb2 = this.f8359g;
        if (sb2.length() == 0) {
            sb2.append(this.f8358f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8365n);
    }

    public final void j() {
        g(this.f8364m);
    }

    public final void k() {
        j jVar = this.f8360i;
        if (jVar.f8344e != null) {
            jVar.j();
        }
        g(this.f8360i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8355b;
        if (bVar.size() < 0) {
            a aVar = this.f8354a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8301f + aVar.f8300e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8355b;
        if (bVar.size() < 0) {
            a aVar = this.f8354a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8301f + aVar.f8300e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8366o != null && this.f8360i.i().equalsIgnoreCase(this.f8366o)) {
            return true;
        }
        return false;
    }
}
