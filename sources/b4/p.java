package b4;

import b8.zb;
import d2.u;
import d2.u0;
import d2.v;
import e3.i0;
import g2.n0;
import g2.y;
import java.io.EOFException;
import org.telegram.ui.Cells.f1;
public final class p implements i0 {
    public final i0 f2383a;
    public final k f2384b;
    public m f2388g;
    public v h;
    public boolean f2389i;
    public int d = 0;
    public int f2386e = 0;
    public byte[] f2387f = n0.f11874b;
    public final y f2385c = new y();

    public p(i0 i0Var, k kVar) {
        this.f2383a = i0Var;
        this.f2384b = kVar;
    }

    @Override
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override
    public final int c(d2.o oVar, int i3, boolean z10) {
        if (this.f2388g == null) {
            return this.f2383a.c(oVar, i3, z10);
        }
        h(i3);
        int read = oVar.read(this.f2387f, this.f2386e, i3);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f2386e += read;
        return read;
    }

    @Override
    public final void d(long r9, int r11, int r12, int r13, e3.h0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: b4.p.d(long, int, int, int, e3.h0):void");
    }

    @Override
    public final void e(int i3, y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override
    public final void f(y yVar, int i3, int i10) {
        if (this.f2388g == null) {
            this.f2383a.f(yVar, i3, i10);
            return;
        }
        h(i3);
        yVar.k(this.f2386e, i3, this.f2387f);
        this.f2386e += i3;
    }

    @Override
    public final void g(v vVar) {
        boolean z10;
        m mVar;
        vVar.f8489s.getClass();
        String str = vVar.f8489s;
        if (u0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        boolean equals = vVar.equals(this.h);
        k kVar = this.f2384b;
        if (!equals) {
            this.h = vVar;
            if (kVar.l(vVar)) {
                mVar = kVar.h(vVar);
            } else {
                mVar = null;
            }
            this.f2388g = mVar;
        }
        m mVar2 = this.f2388g;
        i0 i0Var = this.f2383a;
        if (mVar2 == null) {
            i0Var.g(vVar);
            return;
        }
        u a10 = vVar.a();
        a10.f8431r = u0.n("application/x-media3-cues");
        a10.f8423j = str;
        a10.f8435w = Long.MAX_VALUE;
        a10.P = kVar.q0(vVar);
        f1.w(a10, i0Var);
    }

    public final void h(int i3) {
        byte[] bArr;
        int length = this.f2387f.length;
        int i10 = this.f2386e;
        if (length - i10 >= i3) {
            return;
        }
        int i11 = i10 - this.d;
        int max = Math.max(i11 * 2, i3 + i11);
        byte[] bArr2 = this.f2387f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i11);
        this.d = 0;
        this.f2386e = i11;
        this.f2387f = bArr;
    }

    @Override
    public final void b(long j10) {
    }
}
