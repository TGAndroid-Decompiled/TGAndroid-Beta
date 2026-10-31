package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import v7.q8;
public final class w extends com.googlecode.mp4parser.c {
    public static final za.c f6901f;
    public static final za.c h;
    public List e;

    static {
        le.a aVar = new le.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f6901f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = q8.a(e5.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new v(e5.b.i(byteBuffer), e5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (v vVar : this.e) {
            byteBuffer.putInt((int) vVar.f6899a);
            byteBuffer.putInt((int) vVar.f6900b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 8) + 8;
    }

    public final String toString() {
        ji.f b10 = le.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.e.size() + "]";
    }
}
