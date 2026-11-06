package i5;

import a8.p0;
import c8.ib;
import java.nio.ByteBuffer;
import y7.i6;
public final class u extends com.googlecode.mp4parser.c {
    public static final i6 f15331f;
    public static final i6 h;
    public long[] f15332e;

    static {
        ze.a aVar = new ze.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f15331f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ib.a(h5.b.i(byteBuffer));
        this.f15332e = new long[a10];
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15332e[i7] = h5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15332e.length);
        for (long j3 : this.f15332e) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15332e.length * 4) + 8;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(f15331f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return p0.n(this.f15332e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
