package g3;

import e2.t0;
import f3.c0;
import f3.j0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.z;
import f5.u;
import h2.m0;
import h9.g0;
import h9.i0;
import h9.t1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f13474s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f13475t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f13476u;
    public static final byte[] v;
    public final int f13478b;
    public final n f13479c;
    public boolean d;
    public long f13480e;
    public int f13481f;
    public int f13482g;
    public long h;
    public int f13484j;
    public long f13485k;
    public q f13486l;
    public j0 f13487m;
    public j0 f13488n;
    public c0 f13489o;
    public boolean f13490p;
    public long f13491q;
    public boolean f13492r;
    public final byte[] f13477a = new byte[1];
    public int f13483i = -1;

    static {
        String str = m0.f14114a;
        Charset charset = StandardCharsets.UTF_8;
        f13476u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i7) {
        this.f13478b = i7;
        n nVar = new n();
        this.f13479c = nVar;
        this.f13488n = nVar;
    }

    @Override
    public final boolean b(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f13486l = qVar;
        j0 O1 = qVar.O1(0, 1);
        this.f13487m = O1;
        this.f13488n = O1;
        qVar.U0();
    }

    @Override
    public final void d(long j3, long j10) {
        long m10;
        this.f13480e = 0L;
        this.f13481f = 0;
        this.f13482g = 0;
        this.f13491q = j10;
        c0 c0Var = this.f13489o;
        if (c0Var instanceof z) {
            z zVar = (z) c0Var;
            u uVar = zVar.f11108b;
            if (uVar.f11195b == 0) {
                m10 = -9223372036854775807L;
            } else {
                m10 = uVar.m(m0.c(zVar.f11107a, j3));
            }
            this.f13485k = m10;
            if (Math.abs(this.f13491q - m10) < 20000) {
                return;
            }
            this.f13490p = true;
            this.f13488n = this.f13479c;
        } else if (j3 != 0 && (c0Var instanceof k)) {
            k kVar = (k) c0Var;
            this.f13485k = (Math.max(0L, j3 - kVar.f11049b) * 8000000) / kVar.f11051e;
        } else {
            this.f13485k = 0L;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(f3.p r19, f3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: g3.a.f(f3.p, f3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z9;
        pVar.q();
        byte[] bArr = this.f13477a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i7 = (b10 >> 3) & 15;
            if (i7 >= 0 && i7 <= 15 && (((z9 = this.d) && (i7 < 10 || i7 > 13)) || (!z9 && (i7 < 12 || i7 > 14)))) {
                if (z9) {
                    return f13475t[i7];
                }
                return f13474s[i7];
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
        pVar.q();
        byte[] bArr = f13476u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.s(bArr.length);
            return true;
        }
        pVar.q();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.s(bArr3.length);
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
