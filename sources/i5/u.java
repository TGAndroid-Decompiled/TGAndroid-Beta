package i5;

import c8.ob;
import java.nio.ByteBuffer;
public final class u extends d {
    public static final ze.b h;
    public static final ze.b f16105n;
    public long[] f16106f;

    static {
        ze.a aVar = new ze.a(u.class, "StaticChunkOffsetBox.java");
        h = aVar.e(aVar.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        f16105n = aVar.e(aVar.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ob.a(h5.b.i(byteBuffer));
        this.f16106f = new long[a10];
        for (int i7 = 0; i7 < a10; i7++) {
            this.f16106f[i7] = h5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f16106f.length);
        for (long j3 : this.f16106f) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f16106f.length * 4) + 8;
    }
}
