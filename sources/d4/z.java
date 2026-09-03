package d4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import h5.d0;
import java.nio.ByteBuffer;
public final class z implements k {
    public final MediaCodec f4191a;
    public ByteBuffer[] f4192b;
    public ByteBuffer[] f4193c;

    public z(MediaCodec mediaCodec) {
        this.f4191a = mediaCodec;
        if (d0.f6924a < 21) {
            this.f4192b = mediaCodec.getInputBuffers();
            this.f4193c = mediaCodec.getOutputBuffers();
        }
    }

    @Override
    public final void a(long j10, int i10, int i11, int i12) {
        this.f4191a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void b(int i10, long j10) {
        this.f4191a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final void c(int i10, n3.d dVar, long j10) {
        this.f4191a.queueSecureInputBuffer(i10, 0, dVar.f14215i, j10, 0);
    }

    @Override
    public final int d() {
        return this.f4191a.dequeueInputBuffer(0L);
    }

    @Override
    public final void e(i5.i iVar, Handler handler) {
        this.f4191a.setOnFrameRenderedListener(new a(this, iVar, 1), handler);
    }

    @Override
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f4191a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && d0.f6924a < 21) {
                this.f4193c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void flush() {
        this.f4191a.flush();
    }

    @Override
    public final void g(int i10) {
        this.f4191a.setVideoScalingMode(i10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        if (d0.f6924a >= 21) {
            return this.f4191a.getInputBuffer(i10);
        }
        return this.f4192b[i10];
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        if (d0.f6924a >= 21) {
            return this.f4191a.getOutputBuffer(i10);
        }
        return this.f4193c[i10];
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f4191a.getOutputFormat();
    }

    @Override
    public final void h(Surface surface) {
        this.f4191a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        this.f4192b = null;
        this.f4193c = null;
        this.f4191a.release();
    }

    @Override
    public final void releaseOutputBuffer(int i10, boolean z4) {
        this.f4191a.releaseOutputBuffer(i10, z4);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f4191a.setParameters(bundle);
    }
}
