package n3;

import java.nio.ByteBuffer;
public final class m extends j {
    public final com.google.android.exoplayer2.ext.ffmpeg.a e;
    public ByteBuffer f14259f;

    public m(com.google.android.exoplayer2.ext.ffmpeg.a aVar) {
        this.e = aVar;
    }

    @Override
    public final void c() {
        this.f14222b = 0;
        ByteBuffer byteBuffer = this.f14259f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override
    public final void j() {
        this.e.f2635a.j(this);
    }
}
