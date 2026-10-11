package f5;

import java.nio.ByteBuffer;
import w7.s6;
public final class t extends c {
    public static final m2.t h;
    public static final m2.t f9728n;
    public long[] f9729f;

    static {
        se.a aVar = new se.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f9728n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = s6.a(e5.b.i(byteBuffer));
        this.f9729f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9729f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9729f.length);
        for (long j3 : this.f9729f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9729f.length * 4) + 8;
    }
}
