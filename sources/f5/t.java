package f5;

import java.nio.ByteBuffer;
import w7.b7;
public final class t extends c {
    public static final te.b h;
    public static final te.b f10461n;
    public long[] f10462f;

    static {
        te.a aVar = new te.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f10461n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = b7.a(e5.b.i(byteBuffer));
        this.f10462f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f10462f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f10462f.length);
        for (long j10 : this.f10462f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f10462f.length * 4) + 8;
    }
}
