package b3;

import b2.s;
import e2.v;
import h2.g;
import i2.d0;
import i2.f;
import java.nio.ByteBuffer;
import n4.y;
public final class a extends f {
    public final g I;
    public final v J;
    public d0 K;
    public long L;

    public a() {
        super(6);
        this.I = new g(1, 0);
        this.J = new v();
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
            d0Var.b();
        }
    }

    @Override
    public final void p(long j3, boolean z10) {
        this.L = Long.MIN_VALUE;
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override
    public final void w(long j3, long j10) {
        boolean z10;
        float[] fArr;
        while (!k() && this.L < 100000 + j3) {
            g gVar = this.I;
            gVar.i();
            y yVar = this.f11496c;
            yVar.A();
            if (v(yVar, gVar, 0) == -4 && !gVar.c(4)) {
                long j11 = gVar.h;
                this.L = j11;
                if (j11 < this.f11502w) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.K != null && !z10) {
                    gVar.m();
                    ByteBuffer byteBuffer = gVar.f10847e;
                    String str = e2.d0.f8737a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        v vVar = this.J;
                        vVar.H(limit, array);
                        vVar.J(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i10 = 0; i10 < 3; i10++) {
                            fArr2[i10] = Float.intBitsToFloat(vVar.l());
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

    @Override
    public final int z(s sVar) {
        if ("application/x-camera-motion".equals(sVar.f2370r)) {
            return i2.g.b(4, 0, 0, 0);
        }
        return i2.g.b(0, 0, 0, 0);
    }
}
