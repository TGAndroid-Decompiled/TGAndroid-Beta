package g3;

import e2.t0;
import f3.b0;
import f3.i0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.y;
import f5.v;
import h2.l0;
import h9.g0;
import h9.s1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f12823s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f12824t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f12825u;
    public static final byte[] v;
    public final int f12827b;
    public final n f12828c;
    public boolean d;
    public long f12829e;
    public int f12830f;
    public int f12831g;
    public long h;
    public int f12833j;
    public long f12834k;
    public q f12835l;
    public i0 f12836m;
    public i0 f12837n;
    public b0 f12838o;
    public boolean f12839p;
    public long f12840q;
    public boolean f12841r;
    public final byte[] f12826a = new byte[1];
    public int f12832i = -1;

    static {
        String str = l0.f13471a;
        Charset charset = StandardCharsets.UTF_8;
        f12825u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i7) {
        this.f12827b = i7;
        n nVar = new n();
        this.f12828c = nVar;
        this.f12837n = nVar;
    }

    @Override
    public final boolean b(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f12835l = qVar;
        i0 d2 = qVar.d2(0, 1);
        this.f12836m = d2;
        this.f12837n = d2;
        qVar.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        long m10;
        this.f12829e = 0L;
        this.f12830f = 0;
        this.f12831g = 0;
        this.f12840q = j10;
        b0 b0Var = this.f12838o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            v vVar = yVar.f10909b;
            if (vVar.f11018b == 0) {
                m10 = -9223372036854775807L;
            } else {
                m10 = vVar.m(l0.c(yVar.f10908a, j3));
            }
            this.f12834k = m10;
            if (Math.abs(this.f12840q - m10) < 20000) {
                return;
            }
            this.f12839p = true;
            this.f12837n = this.f12828c;
        } else if (j3 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f12834k = (Math.max(0L, j3 - kVar.f10857b) * 8000000) / kVar.f10859e;
        } else {
            this.f12834k = 0L;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f13686b;
        return s1.f13749e;
    }

    @Override
    public final int f(f3.p r19, f3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: g3.a.f(f3.p, f3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z10;
        pVar.l();
        byte[] bArr = this.f12826a;
        pVar.c(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i7 = (b10 >> 3) & 15;
            if (i7 >= 0 && i7 <= 15 && (((z10 = this.d) && (i7 < 10 || i7 > 13)) || (!z10 && (i7 < 12 || i7 > 14)))) {
                if (z10) {
                    return f12824t[i7];
                }
                return f12823s[i7];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.d) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i7);
            throw t0.a(null, sb2.toString());
        }
        throw t0.a(null, "Invalid padding bits for frame header " + ((int) b10));
    }

    public final boolean h(p pVar) {
        pVar.l();
        byte[] bArr = f12825u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.c(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.m(bArr.length);
            return true;
        }
        pVar.l();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.c(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.m(bArr3.length);
        return true;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
