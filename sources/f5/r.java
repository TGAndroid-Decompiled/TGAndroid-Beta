package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import ji.w4;
import w7.f7;
public final class r extends com.googlecode.mp4parser.c {
    public static final w4 f9001f;
    public static final w4 h;
    public static final w4 f9002n;
    public List e;

    static {
        te.a aVar = new te.a(r.class, "SampleToChunkBox.java");
        f9001f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f9002n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = f7.a(e5.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new q(e5.b.i(byteBuffer), e5.b.i(byteBuffer), e5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (q qVar : this.e) {
            byteBuffer.putInt((int) qVar.f8998a);
            byteBuffer.putInt((int) qVar.f8999b);
            byteBuffer.putInt((int) qVar.f9000c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 12) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = te.a.b(f9002n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.e.size() + "]";
    }
}
