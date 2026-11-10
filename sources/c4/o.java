package c4;

import a8.ia;
import e2.s0;
import e2.t;
import e2.u;
import f3.j0;
import h2.m0;
import h2.x;
import java.io.EOFException;
import org.telegram.ui.Cells.f1;
public final class o implements j0 {
    public final j0 f5299a;
    public final k f5300b;
    public m f5304g;
    public u h;
    public boolean f5305i;
    public int d = 0;
    public int f5302e = 0;
    public byte[] f5303f = m0.f14115b;
    public final x f5301c = new x();

    public o(j0 j0Var, k kVar) {
        this.f5299a = j0Var;
        this.f5300b = kVar;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        if (this.f5304g == null) {
            this.f5299a.a(xVar, i7, i10);
            return;
        }
        h(i7);
        xVar.k(this.f5302e, i7, this.f5303f);
        this.f5302e += i7;
    }

    @Override
    public final void b(int i7, x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, f3.i0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: c4.o.c(long, int, int, int, f3.i0):void");
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z9) {
        if (this.f5304g == null) {
            return this.f5299a.f(nVar, i7, z9);
        }
        h(i7);
        int read = nVar.read(this.f5303f, this.f5302e, i7);
        if (read == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        this.f5302e += read;
        return read;
    }

    @Override
    public final void g(u uVar) {
        boolean z9;
        m mVar;
        uVar.f10620s.getClass();
        String str = uVar.f10620s;
        if (s0.h(str) == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        boolean equals = uVar.equals(this.h);
        k kVar = this.f5300b;
        if (!equals) {
            this.h = uVar;
            if (kVar.w(uVar)) {
                mVar = kVar.l(uVar);
            } else {
                mVar = null;
            }
            this.f5304g = mVar;
        }
        m mVar2 = this.f5304g;
        j0 j0Var = this.f5299a;
        if (mVar2 == null) {
            j0Var.g(uVar);
            return;
        }
        t a10 = uVar.a();
        a10.f10568r = s0.n("application/x-media3-cues");
        a10.f10560j = str;
        a10.f10572w = Long.MAX_VALUE;
        a10.P = kVar.D(uVar);
        f1.s(a10, j0Var);
    }

    public final void h(int i7) {
        byte[] bArr;
        int length = this.f5303f.length;
        int i10 = this.f5302e;
        if (length - i10 >= i7) {
            return;
        }
        int i11 = i10 - this.d;
        int max = Math.max(i11 * 2, i7 + i11);
        byte[] bArr2 = this.f5303f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i11);
        this.d = 0;
        this.f5302e = i11;
        this.f5303f = bArr;
    }

    @Override
    public final void d(long j3) {
    }
}
