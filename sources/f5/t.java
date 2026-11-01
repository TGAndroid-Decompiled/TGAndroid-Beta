package f5;

import java.nio.ByteBuffer;
import v7.q8;
public final class t extends c {
    public static final za.c h;
    public static final za.c f6897n;
    public long[] f6898f;

    static {
        le.a aVar = new le.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f6897n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = q8.a(e5.b.i(byteBuffer));
        this.f6898f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f6898f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f6898f.length);
        for (long j10 : this.f6898f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f6898f.length * 4) + 8;
    }
}
