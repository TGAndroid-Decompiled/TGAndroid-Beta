package i5;

import ab.c0;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ff;
public final class t extends a {
    public static final ff f15788f;
    public static final ff h;
    public float f15789e;

    static {
        ze.a aVar = new ze.a(t.class, "SoundMediaHeaderBox.java");
        f15788f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f15789e = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.o(byteBuffer, this.f15789e);
        h5.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        c0 b10 = ze.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        c.u(ze.a.b(f15788f, this, this));
        sb2.append(this.f15789e);
        sb2.append("]");
        return sb2.toString();
    }
}
