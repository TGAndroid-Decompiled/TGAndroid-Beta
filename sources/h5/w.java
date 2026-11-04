package h5;

import b8.ee;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.ui.Components.i9;
public final class w extends com.googlecode.mp4parser.c {
    public static final i9 f14291f;
    public static final i9 h;
    public List f14292e;

    static {
        we.a aVar = new we.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f14291f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ee.a(g5.b.i(byteBuffer));
        this.f14292e = new ArrayList(a10);
        for (int i3 = 0; i3 < a10; i3++) {
            this.f14292e.add(new v(g5.b.i(byteBuffer), g5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f14292e.size());
        for (v vVar : this.f14292e) {
            byteBuffer.putInt((int) vVar.f14289a);
            byteBuffer.putInt((int) vVar.f14290b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f14292e.size() * 8) + 8;
    }

    public final String toString() {
        ui.f b10 = we.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f14292e.size() + "]";
    }
}
