package i5;

import ab.c0;
import c8.lb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ff;
public final class s extends com.googlecode.mp4parser.c {
    public static final ff f15785f;
    public static final ff h;
    public static final ff f15786n;
    public List f15787e;

    static {
        ze.a aVar = new ze.a(s.class, "SampleToChunkBox.java");
        f15785f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f15786n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = lb.a(h5.b.i(byteBuffer));
        this.f15787e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15787e.add(new r(h5.b.i(byteBuffer), h5.b.i(byteBuffer), h5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15787e.size());
        for (r rVar : this.f15787e) {
            byteBuffer.putInt((int) rVar.f15782a);
            byteBuffer.putInt((int) rVar.f15783b);
            byteBuffer.putInt((int) rVar.f15784c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15787e.size() * 12) + 8;
    }

    public final String toString() {
        c0 b10 = ze.a.b(f15786n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f15787e.size() + "]";
    }
}
