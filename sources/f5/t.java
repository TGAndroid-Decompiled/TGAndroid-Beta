package f5;

import java.nio.ByteBuffer;
import ji.w4;
import w7.f7;
public final class t extends c {
    public static final w4 h;
    public static final w4 f9004n;
    public long[] f9005f;

    static {
        te.a aVar = new te.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f9004n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = f7.a(e5.b.i(byteBuffer));
        this.f9005f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9005f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9005f.length);
        for (long j10 : this.f9005f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9005f.length * 4) + 8;
    }
}
