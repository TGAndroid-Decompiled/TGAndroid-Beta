package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import k2.c0;
public final class z extends a {
    public static final c0 h;
    public static final c0 f8962n;
    public static final c0 f8963r;
    public int e;
    public int[] f8964f;

    static {
        re.a aVar = new re.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f8962n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f8963r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.h(byteBuffer);
        this.f8964f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f8964f[i10] = e5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.p(this.e, byteBuffer);
        for (int i10 : this.f8964f) {
            e5.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = re.a.b(f8963r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        e2.q(re.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        c0 c0Var = f8962n;
        e2.q(re.a.b(c0Var, this, this));
        sb2.append(this.f8964f[0]);
        sb2.append(";opcolor1=");
        e2.q(re.a.b(c0Var, this, this));
        sb2.append(this.f8964f[1]);
        sb2.append(";opcolor2=");
        e2.q(re.a.b(c0Var, this, this));
        return a4.a.n(this.f8964f[2], "]", sb2);
    }
}
