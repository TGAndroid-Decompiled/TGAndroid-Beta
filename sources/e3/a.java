package e3;

import e2.u;
import h2.m0;
import h2.x;
import java.nio.ByteBuffer;
import jg.g;
import k2.h;
import l2.b;
import l2.d0;
public final class a extends b {
    public final h I;
    public final x J;
    public d0 K;
    public long L;

    public a() {
        super(6);
        this.I = new h(1, 0);
        this.J = new x();
    }

    @Override
    public final int C(u uVar) {
        if ("application/x-camera-motion".equals(uVar.f10620s)) {
            return g.b(4, 0, 0, 0);
        }
        return g.b(0, 0, 0, 0);
    }

    @Override
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.K = (d0) obj;
        }
    }

    @Override
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override
    public final boolean l() {
        return k();
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void n() {
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    @Override
    public final void p(long j3, boolean z9, boolean z10) {
        this.L = Long.MIN_VALUE;
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z9;
        float[] fArr;
        while (!k() && this.L < 100000 + j3) {
            h hVar = this.I;
            hVar.clear();
            wf.b bVar = this.f17762c;
            bVar.A();
            if (w(bVar, hVar, 0) == -4 && !hVar.isEndOfStream()) {
                long j11 = hVar.f17176e;
                this.L = j11;
                if (j11 < this.f17769x) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.K != null && !z9) {
                    hVar.c();
                    ByteBuffer byteBuffer = hVar.f17175c;
                    String str = m0.f14114a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        x xVar = this.J;
                        xVar.L(limit, array);
                        xVar.N(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i7 = 0; i7 < 3; i7++) {
                            fArr2[i7] = Float.intBitsToFloat(xVar.o());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.K.a();
                    }
                }
            } else {
                return;
            }
        }
    }
}
