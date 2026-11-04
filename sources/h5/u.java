package h5;

import b8.ee;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.i9;
public final class u extends com.googlecode.mp4parser.c {
    public static final i9 f14287f;
    public static final i9 h;
    public long[] f14288e;

    static {
        we.a aVar = new we.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f14287f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ee.a(g5.b.i(byteBuffer));
        this.f14288e = new long[a10];
        for (int i3 = 0; i3 < a10; i3++) {
            this.f14288e[i3] = g5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f14288e.length);
        for (long j10 : this.f14288e) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f14288e.length * 4) + 8;
    }

    public final String toString() {
        ui.f b10 = we.a.b(f14287f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return a1.g.o(this.f14288e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
