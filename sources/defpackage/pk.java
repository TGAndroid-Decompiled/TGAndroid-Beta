package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class pk implements s84 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final int b;
    public final ip3 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public u84 l;
    public yzb m;
    public yzb n;
    public ix9 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = hac.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public pk(int i) {
        this.b = i;
        ip3 ip3Var = new ip3();
        this.c = ip3Var;
        this.n = ip3Var;
    }

    @Override
    public final int b(defpackage.t84 r28, defpackage.u21 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        return h((vb3) t84Var);
    }

    @Override
    public final void d(long j, long j2) {
        long g0;
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        ix9 ix9Var = this.o;
        if (ix9Var instanceof ip5) {
            ip5 ip5Var = (ip5) ix9Var;
            de deVar = ip5Var.b;
            if (deVar.b == 0) {
                g0 = -9223372036854775807L;
            } else {
                g0 = deVar.g0(hac.c(ip5Var.a, j));
            }
            this.k = g0;
            if (Math.abs(this.q - g0) < 20000) {
                return;
            }
            this.p = true;
            this.n = this.c;
        } else if (j != 0 && (ix9Var instanceof au2)) {
            au2 au2Var = (au2) ix9Var;
            this.k = ((Math.max(0L, j - au2Var.b) << 3) * 1000000) / au2Var.e;
        } else {
            this.k = 0L;
        }
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.l = u84Var;
        yzb c0 = u84Var.c0(0, 1);
        this.m = c0;
        this.n = c0;
        u84Var.B();
    }

    public final int g(vb3 vb3Var) {
        String str;
        boolean z;
        vb3Var.f = 0;
        byte[] bArr = this.a;
        vb3Var.d(bArr, 0, 1, false);
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
            throw bx7.a(sb.toString(), null);
        }
        throw bx7.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    public final boolean h(vb3 vb3Var) {
        vb3Var.f = 0;
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        vb3Var.d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            vb3Var.m(bArr.length, false);
            return true;
        }
        vb3Var.f = 0;
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        vb3Var.d(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        vb3Var.m(bArr3.length, false);
        return true;
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
