package i5;

import ab.c0;
import c8.lb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.ui.Components.ff;
public final class x extends com.googlecode.mp4parser.c {
    public static final ff f15796f;
    public static final ff h;
    public List f15797e;

    static {
        ze.a aVar = new ze.a(x.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f15796f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = lb.a(h5.b.i(byteBuffer));
        this.f15797e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15797e.add(new w(h5.b.i(byteBuffer), h5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15797e.size());
        for (w wVar : this.f15797e) {
            byteBuffer.putInt((int) wVar.f15794a);
            byteBuffer.putInt((int) wVar.f15795b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15797e.size() * 8) + 8;
    }

    public final String toString() {
        c0 b10 = ze.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f15797e.size() + "]";
    }
}
