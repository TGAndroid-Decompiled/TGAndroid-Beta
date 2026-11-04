package h5;

import b8.ee;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.i9;
public final class r extends com.googlecode.mp4parser.c {
    public static final i9 f14280f;
    public static final i9 h;
    public static final i9 f14281n;
    public List f14282e;

    static {
        we.a aVar = new we.a(r.class, "SampleToChunkBox.java");
        f14280f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f14281n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ee.a(g5.b.i(byteBuffer));
        this.f14282e = new ArrayList(a10);
        for (int i3 = 0; i3 < a10; i3++) {
            this.f14282e.add(new q(g5.b.i(byteBuffer), g5.b.i(byteBuffer), g5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f14282e.size());
        for (q qVar : this.f14282e) {
            byteBuffer.putInt((int) qVar.f14277a);
            byteBuffer.putInt((int) qVar.f14278b);
            byteBuffer.putInt((int) qVar.f14279c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f14282e.size() * 12) + 8;
    }

    public final String toString() {
        ui.f b10 = we.a.b(f14281n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f14282e.size() + "]";
    }
}
