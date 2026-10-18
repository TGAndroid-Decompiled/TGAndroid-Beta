package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
public final class s extends a {
    public static final le.b f10446f;
    public static final le.b h;
    public float e;

    static {
        te.a aVar = new te.a(s.class, "SoundMediaHeaderBox.java");
        f10446f = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
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
        com.google.firebase.messaging.r b10 = te.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        k3.p(te.a.b(f10446f, this, this));
        sb2.append(this.e);
        sb2.append("]");
        return sb2.toString();
    }
}
