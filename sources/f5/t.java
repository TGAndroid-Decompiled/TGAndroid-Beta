package f5;

import java.nio.ByteBuffer;
import w7.p6;
public final class t extends c {
    public static final mg.n h;
    public static final mg.n f9341n;
    public long[] f9342f;

    static {
        re.a aVar = new re.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f9341n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = p6.a(e5.b.i(byteBuffer));
        this.f9342f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9342f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9342f.length);
        for (long j3 : this.f9342f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9342f.length * 4) + 8;
    }
}
