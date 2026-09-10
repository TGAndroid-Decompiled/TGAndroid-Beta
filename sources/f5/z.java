package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import m.g3;
public final class z extends a {
    public static final g3 h;
    public static final g3 f7844n;
    public static final g3 f7845r;
    public int e;
    public int[] f7846f;

    static {
        re.a aVar = new re.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f7844n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f7845r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.h(byteBuffer);
        this.f7846f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f7846f[i10] = e5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.p(this.e, byteBuffer);
        for (int i10 : this.f7846f) {
            e5.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(f7845r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        e2.q(re.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        g3 g3Var = f7844n;
        e2.q(re.a.b(g3Var, this, this));
        sb2.append(this.f7846f[0]);
        sb2.append(";opcolor1=");
        e2.q(re.a.b(g3Var, this, this));
        sb2.append(this.f7846f[1]);
        sb2.append(";opcolor2=");
        e2.q(re.a.b(g3Var, this, this));
        return a4.a.n(this.f7846f[2], "]", sb2);
    }
}
