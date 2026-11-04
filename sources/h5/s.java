package h5;

import java.nio.ByteBuffer;
import org.telegram.ui.Components.i9;
public final class s extends a {
    public static final i9 f14283f;
    public static final i9 h;
    public float f14284e;

    static {
        we.a aVar = new we.a(s.class, "SoundMediaHeaderBox.java");
        f14283f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f14284e = g5.b.g(byteBuffer);
        g5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        g5.b.o(byteBuffer, this.f14284e);
        g5.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        ui.f b10 = we.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14283f, this, this));
        sb2.append(this.f14284e);
        sb2.append("]");
        return sb2.toString();
    }
}
