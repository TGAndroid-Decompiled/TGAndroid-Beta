package nc;

import java.util.Arrays;
public final class l {
    public static final char[] f17286r;
    public static final int[] f17287s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f17288a;
    public final b f17289b;
    public k d;
    public j f17294i;
    public final i f17295j;
    public final h f17296k;
    public final d f17297l;
    public final f f17298m;
    public final e f17299n;
    public String f17300o;
    public final int[] f17301p;
    public final int[] f17302q;
    public b2 f17290c = b2.f17237a;
    public boolean f17291e = false;
    public String f17292f = null;
    public final StringBuilder f17293g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f17286r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f17283k = new mc.b();
        this.f17295j = jVar;
        this.f17296k = new j(3);
        this.f17297l = new k(5, 0);
        this.f17298m = new f();
        this.f17299n = new e();
        this.f17301p = new int[1];
        this.f17302q = new int[2];
        this.f17288a = aVar;
        this.f17289b = bVar;
    }

    public final void a(b2 b2Var) {
        this.f17288a.a();
        this.f17290c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.f17289b;
        if (bVar.size() < 0) {
            a aVar = this.f17288a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Invalid character reference: %s", aVar.f17235f + aVar.f17234e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: nc.l.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f17295j;
            jVar.l();
        } else {
            jVar = this.f17296k;
            jVar.c();
        }
        this.f17294i = jVar;
        return jVar;
    }

    public final void e() {
        k.d(this.h);
    }

    public final void f(char c3) {
        g(String.valueOf(c3));
    }

    public final void g(String str) {
        if (this.f17292f == null) {
            this.f17292f = str;
            return;
        }
        StringBuilder sb2 = this.f17293g;
        if (sb2.length() == 0) {
            sb2.append(this.f17292f);
        }
        sb2.append(str);
    }

    public final void h(k kVar) {
        if (!this.f17291e) {
            this.d = kVar;
            this.f17291e = true;
            int i10 = kVar.f17285b;
            if (i10 == 2) {
                this.f17300o = ((i) kVar).f17277c;
                return;
            } else if (i10 == 3 && ((h) kVar).f17283k != null) {
                b bVar = this.f17289b;
                if (bVar.size() < 0) {
                    a aVar = this.f17288a;
                    com.google.android.gms.internal.clearcut.a1 a1Var = new com.google.android.gms.internal.clearcut.a1();
                    a1Var.f4346b = aVar.f17235f + aVar.f17234e;
                    a1Var.f4347c = "Attributes incorrectly present on end tag";
                    bVar.add(a1Var);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("There is an unread token pending!");
    }

    public final void i() {
        h(this.f17299n);
    }

    public final void j() {
        h(this.f17298m);
    }

    public final void k() {
        j jVar = this.f17294i;
        if (jVar.f17278e != null) {
            jVar.k();
        }
        h(this.f17294i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.f17289b;
        if (bVar.size() < 0) {
            a aVar = this.f17288a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f17235f + aVar.f17234e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.f17289b;
        if (bVar.size() < 0) {
            a aVar = this.f17288a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Unexpected character '%s' in input state [%s]", aVar.f17235f + aVar.f17234e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        if (this.f17300o != null && this.f17294i.j().equalsIgnoreCase(this.f17300o)) {
            return true;
        }
        return false;
    }
}
