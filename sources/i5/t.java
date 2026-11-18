package i5;

import ab.c0;
import java.nio.ByteBuffer;
public final class t extends a {
    public static final ze.b f16103f;
    public static final ze.b h;
    public float f16104e;

    static {
        ze.a aVar = new ze.a(t.class, "SoundMediaHeaderBox.java");
        f16103f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f16104e = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.o(byteBuffer, this.f16104e);
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
        c.w(ze.a.b(f16103f, this, this));
        sb2.append(this.f16104e);
        sb2.append("]");
        return sb2.toString();
    }
}
