package f5;

import ii.n4;
import java.nio.ByteBuffer;
import w7.u6;
public final class u extends com.googlecode.mp4parser.c {
    public static final n4 f9720f;
    public static final n4 h;
    public long[] f9721e;

    static {
        re.a aVar = new re.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f9720f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u6.a(e5.b.i(byteBuffer));
        this.f9721e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9721e[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9721e.length);
        for (long j3 : this.f9721e) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9721e.length * 4) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(f9720f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return a4.a.o(this.f9721e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
