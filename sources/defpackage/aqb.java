package defpackage;

import java.util.Arrays;
public final class aqb {
    public static final char[] r;
    public static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final zj1 a;
    public final yu7 b;
    public fs5 d;
    public vpb i;
    public final upb j;
    public final tpb k;
    public final ppb l;
    public final rpb m;
    public final qpb n;
    public String o;
    public final int[] p;
    public final int[] q;
    public qsb c = qsb.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public aqb(zj1 zj1Var, yu7 yu7Var) {
        ?? vpbVar = new vpb(2);
        vpbVar.m = new fy();
        this.j = vpbVar;
        this.k = new vpb(3);
        this.l = new fs5(5, (byte) 2);
        this.m = new rpb();
        this.n = new qpb();
        this.p = new int[1];
        this.q = new int[2];
        this.a = zj1Var;
        this.b = yu7Var;
    }

    public final void a(qsb qsbVar) {
        this.a.a();
        this.c = qsbVar;
    }

    public final void b(String str) {
        yu7 yu7Var = this.b;
        if (yu7Var.size() < 0) {
            zj1 zj1Var = this.a;
            yu7Var.add(new ng5(zj1Var.f + zj1Var.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqb.c(java.lang.Character, boolean):int[]");
    }

    public final vpb d(boolean z) {
        vpb vpbVar;
        if (z) {
            vpbVar = this.j;
            vpbVar.B();
        } else {
            vpbVar = this.k;
            vpbVar.s();
        }
        this.i = vpbVar;
        return vpbVar;
    }

    public final void e() {
        fs5.t(this.h);
    }

    public final void f(char c) {
        h(String.valueOf(c));
    }

    public final void g(fs5 fs5Var) {
        if (!this.e) {
            this.d = fs5Var;
            this.e = true;
            int i = fs5Var.b;
            if (i == 2) {
                this.o = ((upb) fs5Var).e;
                return;
            } else if (i == 3 && ((tpb) fs5Var).m != null) {
                yu7 yu7Var = this.b;
                if (yu7Var.size() < 0) {
                    zj1 zj1Var = this.a;
                    ng5 ng5Var = new ng5();
                    ng5Var.b = zj1Var.f + zj1Var.e;
                    ng5Var.c = "Attributes incorrectly present on end tag";
                    yu7Var.add(ng5Var);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        w26.j("There is an unread token pending!");
    }

    public final void h(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        StringBuilder sb = this.g;
        if (sb.length() == 0) {
            sb.append(this.f);
        }
        sb.append(str);
    }

    public final void i() {
        g(this.n);
    }

    public final void j() {
        g(this.m);
    }

    public final void k() {
        vpb vpbVar = this.i;
        if (vpbVar.g != null) {
            vpbVar.A();
        }
        g(this.i);
    }

    public final void l(qsb qsbVar) {
        yu7 yu7Var = this.b;
        if (yu7Var.size() < 0) {
            zj1 zj1Var = this.a;
            yu7Var.add(new ng5(zj1Var.f + zj1Var.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{qsbVar}));
        }
    }

    public final void m(qsb qsbVar) {
        yu7 yu7Var = this.b;
        if (yu7Var.size() < 0) {
            zj1 zj1Var = this.a;
            yu7Var.add(new ng5(zj1Var.f + zj1Var.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(zj1Var.i()), qsbVar}));
        }
    }

    public final boolean n() {
        if (this.o != null && this.i.z().equalsIgnoreCase(this.o)) {
            return true;
        }
        return false;
    }
}
