package f5;

import ii.n4;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import w7.u6;
public final class w extends com.googlecode.mp4parser.c {
    public static final n4 f9723f;
    public static final n4 h;
    public List f9724e;

    static {
        re.a aVar = new re.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f9723f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = u6.a(e5.b.i(byteBuffer));
        this.f9724e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9724e.add(new v(e5.b.i(byteBuffer), e5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9724e.size());
        for (v vVar : this.f9724e) {
            byteBuffer.putInt((int) vVar.f9721a);
            byteBuffer.putInt((int) vVar.f9722b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9724e.size() * 8) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f9724e.size() + "]";
    }
}
