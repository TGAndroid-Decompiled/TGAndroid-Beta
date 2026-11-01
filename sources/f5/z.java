package f5;

import c3.i0;
import java.nio.ByteBuffer;
public final class z extends a {
    public static final za.c h;
    public static final za.c f6912n;
    public static final za.c f6913r;
    public int e;
    public int[] f6914f;

    static {
        le.a aVar = new le.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f6912n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f6913r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.h(byteBuffer);
        this.f6914f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f6914f[i10] = e5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.p(this.e, byteBuffer);
        for (int i10 : this.f6914f) {
            e5.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        ji.f b10 = le.a.b(f6913r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        i0.s(le.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        za.c cVar = f6912n;
        i0.s(le.a.b(cVar, this, this));
        sb2.append(this.f6914f[0]);
        sb2.append(";opcolor1=");
        i0.s(le.a.b(cVar, this, this));
        sb2.append(this.f6914f[1]);
        sb2.append(";opcolor2=");
        i0.s(le.a.b(cVar, this, this));
        return a1.g.p(sb2, this.f6914f[2], "]");
    }
}
