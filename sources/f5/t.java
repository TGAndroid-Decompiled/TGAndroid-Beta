package f5;

import java.nio.ByteBuffer;
import m.y0;
import w7.r6;
public final class t extends c {
    public static final y0 h;
    public static final y0 f9726n;
    public long[] f9727f;

    static {
        se.a aVar = new se.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f9726n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = r6.a(e5.b.i(byteBuffer));
        this.f9727f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9727f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9727f.length);
        for (long j3 : this.f9727f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9727f.length * 4) + 8;
    }
}
