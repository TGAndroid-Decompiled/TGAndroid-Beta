package f5;

import com.google.android.gms.internal.vision.e2;
import ii.n4;
import java.nio.ByteBuffer;
public final class s extends a {
    public static final n4 f9716f;
    public static final n4 h;
    public float f9717e;

    static {
        re.a aVar = new re.a(s.class, "SoundMediaHeaderBox.java");
        f9716f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f9717e = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.o(byteBuffer, this.f9717e);
        e5.b.p(0, byteBuffer);
    }

    @Override
    public final long getContentSize() {
        return 8L;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        e2.q(re.a.b(f9716f, this, this));
        sb2.append(this.f9717e);
        sb2.append("]");
        return sb2.toString();
    }
}
