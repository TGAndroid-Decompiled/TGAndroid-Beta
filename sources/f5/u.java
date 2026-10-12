package f5;

import java.nio.ByteBuffer;
import ji.w4;
import w7.g7;
public final class u extends com.googlecode.mp4parser.c {
    public static final w4 f9003f;
    public static final w4 h;
    public long[] e;

    static {
        te.a aVar = new te.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f9003f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = g7.a(e5.b.i(byteBuffer));
        this.e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.e[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.length);
        for (long j10 : this.e) {
            byteBuffer.putInt((int) j10);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.length * 4) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = te.a.b(f9003f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return a1.g.n(this.e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
