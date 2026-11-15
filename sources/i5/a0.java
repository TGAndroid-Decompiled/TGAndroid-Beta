package i5;

import a8.p0;
import ab.c0;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ff;
public final class a0 extends a {
    public static final ff h;
    public static final ff f15737n;
    public static final ff f15738r;
    public int f15739e;
    public int[] f15740f;

    static {
        ze.a aVar = new ze.a(a0.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f15737n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f15738r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f15739e = h5.b.h(byteBuffer);
        this.f15740f = new int[3];
        for (int i7 = 0; i7 < 3; i7++) {
            this.f15740f[i7] = h5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.p(this.f15739e, byteBuffer);
        for (int i7 : this.f15740f) {
            h5.b.p(i7, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        c0 b10 = ze.a.b(f15738r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        c.u(ze.a.b(h, this, this));
        sb2.append(this.f15739e);
        sb2.append(";opcolor0=");
        ff ffVar = f15737n;
        c.u(ze.a.b(ffVar, this, this));
        sb2.append(this.f15740f[0]);
        sb2.append(";opcolor1=");
        c.u(ze.a.b(ffVar, this, this));
        sb2.append(this.f15740f[1]);
        sb2.append(";opcolor2=");
        c.u(ze.a.b(ffVar, this, this));
        return p0.n(this.f15740f[2], "]", sb2);
    }
}
