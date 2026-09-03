package d4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import h5.d0;
import java.nio.ByteBuffer;
public final class z implements k {
    public final MediaCodec f4282a;
    public ByteBuffer[] f4283b;
    public ByteBuffer[] f4284c;

    public z(MediaCodec mediaCodec) {
        this.f4282a = mediaCodec;
        if (d0.f7237a < 21) {
            this.f4283b = mediaCodec.getInputBuffers();
            this.f4284c = mediaCodec.getOutputBuffers();
        }
    }

    @Override
    public final void a(long j10, int i10, int i11, int i12) {
        this.f4282a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void b(int i10, long j10) {
        this.f4282a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final void c(int i10, n3.d dVar, long j10) {
        this.f4282a.queueSecureInputBuffer(i10, 0, dVar.f15204i, j10, 0);
    }

    @Override
    public final int d() {
        return this.f4282a.dequeueInputBuffer(0L);
    }

    @Override
    public final void e(i5.i iVar, Handler handler) {
        this.f4282a.setOnFrameRenderedListener(new a(this, iVar, 1), handler);
    }

    @Override
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f4282a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && d0.f7237a < 21) {
                this.f4284c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void flush() {
        this.f4282a.flush();
    }

    @Override
    public final void g(int i10) {
        this.f4282a.setVideoScalingMode(i10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        if (d0.f7237a >= 21) {
            return this.f4282a.getInputBuffer(i10);
        }
        return this.f4283b[i10];
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        if (d0.f7237a >= 21) {
            return this.f4282a.getOutputBuffer(i10);
        }
        return this.f4284c[i10];
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f4282a.getOutputFormat();
    }

    @Override
    public final void h(Surface surface) {
        this.f4282a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        this.f4283b = null;
        this.f4284c = null;
        this.f4282a.release();
    }

    @Override
    public final void releaseOutputBuffer(int i10, boolean z4) {
        this.f4282a.releaseOutputBuffer(i10, z4);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f4282a.setParameters(bundle);
    }
}
