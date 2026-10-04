package f5;

import ii.n4;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import w7.u6;
public final class e extends com.googlecode.mp4parser.c {
    public static final n4 f9673f;
    public List f9674e;

    static {
        re.a aVar = new re.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f9673f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u6.a(e5.b.i(byteBuffer));
        this.f9674e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9674e.add(new d(u6.a(e5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9674e.size());
        for (d dVar : this.f9674e) {
            byteBuffer.putInt(dVar.f9671a);
            byteBuffer.putInt(dVar.f9672b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9674e.size() * 8) + 8;
    }
}
