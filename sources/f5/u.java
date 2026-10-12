package f5;

import java.nio.ByteBuffer;
import m.y0;
import w7.r6;
public final class u extends com.googlecode.mp4parser.c {
    public static final y0 f9728f;
    public static final y0 h;
    public long[] f9729e;

    static {
        se.a aVar = new se.a(u.class, "SyncSampleBox.java");
        aVar.e(aVar.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f9728f = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = aVar.e(aVar.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = r6.a(e5.b.i(byteBuffer));
        this.f9729e = new long[a2];
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9729e[i10] = e5.b.i(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9729e.length);
        for (long j3 : this.f9729e) {
            byteBuffer.putInt((int) j3);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9729e.length * 4) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = se.a.b(f9728f, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return a1.g.o(this.f9729e.length, "]", new StringBuilder("SyncSampleBox[entryCount="));
    }
}
