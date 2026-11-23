package i5;

import a8.p0;
import ab.c0;
import java.nio.ByteBuffer;
public final class a0 extends a {
    public static final ze.b h;
    public static final ze.b f16046n;
    public static final ze.b f16047r;
    public int f16048e;
    public int[] f16049f;

    static {
        ze.a aVar = new ze.a(a0.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f16046n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f16047r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f16048e = h5.b.h(byteBuffer);
        this.f16049f = new int[3];
        for (int i7 = 0; i7 < 3; i7++) {
            this.f16049f[i7] = h5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.p(this.f16048e, byteBuffer);
        for (int i7 : this.f16049f) {
            h5.b.p(i7, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        c0 b10 = ze.a.b(f16047r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        c.w(ze.a.b(h, this, this));
        sb2.append(this.f16048e);
        sb2.append(";opcolor0=");
        ze.b bVar = f16046n;
        c.w(ze.a.b(bVar, this, this));
        sb2.append(this.f16049f[0]);
        sb2.append(";opcolor1=");
        c.w(ze.a.b(bVar, this, this));
        sb2.append(this.f16049f[1]);
        sb2.append(";opcolor2=");
        c.w(ze.a.b(bVar, this, this));
        return p0.n(this.f16049f[2], "]", sb2);
    }
}
