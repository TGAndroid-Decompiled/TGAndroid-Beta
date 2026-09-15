package f5;

import java.nio.ByteBuffer;
import k2.c0;
import w7.s6;
public final class t extends c {
    public static final c0 h;
    public static final c0 f8942n;
    public long[] f8943f;

    static {
        re.a aVar = new re.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f8942n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = s6.a(e5.b.i(byteBuffer));
        this.f8943f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f8943f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f8943f.length);
        for (long j3 : this.f8943f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f8943f.length * 4) + 8;
    }
}
