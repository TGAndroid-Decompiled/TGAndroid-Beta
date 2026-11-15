package i5;

import c8.lb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ff;
public final class f extends com.googlecode.mp4parser.c {
    public static final ff f15744f;
    public List f15745e;

    static {
        ze.a aVar = new ze.a(f.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f15744f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = lb.a(h5.b.i(byteBuffer));
        this.f15745e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15745e.add(new e(lb.a(h5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15745e.size());
        for (e eVar : this.f15745e) {
            byteBuffer.putInt(eVar.f15742a);
            byteBuffer.putInt(eVar.f15743b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15745e.size() * 8) + 8;
    }
}
