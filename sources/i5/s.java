package i5;

import ab.c0;
import c8.ob;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class s extends com.googlecode.mp4parser.c {
    public static final ze.b f16125f;
    public static final ze.b h;
    public static final ze.b f16126n;
    public List f16127e;

    static {
        ze.a aVar = new ze.a(s.class, "SampleToChunkBox.java");
        f16125f = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        f16126n = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ob.a(h5.b.i(byteBuffer));
        this.f16127e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f16127e.add(new r(h5.b.i(byteBuffer), h5.b.i(byteBuffer), h5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f16127e.size());
        for (r rVar : this.f16127e) {
            byteBuffer.putInt((int) rVar.f16122a);
            byteBuffer.putInt((int) rVar.f16123b);
            byteBuffer.putInt((int) rVar.f16124c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f16127e.size() * 12) + 8;
    }

    public final String toString() {
        c0 b10 = ze.a.b(f16126n, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "SampleToChunkBox[entryCount=" + this.f16127e.size() + "]";
    }
}
