package a4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import f5.d0;
import java.nio.ByteBuffer;
public final class c0 implements n {
    public final MediaCodec f61a;
    public ByteBuffer[] f62b;
    public ByteBuffer[] f63c;

    public c0(MediaCodec mediaCodec) {
        this.f61a = mediaCodec;
        if (d0.f6579a < 21) {
            this.f62b = mediaCodec.getInputBuffers();
            this.f63c = mediaCodec.getOutputBuffers();
        }
    }

    @Override
    public final void a(g5.i iVar, Handler handler) {
        this.f61a.setOnFrameRenderedListener(new a(this, iVar, 1), handler);
    }

    @Override
    public final void b(int i10, m3.d dVar, long j10) {
        this.f61a.queueSecureInputBuffer(i10, 0, dVar.f16815i, j10, 0);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12) {
        this.f61a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public final void d(int i10, long j10) {
        this.f61a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int e() {
        return this.f61a.dequeueInputBuffer(0L);
    }

    @Override
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f61a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && d0.f6579a < 21) {
                this.f63c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public final void flush() {
        this.f61a.flush();
    }

    @Override
    public final void g(int i10) {
        this.f61a.setVideoScalingMode(i10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        if (d0.f6579a >= 21) {
            return this.f61a.getInputBuffer(i10);
        }
        return this.f62b[i10];
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        if (d0.f6579a >= 21) {
            return this.f61a.getOutputBuffer(i10);
        }
        return this.f63c[i10];
    }

    @Override
    public final MediaFormat getOutputFormat() {
        return this.f61a.getOutputFormat();
    }

    @Override
    public final void h(Surface surface) {
        this.f61a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        this.f62b = null;
        this.f63c = null;
        this.f61a.release();
    }

    @Override
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.f61a.releaseOutputBuffer(i10, z10);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f61a.setParameters(bundle);
    }
}
