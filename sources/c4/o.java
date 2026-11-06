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
    public final j0 f5296a;
    public final k f5297b;
    public m f5301g;
    public u h;
    public boolean f5302i;
    public int d = 0;
    public int f5299e = 0;
    public byte[] f5300f = m0.f14113b;
    public final x f5298c = new x();

    public o(j0 j0Var, k kVar) {
        this.f5296a = j0Var;
        this.f5297b = kVar;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        if (this.f5301g == null) {
            this.f5296a.a(xVar, i7, i10);
            return;
        }
        h(i7);
        xVar.k(this.f5299e, i7, this.f5300f);
        this.f5299e += i7;
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
        if (this.f5301g == null) {
            return this.f5296a.f(nVar, i7, z9);
        }
        h(i7);
        int read = nVar.read(this.f5300f, this.f5299e, i7);
        if (read == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        this.f5299e += read;
        return read;
    }

    @Override
    public final void g(u uVar) {
        boolean z9;
        m mVar;
        uVar.f10615s.getClass();
        String str = uVar.f10615s;
        if (s0.h(str) == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        boolean equals = uVar.equals(this.h);
        k kVar = this.f5297b;
        if (!equals) {
            this.h = uVar;
            if (kVar.w(uVar)) {
                mVar = kVar.l(uVar);
            } else {
                mVar = null;
            }
            this.f5301g = mVar;
        }
        m mVar2 = this.f5301g;
        j0 j0Var = this.f5296a;
        if (mVar2 == null) {
            j0Var.g(uVar);
            return;
        }
        t a10 = uVar.a();
        a10.f10563r = s0.n("application/x-media3-cues");
        a10.f10555j = str;
        a10.f10567w = Long.MAX_VALUE;
        a10.P = kVar.D(uVar);
        f1.s(a10, j0Var);
    }

    public final void h(int i7) {
        byte[] bArr;
        int length = this.f5300f.length;
        int i10 = this.f5299e;
        if (length - i10 >= i7) {
            return;
        }
        int i11 = i10 - this.d;
        int max = Math.max(i11 * 2, i7 + i11);
        byte[] bArr2 = this.f5300f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i11);
        this.d = 0;
        this.f5299e = i11;
        this.f5300f = bArr;
    }

    @Override
    public final void d(long j3) {
    }
}
