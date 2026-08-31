package n3;

import java.nio.ByteBuffer;
public final class m extends j {
    public final com.google.android.exoplayer2.ext.ffmpeg.a f15235e;
    public ByteBuffer f15236f;

    public m(com.google.android.exoplayer2.ext.ffmpeg.a aVar) {
        this.f15235e = aVar;
    }

    @Override
    public final void b() {
        this.f15193b = 0;
        ByteBuffer byteBuffer = this.f15236f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override
    public final void i() {
        this.f15235e.f2554a.j(this);
    }
}
