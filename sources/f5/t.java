package f5;

import java.nio.ByteBuffer;
import w7.t6;
public final class t extends c {
    public static final o0.b h;
    public static final o0.b f8946n;
    public long[] f8947f;

    static {
        re.a aVar = new re.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f8946n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = t6.a(e5.b.i(byteBuffer));
        this.f8947f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f8947f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f8947f.length);
        for (long j3 : this.f8947f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f8947f.length * 4) + 8;
    }
}
