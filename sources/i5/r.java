package i5;

import c8.jb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import y7.i6;
public final class r extends com.googlecode.mp4parser.c {
    public static final i6 f15324f;
    public static final i6 h;
    public static final i6 f15325n;
    public List f15326e;

    static {
        ze.a aVar = new ze.a(r.class, "SampleToChunkBox.java");
        f15324f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f15325n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = jb.a(h5.b.i(byteBuffer));
        this.f15326e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15326e.add(new q(h5.b.i(byteBuffer), h5.b.i(byteBuffer), h5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15326e.size());
        for (q qVar : this.f15326e) {
            byteBuffer.putInt((int) qVar.f15321a);
            byteBuffer.putInt((int) qVar.f15322b);
            byteBuffer.putInt((int) qVar.f15323c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15326e.size() * 12) + 8;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(f15325n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f15326e.size() + "]";
    }
}
