package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import w7.s6;
public final class e extends com.googlecode.mp4parser.c {
    public static final m2.t f9683f;
    public List f9684e;

    static {
        se.a aVar = new se.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f9683f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = s6.a(e5.b.i(byteBuffer));
        this.f9684e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9684e.add(new d(s6.a(e5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9684e.size());
        for (d dVar : this.f9684e) {
            byteBuffer.putInt(dVar.f9681a);
            byteBuffer.putInt(dVar.f9682b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9684e.size() * 8) + 8;
    }
}
