package i5;

import a8.p0;
import ab.c0;
import java.nio.ByteBuffer;
public final class a0 extends a {
    public static final ze.b h;
    public static final ze.b f16055n;
    public static final ze.b f16056r;
    public int f16057e;
    public int[] f16058f;

    static {
        ze.a aVar = new ze.a(a0.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f16055n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f16056r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f16057e = h5.b.h(byteBuffer);
        this.f16058f = new int[3];
        for (int i7 = 0; i7 < 3; i7++) {
            this.f16058f[i7] = h5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.p(this.f16057e, byteBuffer);
        for (int i7 : this.f16058f) {
            h5.b.p(i7, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        c0 b10 = ze.a.b(f16056r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        c.w(ze.a.b(h, this, this));
        sb2.append(this.f16057e);
        sb2.append(";opcolor0=");
        ze.b bVar = f16055n;
        c.w(ze.a.b(bVar, this, this));
        sb2.append(this.f16058f[0]);
        sb2.append(";opcolor1=");
        c.w(ze.a.b(bVar, this, this));
        sb2.append(this.f16058f[1]);
        sb2.append(";opcolor2=");
        c.w(ze.a.b(bVar, this, this));
        return p0.n(this.f16058f[2], "]", sb2);
    }
}
