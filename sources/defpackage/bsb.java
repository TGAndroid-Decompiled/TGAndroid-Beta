package defpackage;

import java.util.Arrays;
public final class bsb {
    public static final char[] r;
    public static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final hl1 a;
    public final zw7 b;
    public eu5 d;
    public wrb i;
    public final vrb j;
    public final urb k;
    public final qrb l;
    public final srb m;
    public final rrb n;
    public String o;
    public final int[] p;
    public final int[] q;
    public rub c = rub.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public bsb(hl1 hl1Var, zw7 zw7Var) {
        ?? wrbVar = new wrb(2);
        wrbVar.m = new fz();
        this.j = wrbVar;
        this.k = new wrb(3);
        this.l = new eu5(5, (byte) 2);
        this.m = new srb();
        this.n = new rrb();
        this.p = new int[1];
        this.q = new int[2];
        this.a = hl1Var;
        this.b = zw7Var;
    }

    public final void a(rub rubVar) {
        this.a.a();
        this.c = rubVar;
    }

    public final void b(String str) {
        zw7 zw7Var = this.b;
        if (zw7Var.size() < 0) {
            hl1 hl1Var = this.a;
            zw7Var.add(new mi5(hl1Var.f + hl1Var.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsb.c(java.lang.Character, boolean):int[]");
    }

    public final wrb d(boolean z) {
        wrb wrbVar;
        if (z) {
            wrbVar = this.j;
            wrbVar.B();
        } else {
            wrbVar = this.k;
            wrbVar.s();
        }
        this.i = wrbVar;
        return wrbVar;
    }

    public final void e() {
        eu5.t(this.h);
    }

    public final void f(char c) {
        h(String.valueOf(c));
    }

    public final void g(eu5 eu5Var) {
        if (!this.e) {
            this.d = eu5Var;
            this.e = true;
            int i = eu5Var.b;
            if (i == 2) {
                this.o = ((vrb) eu5Var).e;
                return;
            } else if (i == 3 && ((urb) eu5Var).m != null) {
                zw7 zw7Var = this.b;
                if (zw7Var.size() < 0) {
                    hl1 hl1Var = this.a;
                    mi5 mi5Var = new mi5();
                    mi5Var.b = hl1Var.f + hl1Var.e;
                    mi5Var.c = "Attributes incorrectly present on end tag";
                    zw7Var.add(mi5Var);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        u36.j("There is an unread token pending!");
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
        wrb wrbVar = this.i;
        if (wrbVar.g != null) {
            wrbVar.A();
        }
        g(this.i);
    }

    public final void l(rub rubVar) {
        zw7 zw7Var = this.b;
        if (zw7Var.size() < 0) {
            hl1 hl1Var = this.a;
            zw7Var.add(new mi5(hl1Var.f + hl1Var.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{rubVar}));
        }
    }

    public final void m(rub rubVar) {
        zw7 zw7Var = this.b;
        if (zw7Var.size() < 0) {
            hl1 hl1Var = this.a;
            zw7Var.add(new mi5(hl1Var.f + hl1Var.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(hl1Var.i()), rubVar}));
        }
    }

    public final boolean n() {
        if (this.o != null && this.i.z().equalsIgnoreCase(this.o)) {
            return true;
        }
        return false;
    }
}
