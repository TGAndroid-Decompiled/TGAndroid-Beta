package f5;

import java.nio.ByteBuffer;
import m.g3;
import w7.s6;
public final class t extends c {
    public static final g3 h;
    public static final g3 f7829n;
    public long[] f7830f;

    static {
        re.a aVar = new re.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f7829n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = s6.a(e5.b.i(byteBuffer));
        this.f7830f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f7830f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f7830f.length);
        for (long j3 : this.f7830f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f7830f.length * 4) + 8;
    }
}
