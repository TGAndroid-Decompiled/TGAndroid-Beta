package h5;

import f5.d0;
import f5.w;
import j3.e;
import j3.i0;
import j3.t0;
import java.nio.ByteBuffer;
import m3.i;
public final class a extends e {
    public final i f7537a;
    public final w f7538b;
    public i0 f7539c;
    public long d;

    public a() {
        super(6);
        this.f7537a = new i(1, 0);
        this.f7538b = new w();
    }

    @Override
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f7539c = (i0) obj;
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
        i0 i0Var = this.f7539c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        this.d = Long.MIN_VALUE;
        i0 i0Var = this.f7539c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void render(long j10, long j11) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.d < 100000 + j10) {
            i iVar = this.f7537a;
            iVar.clear();
            if (readSource(getFormatHolder(), iVar, 0) == -4 && !iVar.isEndOfStream()) {
                this.d = iVar.d;
                if (this.f7539c != null && !iVar.isDecodeOnly()) {
                    iVar.c();
                    ByteBuffer byteBuffer = iVar.f16828b;
                    int i10 = d0.f6579a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        w wVar = this.f7538b;
                        wVar.A(limit, array);
                        wVar.C(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i11 = 0; i11 < 3; i11++) {
                            fArr2[i11] = Float.intBitsToFloat(wVar.g());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f7539c.b();
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
            return com.google.android.recaptcha.internal.a.b(4, 0, 0);
        }
        return com.google.android.recaptcha.internal.a.b(0, 0, 0);
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
    }
}
