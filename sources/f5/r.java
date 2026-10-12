package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m.y0;
import w7.r6;
public final class r extends com.googlecode.mp4parser.c {
    public static final y0 f9721f;
    public static final y0 h;
    public static final y0 f9722n;
    public List f9723e;

    static {
        se.a aVar = new se.a(r.class, "SampleToChunkBox.java");
        f9721f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f9722n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = r6.a(e5.b.i(byteBuffer));
        this.f9723e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9723e.add(new q(e5.b.i(byteBuffer), e5.b.i(byteBuffer), e5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9723e.size());
        for (q qVar : this.f9723e) {
            byteBuffer.putInt((int) qVar.f9718a);
            byteBuffer.putInt((int) qVar.f9719b);
            byteBuffer.putInt((int) qVar.f9720c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9723e.size() * 12) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = se.a.b(f9722n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f9723e.size() + "]";
    }
}
