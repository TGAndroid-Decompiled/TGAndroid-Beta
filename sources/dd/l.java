package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8038r;
    public static final int[] f8039s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8040a;
    public final b f8041b;
    public k d;
    public j f8046i;
    public final i f8047j;
    public final h f8048k;
    public final d f8049l;
    public final f f8050m;
    public final e f8051n;
    public String f8052o;
    public final int[] f8053p;
    public final int[] f8054q;
    public b2 f8042c = b2.f7989a;
    public boolean f8043e = false;
    public String f8044f = null;
    public final StringBuilder f8045g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8038r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8035k = new cd.c();
        this.f8047j = jVar;
        this.f8048k = new j(3);
        this.f8049l = new k(5, 0);
        this.f8050m = new f();
        this.f8051n = new e();
        this.f8053p = new int[1];
        this.f8054q = new int[2];
        this.f8040a = aVar;
        this.f8041b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8040a.a();
        this.f8042c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8041b;
        if (bVar.size() < 0) {
            a aVar = this.f8040a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f7987f + aVar.f7986e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8047j;
            jVar.k();
        } else {
            jVar = this.f8048k;
            jVar.b();
        }
        this.f8046i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8043e) {
            this.d = kVar;
            this.f8043e = true;
            int i7 = kVar.f8037b;
            if (i7 == 2) {
                this.f8052o = ((i) kVar).f8029c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8035k != null) {
                b bVar = this.f8041b;
                if (bVar.size() < 0) {
                    a aVar = this.f8040a;
                    com.google.android.gms.internal.clearcut.y0 y0Var = new com.google.android.gms.internal.clearcut.y0(1);
                    y0Var.f6681b = aVar.f7987f + aVar.f7986e;
                    y0Var.f6682c = "Attributes incorrectly present on end tag";
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
        if (this.f8044f == null) {
            this.f8044f = str;
            return;
        }
        StringBuilder sb2 = this.f8045g;
        if (sb2.length() == 0) {
            sb2.append(this.f8044f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8051n);
    }

    public final void j() {
        g(this.f8050m);
    }

    public final void k() {
        j jVar = this.f8046i;
        if (jVar.f8030e != null) {
            jVar.j();
        }
        g(this.f8046i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8041b;
        if (bVar.size() < 0) {
            a aVar = this.f8040a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f7987f + aVar.f7986e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8041b;
        if (bVar.size() < 0) {
            a aVar = this.f8040a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f7987f + aVar.f7986e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8052o != null && this.f8046i.i().equalsIgnoreCase(this.f8052o)) {
            return true;
        }
        return false;
    }
}
