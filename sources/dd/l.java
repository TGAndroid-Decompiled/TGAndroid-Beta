package dd;

import java.util.Arrays;
public final class l {
    public static final char[] f8315r;
    public static final int[] f8316s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f8317a;
    public final b f8318b;
    public k d;
    public j f8323i;
    public final i f8324j;
    public final h f8325k;
    public final d f8326l;
    public final f f8327m;
    public final e f8328n;
    public String f8329o;
    public final int[] f8330p;
    public final int[] f8331q;
    public b2 f8319c = b2.f8266a;
    public boolean f8320e = false;
    public String f8321f = null;
    public final StringBuilder f8322g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f8315r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f8312k = new cd.c();
        this.f8324j = jVar;
        this.f8325k = new j(3);
        this.f8326l = new k(5, 0);
        this.f8327m = new f();
        this.f8328n = new e();
        this.f8330p = new int[1];
        this.f8331q = new int[2];
        this.f8317a = aVar;
        this.f8318b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f8317a.a();
        this.f8319c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f8318b;
        if (bVar.size() < 0) {
            a aVar = this.f8317a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8264f + aVar.f8263e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: dd.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f8324j;
            jVar.k();
        } else {
            jVar = this.f8325k;
            jVar.b();
        }
        this.f8323i = jVar;
        return jVar;
    }

    public final void e() {
        k.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(k kVar) {
        if (!this.f8320e) {
            this.d = kVar;
            this.f8320e = true;
            int i7 = kVar.f8314b;
            if (i7 == 2) {
                this.f8329o = ((i) kVar).f8306c;
                return;
            } else if (i7 == 3 && ((h) kVar).f8312k != null) {
                b bVar = this.f8318b;
                if (bVar.size() < 0) {
                    a aVar = this.f8317a;
                    com.google.android.gms.internal.clearcut.y0 y0Var = new com.google.android.gms.internal.clearcut.y0(1);
                    y0Var.f6959b = aVar.f8264f + aVar.f8263e;
                    y0Var.f6960c = "Attributes incorrectly present on end tag";
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
        if (this.f8321f == null) {
            this.f8321f = str;
            return;
        }
        StringBuilder sb2 = this.f8322g;
        if (sb2.length() == 0) {
            sb2.append(this.f8321f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f8328n);
    }

    public final void j() {
        g(this.f8327m);
    }

    public final void k() {
        j jVar = this.f8323i;
        if (jVar.f8307e != null) {
            jVar.j();
        }
        g(this.f8323i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f8318b;
        if (bVar.size() < 0) {
            a aVar = this.f8317a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8264f + aVar.f8263e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f8318b;
        if (bVar.size() < 0) {
            a aVar = this.f8317a;
            bVar.add(new com.google.android.gms.internal.clearcut.y0(aVar.f8264f + aVar.f8263e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f8329o != null && this.f8323i.i().equalsIgnoreCase(this.f8329o)) {
            return true;
        }
        return false;
    }
}
