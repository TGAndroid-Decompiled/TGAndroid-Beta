package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import w7.p6;
public final class r extends com.googlecode.mp4parser.c {
    public static final mg.n f9364f;
    public static final mg.n h;
    public static final mg.n f9365n;
    public List f9366e;

    static {
        re.a aVar = new re.a(r.class, "SampleToChunkBox.java");
        f9364f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f9365n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = p6.a(e5.b.i(byteBuffer));
        this.f9366e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9366e.add(new q(e5.b.i(byteBuffer), e5.b.i(byteBuffer), e5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9366e.size());
        for (q qVar : this.f9366e) {
            byteBuffer.putInt((int) qVar.f9361a);
            byteBuffer.putInt((int) qVar.f9362b);
            byteBuffer.putInt((int) qVar.f9363c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9366e.size() * 12) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(f9365n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f9366e.size() + "]";
    }
}
