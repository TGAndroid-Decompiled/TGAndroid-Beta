package b3;

import b2.s;
import e2.v;
import h2.h;
import i2.d0;
import i2.f;
import i2.g;
import java.nio.ByteBuffer;
import n4.y;
public final class a extends f {
    public final h I;
    public final v J;
    public d0 K;
    public long L;

    public a() {
        super(6);
        this.I = new h(1, 0);
        this.J = new v();
    }

    @Override
    public final int A(s sVar) {
        if ("application/x-camera-motion".equals(sVar.f2397r)) {
            return g.b(4, 0, 0, 0);
        }
        return g.b(0, 0, 0, 0);
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
    public final void o() {
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override
    public final void q(long j3, boolean z10) {
        this.L = Long.MIN_VALUE;
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override
    public final void x(long j3, long j10) {
        boolean z10;
        float[] fArr;
        while (!k() && this.L < 100000 + j3) {
            h hVar = this.I;
            hVar.clear();
            y yVar = this.f11522c;
            yVar.A();
            if (w(yVar, hVar, 0) == -4 && !hVar.isEndOfStream()) {
                long j11 = hVar.f10877e;
                this.L = j11;
                if (j11 < this.f11528w) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.K != null && !z10) {
                    hVar.c();
                    ByteBuffer byteBuffer = hVar.f10876c;
                    String str = e2.d0.f8765a;
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
}
