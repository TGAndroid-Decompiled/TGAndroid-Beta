package i5;

import java.nio.ByteBuffer;
import y7.i6;
public final class s extends a {
    public static final i6 f15327f;
    public static final i6 h;
    public float f15328e;

    static {
        ze.a aVar = new ze.a(s.class, "SoundMediaHeaderBox.java");
        f15327f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f15328e = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.o(byteBuffer, this.f15328e);
        h5.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15327f, this, this));
        sb2.append(this.f15328e);
        sb2.append("]");
        return sb2.toString();
    }
}
