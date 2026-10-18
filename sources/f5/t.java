package f5;

import java.nio.ByteBuffer;
import w7.g7;
public final class t extends c {
    public static final le.b h;
    public static final le.b f10447n;
    public long[] f10448f;

    static {
        te.a aVar = new te.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f10447n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = g7.a(e5.b.i(byteBuffer));
        this.f10448f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f10448f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f10448f.length);
        for (long j10 : this.f10448f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f10448f.length * 4) + 8;
    }
}
