package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class afb implements hm6 {
    public final MediaCodec a;
    public final bi6 b;

    public afb(MediaCodec mediaCodec, bi6 bi6Var) {
        this.a = mediaCodec;
        this.b = bi6Var;
        if (Build.VERSION.SDK_INT >= 35 && bi6Var != null) {
            bi6Var.a(mediaCodec);
        }
    }

    @Override
    public final void a(int i, z43 z43Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, z43Var.i, j, i2);
    }

    @Override
    public final void b(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override
    public final void c(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override
    public final void d() {
        this.a.detachOutputSurface();
    }

    @Override
    public final void e(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override
    public final int f() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override
    public final void flush() {
        this.a.flush();
    }

    @Override
    public final boolean g(fk3 fk3Var) {
        return false;
    }

    @Override
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void i(kpb kpbVar) {
        kpbVar.run();
    }

    @Override
    public final void j(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override
    public final void l(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void m(xm6 xm6Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new py(this, xm6Var, (byte) 1), handler);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        bi6 bi6Var = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && bi6Var != null) {
                bi6Var.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && bi6Var != null) {
                bi6Var.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
