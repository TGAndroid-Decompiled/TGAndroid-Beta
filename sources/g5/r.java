package g5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import li.e3;
public final class r extends com.googlecode.mp4parser.c {
    public static final e3 f12332f;
    public static final e3 h;
    public static final e3 f12333n;
    public List e;

    static {
        ue.a aVar = new ue.a(r.class, "SampleToChunkBox.java");
        f12332f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f12333n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = f6.e.a(f5.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new q(f5.b.i(byteBuffer), f5.b.i(byteBuffer), f5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (q qVar : this.e) {
            byteBuffer.putInt((int) qVar.f12329a);
            byteBuffer.putInt((int) qVar.f12330b);
            byteBuffer.putInt((int) qVar.f12331c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 12) + 8;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(f12333n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.e.size() + "]";
    }
}
