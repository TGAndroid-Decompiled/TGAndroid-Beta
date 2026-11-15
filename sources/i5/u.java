package i5;

import c8.lb;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ff;
public final class u extends d {
    public static final ff h;
    public static final ff f15790n;
    public long[] f15791f;

    static {
        ze.a aVar = new ze.a(u.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f15790n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = lb.a(h5.b.i(byteBuffer));
        this.f15791f = new long[a10];
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15791f[i7] = h5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15791f.length);
        for (long j3 : this.f15791f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15791f.length * 4) + 8;
    }
}
