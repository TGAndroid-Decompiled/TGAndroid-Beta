package c4;

import a8.la;
import com.google.android.gms.internal.vision.e2;
import e2.s0;
import e2.t;
import e2.u;
import f3.i0;
import h2.l0;
import h2.x;
import java.io.EOFException;
public final class o implements i0 {
    public final i0 f4399a;
    public final k f4400b;
    public m f4404g;
    public u h;
    public boolean f4405i;
    public int d = 0;
    public int f4402e = 0;
    public byte[] f4403f = l0.f13784b;
    public final x f4401c = new x();

    public o(i0 i0Var, k kVar) {
        this.f4399a = i0Var;
        this.f4400b = kVar;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        if (this.f4404g == null) {
            this.f4399a.a(xVar, i7, i10);
            return;
        }
        h(i7);
        xVar.k(this.f4402e, i7, this.f4403f);
        this.f4402e += i7;
    }

    @Override
    public final void b(int i7, x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override
    public final void c(long r9, int r11, int r12, int r13, f3.h0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: c4.o.c(long, int, int, int, f3.h0):void");
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        if (this.f4404g == null) {
            return this.f4399a.f(nVar, i7, z10);
        }
        h(i7);
        int read = nVar.read(this.f4403f, this.f4402e, i7);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f4402e += read;
        return read;
    }

    @Override
    public final void g(u uVar) {
        boolean z10;
        m mVar;
        uVar.f10766s.getClass();
        String str = uVar.f10766s;
        if (s0.h(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        boolean equals = uVar.equals(this.h);
        k kVar = this.f4400b;
        if (!equals) {
            this.h = uVar;
            if (kVar.H(uVar)) {
                mVar = kVar.j(uVar);
            } else {
                mVar = null;
            }
            this.f4404g = mVar;
        }
        m mVar2 = this.f4404g;
        i0 i0Var = this.f4399a;
        if (mVar2 == null) {
            i0Var.g(uVar);
            return;
        }
        t a10 = uVar.a();
        a10.f10714r = s0.n("application/x-media3-cues");
        a10.f10706j = str;
        a10.f10718w = Long.MAX_VALUE;
        a10.P = kVar.O(uVar);
        p5.c.r(a10, i0Var);
    }

    public final void h(int i7) {
        byte[] bArr;
        int length = this.f4403f.length;
        int i10 = this.f4402e;
        if (length - i10 >= i7) {
            return;
        }
        int i11 = i10 - this.d;
        int max = Math.max(i11 * 2, i7 + i11);
        byte[] bArr2 = this.f4403f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i11);
        this.d = 0;
        this.f4402e = i11;
        this.f4403f = bArr;
    }

    @Override
    public final void d(long j3) {
    }
}
