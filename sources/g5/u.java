package g5;

import java.nio.ByteBuffer;
import li.e3;
public final class u extends com.googlecode.mp4parser.c {
    public static final e3 f12338f;
    public static final e3 h;
    public long[] e;

    static {
        ue.a aVar = new ue.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f12338f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = f6.e.a(f5.b.i(byteBuffer));
        this.e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.e[i10] = f5.b.i(byteBuffer);
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
        ti.e b10 = ue.a.b(f12338f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return a1.g.n(this.e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
