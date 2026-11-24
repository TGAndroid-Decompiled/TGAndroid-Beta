package defpackage;

import java.nio.ByteBuffer;
public final class kwa extends bh2 {
    public static final z24 h;
    public static final z24 n;
    public long[] f;

    static {
        z74 z74Var = new z74(kwa.class, "StaticChunkOffsetBox.java");
        h = z74Var.e(z74Var.d("getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "[J"));
        n = z74Var.e(z74Var.d("setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = mqd.a(hle.g(byteBuffer));
        this.f = new long[a];
        for (int i = 0; i < a; i++) {
            this.f[i] = hle.g(byteBuffer);
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
