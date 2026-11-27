package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class qj implements e84 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final int b;
    public final po3 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public g84 l;
    public x1c m;
    public x1c n;
    public zy9 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = gcc.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public qj(int i) {
        this.b = i;
        po3 po3Var = new po3();
        this.c = po3Var;
        this.n = po3Var;
    }

    @Override
    public final int b(defpackage.f84 r28, defpackage.v11 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        return h((cb3) f84Var);
    }

    @Override
    public final void d(long j, long j2) {
        long h0;
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        zy9 zy9Var = this.o;
        if (zy9Var instanceof lp5) {
            lp5 lp5Var = (lp5) zy9Var;
            ed edVar = lp5Var.b;
            if (edVar.b == 0) {
                h0 = -9223372036854775807L;
            } else {
                h0 = edVar.h0(gcc.c(lp5Var.a, j));
            }
            this.k = h0;
            if (Math.abs(this.q - h0) < 20000) {
                return;
            }
            this.p = true;
            this.n = this.c;
        } else if (j != 0 && (zy9Var instanceof jt2)) {
            jt2 jt2Var = (jt2) zy9Var;
            this.k = ((Math.max(0L, j - jt2Var.b) << 3) * 1000000) / jt2Var.e;
        } else {
            this.k = 0L;
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.l = g84Var;
        x1c e0 = g84Var.e0(0, 1);
        this.m = e0;
        this.n = e0;
        g84Var.D();
    }

    public final int g(cb3 cb3Var) {
        String str;
        boolean z;
        cb3Var.f = 0;
        byte[] bArr = this.a;
        cb3Var.d(bArr, 0, 1, false);
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
            throw hy7.a(sb.toString(), null);
        }
        throw hy7.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    public final boolean h(cb3 cb3Var) {
        cb3Var.f = 0;
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        cb3Var.d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            cb3Var.l(bArr.length, false);
            return true;
        }
        cb3Var.f = 0;
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        cb3Var.d(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        cb3Var.l(bArr3.length, false);
        return true;
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
