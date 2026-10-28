package g5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import li.e3;
public final class w extends com.googlecode.mp4parser.c {
    public static final e3 f12340f;
    public static final e3 h;
    public List e;

    static {
        ue.a aVar = new ue.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f12340f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = f6.e.a(f5.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new v(f5.b.i(byteBuffer), f5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (v vVar : this.e) {
            byteBuffer.putInt((int) vVar.f12338a);
            byteBuffer.putInt((int) vVar.f12339b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 8) + 8;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.e.size() + "]";
    }
}
