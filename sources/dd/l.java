package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8654r;
    public static final int[] f8655s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8656a;
    public final b f8657b;
    public k d;
    public j f8662i;
    public final i f8663j;
    public final h f8664k;
    public final d f8665l;
    public final f f8666m;
    public final e f8667n;
    public String f8668o;
    public final int[] f8669p;
    public final int[] f8670q;
    public b2 f8658c = b2.f8605a;
    public boolean f8659e = false;
    public String f8660f = null;
    public final StringBuilder f8661g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8654r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8651k = new cd.c();
        this.f8663j = jVar;
        this.f8664k = new j(3);
        this.f8665l = new k(5, 0);
        this.f8666m = new f();
        this.f8667n = new e();
        this.f8669p = new int[1];
        this.f8670q = new int[2];
        this.f8656a = aVar;
        this.f8657b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8656a.a();
        this.f8658c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8657b;
        if (bVar.size() < 0) {
            a aVar = this.f8656a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8603f + aVar.f8602e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z9) {
        j jVar;
        if (z9) {
            jVar = this.f8663j;
            jVar.k();
        } else {
            jVar = this.f8664k;
            jVar.b();
        }
        this.f8662i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8659e) {
            this.d = kVar;
            this.f8659e = true;
            int i7 = kVar.f8653b;
            if (i7 == 2) {
                this.f8668o = ((i) kVar).f8645c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8651k != null) {
                b bVar = this.f8657b;
                if (bVar.size() < 0) {
                    a aVar = this.f8656a;
                    com.google.android.gms.internal.clearcut.z0 z0Var = new com.google.android.gms.internal.clearcut.z0(1);
                    z0Var.f7300b = aVar.f8603f + aVar.f8602e;
                    z0Var.f7301c = "Attributes incorrectly present on end tag";
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
        if (this.f8660f == null) {
            this.f8660f = str;
            return;
        }
        StringBuilder sb2 = this.f8661g;
        if (sb2.length() == 0) {
            sb2.append(this.f8660f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8667n);
    }

    public final void j() {
        g(this.f8666m);
    }

    public final void k() {
        j jVar = this.f8662i;
        if (jVar.f8646e != null) {
            jVar.j();
        }
        g(this.f8662i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8657b;
        if (bVar.size() < 0) {
            a aVar = this.f8656a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8603f + aVar.f8602e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8657b;
        if (bVar.size() < 0) {
            a aVar = this.f8656a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8603f + aVar.f8602e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8668o != null && this.f8662i.i().equalsIgnoreCase(this.f8668o)) {
            return true;
        }
        return false;
    }
}
