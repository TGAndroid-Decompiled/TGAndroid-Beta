package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
public final class z extends a {
    public static final m2.t h;
    public static final m2.t f9746n;
    public static final m2.t f9747r;
    public int f9748e;
    public int[] f9749f;

    static {
        se.a aVar = new se.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f9746n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f9747r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f9748e = e5.b.h(byteBuffer);
        this.f9749f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f9749f[i10] = e5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.p(this.f9748e, byteBuffer);
        for (int i10 : this.f9749f) {
            e5.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = se.a.b(f9747r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        e2.q(se.a.b(h, this, this));
        sb2.append(this.f9748e);
        sb2.append(";opcolor0=");
        m2.t tVar = f9746n;
        e2.q(se.a.b(tVar, this, this));
        sb2.append(this.f9749f[0]);
        sb2.append(";opcolor1=");
        e2.q(se.a.b(tVar, this, this));
        sb2.append(this.f9749f[1]);
        sb2.append(";opcolor2=");
        e2.q(se.a.b(tVar, this, this));
        return a1.g.o(this.f9749f[2], "]", sb2);
    }
}
