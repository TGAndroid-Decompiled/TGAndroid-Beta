package f5;

import d5.g0;
import d5.z;
import h3.e;
import h3.i0;
import h3.t0;
import java.nio.ByteBuffer;
import k3.i;

public final class a extends e {

    public final i f5883a;

    public final z f5884b;

    public i0 f5885c;
    public long d;

    public a() {
        super(6);
        this.f5883a = new i(1, 0);
        this.f5884b = new z();
    }

    @Override
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f5885c = (i0) obj;
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
        i0 i0Var = this.f5885c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        this.d = Long.MIN_VALUE;
        i0 i0Var = this.f5885c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void render(long j10, long j11) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.d < 100000 + j10) {
            i iVar = this.f5883a;
            iVar.clear();
            if (readSource(getFormatHolder(), iVar, 0) != -4 || iVar.isEndOfStream()) {
                return;
            }
            this.d = iVar.d;
            if (this.f5885c != null && !iVar.isDecodeOnly()) {
                iVar.d();
                ByteBuffer byteBuffer = iVar.f14429b;
                int i10 = g0.f4795a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    z zVar = this.f5884b;
                    zVar.A(iLimit, bArrArray);
                    zVar.C(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(zVar.g());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f5885c.b();
                }
            }
        }
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        return "application/x-camera-motion".equals(t0Var.B) ? com.google.android.recaptcha.internal.a.b(4, 0, 0) : com.google.android.recaptcha.internal.a.b(0, 0, 0);
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
    }
}
