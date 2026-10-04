package f5;

import ii.n4;
import java.nio.ByteBuffer;
import w7.u6;
public final class t extends c {
    public static final n4 h;
    public static final n4 f9717n;
    public long[] f9718f;

    static {
        re.a aVar = new re.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f9717n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u6.a(e5.b.i(byteBuffer));
        this.f9718f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9718f[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9718f.length);
        for (long j3 : this.f9718f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9718f.length * 4) + 8;
    }
}
