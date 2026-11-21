package i5;

import a8.p0;
import ab.c0;
import c8.ob;
import java.nio.ByteBuffer;
public final class v extends com.googlecode.mp4parser.c {
    public static final ze.b f16132f;
    public static final ze.b h;
    public long[] f16133e;

    static {
        ze.a aVar = new ze.a(v.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f16132f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ob.a(h5.b.i(byteBuffer));
        this.f16133e = new long[a10];
        for (int i7 = 0; i7 < a10; i7++) {
            this.f16133e[i7] = h5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f16133e.length);
        for (long j3 : this.f16133e) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f16133e.length * 4) + 8;
    }

    public final String toString() {
        c0 b10 = ze.a.b(f16132f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return p0.n(this.f16133e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
