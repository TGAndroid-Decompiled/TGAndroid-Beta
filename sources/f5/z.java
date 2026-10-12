package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import m.y0;
public final class z extends a {
    public static final y0 h;
    public static final y0 f9744n;
    public static final y0 f9745r;
    public int f9746e;
    public int[] f9747f;

    static {
        se.a aVar = new se.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f9744n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f9745r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f9746e = e5.b.h(byteBuffer);
        this.f9747f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f9747f[i10] = e5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.p(this.f9746e, byteBuffer);
        for (int i10 : this.f9747f) {
            e5.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = se.a.b(f9745r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        e2.q(se.a.b(h, this, this));
        sb2.append(this.f9746e);
        sb2.append(";opcolor0=");
        y0 y0Var = f9744n;
        e2.q(se.a.b(y0Var, this, this));
        sb2.append(this.f9747f[0]);
        sb2.append(";opcolor1=");
        e2.q(se.a.b(y0Var, this, this));
        sb2.append(this.f9747f[1]);
        sb2.append(";opcolor2=");
        e2.q(se.a.b(y0Var, this, this));
        return a1.g.o(this.f9747f[2], "]", sb2);
    }
}
