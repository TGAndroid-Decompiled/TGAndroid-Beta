package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8649r;
    public static final int[] f8650s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8651a;
    public final b f8652b;
    public k d;
    public j f8657i;
    public final i f8658j;
    public final h f8659k;
    public final d f8660l;
    public final f f8661m;
    public final e f8662n;
    public String f8663o;
    public final int[] f8664p;
    public final int[] f8665q;
    public b2 f8653c = b2.f8600a;
    public boolean f8654e = false;
    public String f8655f = null;
    public final StringBuilder f8656g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8649r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8646k = new cd.c();
        this.f8658j = jVar;
        this.f8659k = new j(3);
        this.f8660l = new k(5, 0);
        this.f8661m = new f();
        this.f8662n = new e();
        this.f8664p = new int[1];
        this.f8665q = new int[2];
        this.f8651a = aVar;
        this.f8652b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8651a.a();
        this.f8653c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8652b;
        if (bVar.size() < 0) {
            a aVar = this.f8651a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8598f + aVar.f8597e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z9) {
        j jVar;
        if (z9) {
            jVar = this.f8658j;
            jVar.k();
        } else {
            jVar = this.f8659k;
            jVar.b();
        }
        this.f8657i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8654e) {
            this.d = kVar;
            this.f8654e = true;
            int i7 = kVar.f8648b;
            if (i7 == 2) {
                this.f8663o = ((i) kVar).f8640c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8646k != null) {
                b bVar = this.f8652b;
                if (bVar.size() < 0) {
                    a aVar = this.f8651a;
                    com.google.android.gms.internal.clearcut.z0 z0Var = new com.google.android.gms.internal.clearcut.z0(1);
                    z0Var.f7295b = aVar.f8598f + aVar.f8597e;
                    z0Var.f7296c = "Attributes incorrectly present on end tag";
                    bVar.add(z0Var);
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
        if (this.f8655f == null) {
            this.f8655f = str;
            return;
        }
        StringBuilder sb2 = this.f8656g;
        if (sb2.length() == 0) {
            sb2.append(this.f8655f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8662n);
    }

    public final void j() {
        g(this.f8661m);
    }

    public final void k() {
        j jVar = this.f8657i;
        if (jVar.f8641e != null) {
            jVar.j();
        }
        g(this.f8657i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8652b;
        if (bVar.size() < 0) {
            a aVar = this.f8651a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8598f + aVar.f8597e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8652b;
        if (bVar.size() < 0) {
            a aVar = this.f8651a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8598f + aVar.f8597e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8663o != null && this.f8657i.i().equalsIgnoreCase(this.f8663o)) {
            return true;
        }
        return false;
    }
}
