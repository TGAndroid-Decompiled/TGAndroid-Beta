package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8651r;
    public static final int[] f8652s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8653a;
    public final b f8654b;
    public k d;
    public j f8659i;
    public final i f8660j;
    public final h f8661k;
    public final d f8662l;
    public final f f8663m;
    public final e f8664n;
    public String f8665o;
    public final int[] f8666p;
    public final int[] f8667q;
    public b2 f8655c = b2.f8602a;
    public boolean f8656e = false;
    public String f8657f = null;
    public final StringBuilder f8658g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8651r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8648k = new cd.c();
        this.f8660j = jVar;
        this.f8661k = new j(3);
        this.f8662l = new k(5, 0);
        this.f8663m = new f();
        this.f8664n = new e();
        this.f8666p = new int[1];
        this.f8667q = new int[2];
        this.f8653a = aVar;
        this.f8654b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8653a.a();
        this.f8655c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8654b;
        if (bVar.size() < 0) {
            a aVar = this.f8653a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8600f + aVar.f8599e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z9) {
        j jVar;
        if (z9) {
            jVar = this.f8660j;
            jVar.k();
        } else {
            jVar = this.f8661k;
            jVar.b();
        }
        this.f8659i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8656e) {
            this.d = kVar;
            this.f8656e = true;
            int i7 = kVar.f8650b;
            if (i7 == 2) {
                this.f8665o = ((i) kVar).f8642c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8648k != null) {
                b bVar = this.f8654b;
                if (bVar.size() < 0) {
                    a aVar = this.f8653a;
                    com.google.android.gms.internal.clearcut.z0 z0Var = new com.google.android.gms.internal.clearcut.z0(1);
                    z0Var.f7297b = aVar.f8600f + aVar.f8599e;
                    z0Var.f7298c = "Attributes incorrectly present on end tag";
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
        if (this.f8657f == null) {
            this.f8657f = str;
            return;
        }
        StringBuilder sb2 = this.f8658g;
        if (sb2.length() == 0) {
            sb2.append(this.f8657f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8664n);
    }

    public final void j() {
        g(this.f8663m);
    }

    public final void k() {
        j jVar = this.f8659i;
        if (jVar.f8643e != null) {
            jVar.j();
        }
        g(this.f8659i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8654b;
        if (bVar.size() < 0) {
            a aVar = this.f8653a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8600f + aVar.f8599e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8654b;
        if (bVar.size() < 0) {
            a aVar = this.f8653a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0(aVar.f8600f + aVar.f8599e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8665o != null && this.f8659i.i().equalsIgnoreCase(this.f8665o)) {
            return true;
        }
        return false;
    }
}
