package b3;

import e2.l0;
import e2.x;
import h2.h;
import i2.b;
import i2.d0;
import java.nio.ByteBuffer;
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
    public final int C(b2.x xVar) {
        if ("application/x-camera-motion".equals(xVar.f2423s)) {
            return i0.a.a(4, 0, 0, 0);
        }
        return i0.a.a(0, 0, 0, 0);
    }

    @Override
    public final void d(int i10, Object obj) {
        if (i10 == 8) {
            this.K = (d0) obj;
        }
    }

    @Override
    public final String j() {
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
            d0Var.c();
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        this.L = Long.MIN_VALUE;
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override
    public final void x(long j10, long j11) {
        boolean z10;
        float[] fArr;
        while (!k() && this.L < 100000 + j10) {
            h hVar = this.I;
            hVar.clear();
            hf.b bVar = this.f7810c;
            bVar.L();
            if (w(bVar, hVar, 0) == -4 && !hVar.isEndOfStream()) {
                long j12 = hVar.e;
                this.L = j12;
                if (j12 < this.f7816x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.K != null && !z10) {
                    hVar.d();
                    ByteBuffer byteBuffer = hVar.f7587c;
                    String str = l0.f6165a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        x xVar = this.J;
                        xVar.L(limit, array);
                        xVar.N(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i10 = 0; i10 < 3; i10++) {
                            fArr2[i10] = Float.intBitsToFloat(xVar.o());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.K.b();
                    }
                }
            } else {
                return;
            }
        }
    }
}
