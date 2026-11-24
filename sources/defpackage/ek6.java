package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public interface ek6 {
    void a(int i, o33 o33Var, long j, int i2);

    void b(int i, int i2, int i3, long j);

    void c(int i);

    boolean d(s34 s34Var);

    void e();

    void f(int i, long j);

    void flush();

    int g();

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    int h(MediaCodec.BufferInfo bufferInfo);

    void i(jnb jnbVar);

    void j(int i);

    void k(Surface surface);

    void l(ArrayList arrayList);

    void m(uk6 uk6Var, Handler handler);

    void n(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
