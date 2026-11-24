package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class pj implements j74 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final int b;
    public final yn3 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public l74 l;
    public wxb m;
    public wxb n;
    public fv9 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = g8c.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public pj(int i) {
        this.b = i;
        yn3 yn3Var = new yn3();
        this.c = yn3Var;
        this.n = yn3Var;
    }

    @Override
    public final int b(defpackage.k74 r28, defpackage.m11 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        return h((ja3) k74Var);
    }

    @Override
    public final void d(long j, long j2) {
        long f0;
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        fv9 fv9Var = this.o;
        if (fv9Var instanceof in5) {
            in5 in5Var = (in5) fv9Var;
            dd ddVar = in5Var.b;
            if (ddVar.b == 0) {
                f0 = -9223372036854775807L;
            } else {
                f0 = ddVar.f0(g8c.c(in5Var.a, j));
            }
            this.k = f0;
            if (Math.abs(this.q - f0) < 20000) {
                return;
            }
            this.p = true;
            this.n = this.c;
        } else if (j != 0 && (fv9Var instanceof ps2)) {
            ps2 ps2Var = (ps2) fv9Var;
            this.k = ((Math.max(0L, j - ps2Var.b) << 3) * 1000000) / ps2Var.e;
        } else {
            this.k = 0L;
        }
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.l = l74Var;
        wxb T = l74Var.T(0, 1);
        this.m = T;
        this.n = T;
        l74Var.B();
    }

    public final int g(ja3 ja3Var) {
        String str;
        boolean z;
        ja3Var.f = 0;
        byte[] bArr = this.a;
        ja3Var.d(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) <= 0) {
            int i = (b >> 3) & 15;
            if (i >= 0 && i <= 15 && (!(z = this.d) ? i < 12 || i > 14 : i < 10 || i > 13)) {
                if (z) {
                    return t[i];
                }
                return s[i];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.d) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i);
            throw av7.a(sb.toString(), null);
        }
        throw av7.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    public final boolean h(ja3 ja3Var) {
        ja3Var.f = 0;
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        ja3Var.d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            ja3Var.l(bArr.length, false);
            return true;
        }
        ja3Var.f = 0;
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        ja3Var.d(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        ja3Var.l(bArr3.length, false);
        return true;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
