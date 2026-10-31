package f5;

import c3.i0;
import java.nio.ByteBuffer;
public final class s extends a {
    public static final za.c f6895f;
    public static final za.c h;
    public float e;

    static {
        le.a aVar = new le.a(s.class, "SoundMediaHeaderBox.java");
        f6895f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.o(byteBuffer, this.e);
        e5.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        ji.f b10 = le.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        i0.s(le.a.b(f6895f, this, this));
        sb2.append(this.e);
        sb2.append("]");
        return sb2.toString();
    }
}
