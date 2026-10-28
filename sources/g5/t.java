package g5;

import java.nio.ByteBuffer;
import li.e3;
public final class t extends c {
    public static final e3 h;
    public static final e3 f12335n;
    public long[] f12336f;

    static {
        ue.a aVar = new ue.a(t.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f12335n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = f6.e.a(f5.b.i(byteBuffer));
        this.f12336f = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f12336f[i10] = f5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f12336f.length);
        for (long j10 : this.f12336f) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f12336f.length * 4) + 8;
    }
}
