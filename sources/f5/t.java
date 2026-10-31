package f5;

import java.nio.ByteBuffer;
import v7.q8;
public final class t extends c {
    public static final za.c h;
    public static final za.c f6896n;
    public long[] f6897f;

    static {
        le.a aVar = new le.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f6896n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = q8.a(e5.b.i(byteBuffer));
        this.f6897f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f6897f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f6897f.length);
        for (long j10 : this.f6897f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f6897f.length * 4) + 8;
    }
}
