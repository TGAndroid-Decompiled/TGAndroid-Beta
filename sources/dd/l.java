package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8314r;
    public static final int[] f8315s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8316a;
    public final b f8317b;
    public k d;
    public j f8322i;
    public final i f8323j;
    public final h f8324k;
    public final d f8325l;
    public final f f8326m;
    public final e f8327n;
    public String f8328o;
    public final int[] f8329p;
    public final int[] f8330q;
    public b2 f8318c = b2.f8265a;
    public boolean f8319e = false;
    public String f8320f = null;
    public final StringBuilder f8321g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8314r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8311k = new cd.c();
        this.f8323j = jVar;
        this.f8324k = new j(3);
        this.f8325l = new k(5, 0);
        this.f8326m = new f();
        this.f8327n = new e();
        this.f8329p = new int[1];
        this.f8330q = new int[2];
        this.f8316a = aVar;
        this.f8317b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8316a.a();
        this.f8318c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8317b;
        if (bVar.size() < 0) {
            a aVar = this.f8316a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8263f + aVar.f8262e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8323j;
            jVar.k();
        } else {
            jVar = this.f8324k;
            jVar.b();
        }
        this.f8322i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8319e) {
            this.d = kVar;
            this.f8319e = true;
            int i7 = kVar.f8313b;
            if (i7 == 2) {
                this.f8328o = ((i) kVar).f8305c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8311k != null) {
                b bVar = this.f8317b;
                if (bVar.size() < 0) {
                    a aVar = this.f8316a;
                    com.google.android.gms.internal.clearcut.y0 y0Var = new com.google.android.gms.internal.clearcut.y0(1);
                    y0Var.f6958b = aVar.f8263f + aVar.f8262e;
                    y0Var.f6959c = "Attributes incorrectly present on end tag";
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
        if (this.f8320f == null) {
            this.f8320f = str;
            return;
        }
        StringBuilder sb2 = this.f8321g;
        if (sb2.length() == 0) {
            sb2.append(this.f8320f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8327n);
    }

    public final void j() {
        g(this.f8326m);
    }

    public final void k() {
        j jVar = this.f8322i;
        if (jVar.f8306e != null) {
            jVar.j();
        }
        g(this.f8322i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8317b;
        if (bVar.size() < 0) {
            a aVar = this.f8316a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8263f + aVar.f8262e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8317b;
        if (bVar.size() < 0) {
            a aVar = this.f8316a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8263f + aVar.f8262e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8328o != null && this.f8322i.i().equalsIgnoreCase(this.f8328o)) {
            return true;
        }
        return false;
    }
}
