package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k2.b0;
import w7.s6;
public final class r extends com.googlecode.mp4parser.c {
    public static final b0 f8927f;
    public static final b0 h;
    public static final b0 f8928n;
    public List e;

    static {
        re.a aVar = new re.a(r.class, "SampleToChunkBox.java");
        f8927f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f8928n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = s6.a(e5.b.i(byteBuffer));
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
            byteBuffer.putInt((int) qVar.f8924a);
            byteBuffer.putInt((int) qVar.f8925b);
            byteBuffer.putInt((int) qVar.f8926c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 12) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = re.a.b(f8928n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.e.size() + "]";
    }
}
