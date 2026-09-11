package f5;

import java.nio.ByteBuffer;
import w7.p6;
public final class u extends com.googlecode.mp4parser.c {
    public static final mg.n f9343f;
    public static final mg.n h;
    public long[] f9344e;

    static {
        re.a aVar = new re.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f9343f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = p6.a(e5.b.i(byteBuffer));
        this.f9344e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9344e[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9344e.length);
        for (long j3 : this.f9344e) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9344e.length * 4) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(f9343f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return a4.a.n(this.f9344e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
