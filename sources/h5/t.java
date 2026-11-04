package h5;

import b8.ee;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.i9;
public final class t extends c {
    public static final i9 h;
    public static final i9 f14285n;
    public long[] f14286f;

    static {
        we.a aVar = new we.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f14285n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ee.a(g5.b.i(byteBuffer));
        this.f14286f = new long[a10];
        for (int i3 = 0; i3 < a10; i3++) {
            this.f14286f[i3] = g5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f14286f.length);
        for (long j10 : this.f14286f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f14286f.length * 4) + 8;
    }
}
