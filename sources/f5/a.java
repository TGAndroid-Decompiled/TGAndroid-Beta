package f5;

import d5.f0;
import d5.y;
import e2.c;
import h3.e;
import h3.i0;
import h3.t0;
import java.nio.ByteBuffer;
import k3.i;
public final class a extends e {
    public final i f5587a;
    public final y f5588b;
    public i0 f5589c;
    public long d;

    public a() {
        super(6);
        this.f5587a = new i(1, 0);
        this.f5588b = new y();
    }

    @Override
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override
    public final void handleMessage(int i9, Object obj) {
        if (i9 == 8) {
            this.f5589c = (i0) obj;
        }
    }

    @Override
    public final boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override
    public final boolean isReady() {
        return true;
    }

    @Override
    public final void onDisabled() {
        i0 i0Var = this.f5589c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        this.d = Long.MIN_VALUE;
        i0 i0Var = this.f5589c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void render(long j10, long j11) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.d < 100000 + j10) {
            i iVar = this.f5587a;
            iVar.clear();
            if (readSource(getFormatHolder(), iVar, 0) == -4 && !iVar.isEndOfStream()) {
                this.d = iVar.d;
                if (this.f5589c != null && !iVar.isDecodeOnly()) {
                    iVar.d();
                    ByteBuffer byteBuffer = iVar.f14608b;
                    int i9 = f0.f4349a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        y yVar = this.f5588b;
                        yVar.A(limit, array);
                        yVar.C(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i10 = 0; i10 < 3; i10++) {
                            fArr2[i10] = Float.intBitsToFloat(yVar.g());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f5589c.b();
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        if ("application/x-camera-motion".equals(t0Var.B)) {
            return c.b(4, 0, 0);
        }
        return c.b(0, 0, 0);
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
    }
}
