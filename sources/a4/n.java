package a4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
public interface n {
    void a(g5.i iVar, Handler handler);

    void b(int i10, m3.d dVar, long j10);

    void c(long j10, int i10, int i11, int i12);

    void d(int i10, long j10);

    int e();

    int f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void g(int i10);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void h(Surface surface);

    void release();

    void releaseOutputBuffer(int i10, boolean z10);

    void setParameters(Bundle bundle);
}
