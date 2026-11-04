package h5;

import b8.ee;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.i9;
public final class e extends com.googlecode.mp4parser.c {
    public static final i9 f14239f;
    public List f14240e;

    static {
        we.a aVar = new we.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f14239f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ee.a(g5.b.i(byteBuffer));
        this.f14240e = new ArrayList(a10);
        for (int i3 = 0; i3 < a10; i3++) {
            this.f14240e.add(new d(ee.a(g5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f14240e.size());
        for (d dVar : this.f14240e) {
            byteBuffer.putInt(dVar.f14237a);
            byteBuffer.putInt(dVar.f14238b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f14240e.size() * 8) + 8;
    }
}
