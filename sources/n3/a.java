package n3;

import d5.f0;
import h3.t1;
import java.nio.charset.Charset;
import java.util.Arrays;
import m3.g;
import m3.k;
import m3.l;
import m3.m;
import m3.t;
import m3.w;
import n8.d;
public final class a implements k {
    public static final int[] f18364p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f18365q;
    public static final byte[] f18366r;
    public static final byte[] f18367s;
    public static final int f18368t;
    public final int f18370b;
    public boolean f18371c;
    public long d;
    public int f18372e;
    public int f18373f;
    public boolean f18374g;
    public long h;
    public int f18376j;
    public long f18377k;
    public m f18378l;
    public w f18379m;
    public t f18380n;
    public boolean f18381o;
    public final byte[] f18369a = new byte[1];
    public int f18375i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f18365q = iArr;
        int i9 = f0.f4349a;
        Charset charset = d.f18513c;
        f18366r = "#!AMR\n".getBytes(charset);
        f18367s = "#!AMR-WB\n".getBytes(charset);
        f18368t = iArr[8];
    }

    public a(int i9) {
        this.f18370b = i9;
    }

    public final int a(l lVar) {
        String str;
        boolean z10;
        lVar.t();
        byte[] bArr = this.f18369a;
        lVar.c(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i9 = (b10 >> 3) & 15;
            if (i9 >= 0 && i9 <= 15 && (((z10 = this.f18371c) && (i9 < 10 || i9 > 13)) || (!z10 && (i9 < 12 || i9 > 14)))) {
                if (z10) {
                    return f18365q[i9];
                }
                return f18364p[i9];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.f18371c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i9);
            throw t1.a(sb2.toString(), null);
        }
        throw t1.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    @Override
    public final int b(m3.l r13, m3.n r14) {
        throw new UnsupportedOperationException("Method not decompiled: n3.a.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m mVar) {
        this.f18378l = mVar;
        this.f18379m = mVar.I(0, 1);
        mVar.B();
    }

    public final boolean d(l lVar) {
        lVar.t();
        byte[] bArr = f18366r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.c(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f18371c = false;
            lVar.u(bArr.length);
            return true;
        }
        lVar.t();
        byte[] bArr3 = f18367s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.c(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f18371c = true;
        lVar.u(bArr3.length);
        return true;
    }

    @Override
    public final boolean f(l lVar) {
        return d(lVar);
    }

    @Override
    public final void g(long j10, long j11) {
        this.d = 0L;
        this.f18372e = 0;
        this.f18373f = 0;
        if (j10 != 0) {
            t tVar = this.f18380n;
            if (tVar instanceof g) {
                g gVar = (g) tVar;
                this.f18377k = (Math.max(0L, j10 - gVar.f17229b) * 8000000) / gVar.f17231e;
                return;
            }
        }
        this.f18377k = 0L;
    }

    @Override
    public final void release() {
    }
}
