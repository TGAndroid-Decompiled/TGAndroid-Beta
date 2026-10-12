package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m.y0;
import w7.r6;
public final class e extends com.googlecode.mp4parser.c {
    public static final y0 f9681f;
    public List f9682e;

    static {
        se.a aVar = new se.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f9681f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = r6.a(e5.b.i(byteBuffer));
        this.f9682e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9682e.add(new d(r6.a(e5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9682e.size());
        for (d dVar : this.f9682e) {
            byteBuffer.putInt(dVar.f9679a);
            byteBuffer.putInt(dVar.f9680b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9682e.size() * 8) + 8;
    }
}
