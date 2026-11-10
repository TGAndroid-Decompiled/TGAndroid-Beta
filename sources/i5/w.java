package i5;

import c8.jb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import y7.i6;
public final class w extends com.googlecode.mp4parser.c {
    public static final i6 f15340f;
    public static final i6 h;
    public List f15341e;

    static {
        ze.a aVar = new ze.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f15340f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = jb.a(h5.b.i(byteBuffer));
        this.f15341e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15341e.add(new v(h5.b.i(byteBuffer), h5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15341e.size());
        for (v vVar : this.f15341e) {
            byteBuffer.putInt((int) vVar.f15338a);
            byteBuffer.putInt((int) vVar.f15339b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15341e.size() * 8) + 8;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f15341e.size() + "]";
    }
}
