package defpackage;

import java.util.Arrays;
public final class bub {
    public static final char[] r;
    public static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final ik1 a;
    public final fy7 b;
    public iu5 d;
    public wtb i;
    public final vtb j;
    public final utb k;
    public final qtb l;
    public final stb m;
    public final rtb n;
    public String o;
    public final int[] p;
    public final int[] q;
    public rwb c = rwb.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public bub(ik1 ik1Var, fy7 fy7Var) {
        ?? wtbVar = new wtb(2);
        wtbVar.m = new gy();
        this.j = wtbVar;
        this.k = new wtb(3);
        this.l = new iu5(5, (byte) 2);
        this.m = new stb();
        this.n = new rtb();
        this.p = new int[1];
        this.q = new int[2];
        this.a = ik1Var;
        this.b = fy7Var;
    }

    public final void a(rwb rwbVar) {
        this.a.a();
        this.c = rwbVar;
    }

    public final void b(String str) {
        fy7 fy7Var = this.b;
        if (fy7Var.size() < 0) {
            ik1 ik1Var = this.a;
            fy7Var.add(new pi5(ik1Var.f + ik1Var.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bub.c(java.lang.Character, boolean):int[]");
    }

    public final wtb d(boolean z) {
        wtb wtbVar;
        if (z) {
            wtbVar = this.j;
            wtbVar.B();
        } else {
            wtbVar = this.k;
            wtbVar.s();
        }
        this.i = wtbVar;
        return wtbVar;
    }

    public final void e() {
        iu5.t(this.h);
    }

    public final void f(char c) {
        h(String.valueOf(c));
    }

    public final void g(iu5 iu5Var) {
        if (!this.e) {
            this.d = iu5Var;
            this.e = true;
            int i = iu5Var.b;
            if (i == 2) {
                this.o = ((vtb) iu5Var).e;
                return;
            } else if (i == 3 && ((utb) iu5Var).m != null) {
                fy7 fy7Var = this.b;
                if (fy7Var.size() < 0) {
                    ik1 ik1Var = this.a;
                    pi5 pi5Var = new pi5();
                    pi5Var.b = ik1Var.f + ik1Var.e;
                    pi5Var.c = "Attributes incorrectly present on end tag";
                    fy7Var.add(pi5Var);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        lq5.j("There is an unread token pending!");
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
        wtb wtbVar = this.i;
        if (wtbVar.g != null) {
            wtbVar.A();
        }
        g(this.i);
    }

    public final void l(rwb rwbVar) {
        fy7 fy7Var = this.b;
        if (fy7Var.size() < 0) {
            ik1 ik1Var = this.a;
            fy7Var.add(new pi5(ik1Var.f + ik1Var.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{rwbVar}));
        }
    }

    public final void m(rwb rwbVar) {
        fy7 fy7Var = this.b;
        if (fy7Var.size() < 0) {
            ik1 ik1Var = this.a;
            fy7Var.add(new pi5(ik1Var.f + ik1Var.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(ik1Var.i()), rwbVar}));
        }
    }

    public final boolean n() {
        if (this.o != null && this.i.z().equalsIgnoreCase(this.o)) {
            return true;
        }
        return false;
    }
}
