package defpackage;

import java.nio.ByteBuffer;
public final class n0b extends th2 {
    public static final xh4 h;
    public static final xh4 n;
    public long[] f;

    static {
        u84 u84Var = new u84(n0b.class, "StaticChunkOffsetBox.java");
        h = u84Var.e(u84Var.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        n = u84Var.e(u84Var.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = cvd.a(zpe.g(byteBuffer));
        this.f = new long[a];
        for (int i = 0; i < a; i++) {
            this.f[i] = zpe.g(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f.length);
        for (long j : this.f) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f.length << 2) + 8;
    }
}
