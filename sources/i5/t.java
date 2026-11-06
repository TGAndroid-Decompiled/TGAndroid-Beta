package i5;

import c8.ib;
import java.nio.ByteBuffer;
import y7.i6;
public final class t extends c {
    public static final i6 h;
    public static final i6 f15329n;
    public long[] f15330f;

    static {
        ze.a aVar = new ze.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f15329n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ib.a(h5.b.i(byteBuffer));
        this.f15330f = new long[a10];
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15330f[i7] = h5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15330f.length);
        for (long j3 : this.f15330f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15330f.length * 4) + 8;
    }
}
