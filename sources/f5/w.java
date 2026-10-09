package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import w7.s6;
public final class w extends com.googlecode.mp4parser.c {
    public static final m2.t f9735f;
    public static final m2.t h;
    public List f9736e;

    static {
        se.a aVar = new se.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f9735f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = s6.a(e5.b.i(byteBuffer));
        this.f9736e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9736e.add(new v(e5.b.i(byteBuffer), e5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9736e.size());
        for (v vVar : this.f9736e) {
            byteBuffer.putInt((int) vVar.f9733a);
            byteBuffer.putInt((int) vVar.f9734b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9736e.size() * 8) + 8;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = se.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f9736e.size() + "]";
    }
}
