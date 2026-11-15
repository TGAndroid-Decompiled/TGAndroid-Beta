package i5;

import a8.p0;
import ab.c0;
import c8.lb;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ff;
public final class v extends com.googlecode.mp4parser.c {
    public static final ff f15792f;
    public static final ff h;
    public long[] f15793e;

    static {
        ze.a aVar = new ze.a(v.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f15792f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = lb.a(h5.b.i(byteBuffer));
        this.f15793e = new long[a10];
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15793e[i7] = h5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15793e.length);
        for (long j3 : this.f15793e) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15793e.length * 4) + 8;
    }

    public final String toString() {
        c0 b10 = ze.a.b(f15792f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return p0.n(this.f15793e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
