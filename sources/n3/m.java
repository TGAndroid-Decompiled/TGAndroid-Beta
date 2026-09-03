package n3;

import java.nio.ByteBuffer;
public final class m extends j {
    public final com.google.android.exoplayer2.ext.ffmpeg.a f15237e;
    public ByteBuffer f15238f;

    public m(com.google.android.exoplayer2.ext.ffmpeg.a aVar) {
        this.f15237e = aVar;
    }

    @Override
    public final void b() {
        this.f15195b = 0;
        ByteBuffer byteBuffer = this.f15238f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override
    public final void i() {
        this.f15237e.f2554a.j(this);
    }
}
