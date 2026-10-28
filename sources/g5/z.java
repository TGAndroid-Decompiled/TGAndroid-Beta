package g5;

import c3.h0;
import java.nio.ByteBuffer;
import li.e3;
public final class z extends a {
    public static final e3 h;
    public static final e3 f12350n;
    public static final e3 f12351r;
    public int e;
    public int[] f12352f;

    static {
        ue.a aVar = new ue.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f12350n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f12351r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = f5.b.h(byteBuffer);
        this.f12352f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f12352f[i10] = f5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        f5.b.p(this.e, byteBuffer);
        for (int i10 : this.f12352f) {
            f5.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        ti.e b10 = ue.a.b(f12351r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        h0.s(ue.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        e3 e3Var = f12350n;
        h0.s(ue.a.b(e3Var, this, this));
        sb2.append(this.f12352f[0]);
        sb2.append(";opcolor1=");
        h0.s(ue.a.b(e3Var, this, this));
        sb2.append(this.f12352f[1]);
        sb2.append(";opcolor2=");
        h0.s(ue.a.b(e3Var, this, this));
        return a1.g.n(this.f12352f[2], "]", sb2);
    }
}
