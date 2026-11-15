package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8041r;
    public static final int[] f8042s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8043a;
    public final b f8044b;
    public k d;
    public j f8049i;
    public final i f8050j;
    public final h f8051k;
    public final d f8052l;
    public final f f8053m;
    public final e f8054n;
    public String f8055o;
    public final int[] f8056p;
    public final int[] f8057q;
    public b2 f8045c = b2.f7992a;
    public boolean f8046e = false;
    public String f8047f = null;
    public final StringBuilder f8048g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8041r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8038k = new cd.c();
        this.f8050j = jVar;
        this.f8051k = new j(3);
        this.f8052l = new k(5, 0);
        this.f8053m = new f();
        this.f8054n = new e();
        this.f8056p = new int[1];
        this.f8057q = new int[2];
        this.f8043a = aVar;
        this.f8044b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8043a.a();
        this.f8045c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8044b;
        if (bVar.size() < 0) {
            a aVar = this.f8043a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f7990f + aVar.f7989e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8050j;
            jVar.k();
        } else {
            jVar = this.f8051k;
            jVar.b();
        }
        this.f8049i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8046e) {
            this.d = kVar;
            this.f8046e = true;
            int i7 = kVar.f8040b;
            if (i7 == 2) {
                this.f8055o = ((i) kVar).f8032c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8038k != null) {
                b bVar = this.f8044b;
                if (bVar.size() < 0) {
                    a aVar = this.f8043a;
                    com.google.android.gms.internal.clearcut.y0 y0Var = new com.google.android.gms.internal.clearcut.y0(1);
                    y0Var.f6684b = aVar.f7990f + aVar.f7989e;
                    y0Var.f6685c = "Attributes incorrectly present on end tag";
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
        if (this.f8047f == null) {
            this.f8047f = str;
            return;
        }
        StringBuilder sb2 = this.f8048g;
        if (sb2.length() == 0) {
            sb2.append(this.f8047f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8054n);
    }

    public final void j() {
        g(this.f8053m);
    }

    public final void k() {
        j jVar = this.f8049i;
        if (jVar.f8033e != null) {
            jVar.j();
        }
        g(this.f8049i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8044b;
        if (bVar.size() < 0) {
            a aVar = this.f8043a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f7990f + aVar.f7989e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8044b;
        if (bVar.size() < 0) {
            a aVar = this.f8043a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f7990f + aVar.f7989e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8055o != null && this.f8049i.i().equalsIgnoreCase(this.f8055o)) {
            return true;
        }
        return false;
    }
}
