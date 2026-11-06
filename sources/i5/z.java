package i5;

import a8.p0;
import java.nio.ByteBuffer;
import y7.i6;
public final class z extends a {
    public static final i6 h;
    public static final i6 f15347n;
    public static final i6 f15348r;
    public int f15349e;
    public int[] f15350f;

    static {
        ze.a aVar = new ze.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f15347n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f15348r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f15349e = h5.b.h(byteBuffer);
        this.f15350f = new int[3];
        for (int i7 = 0; i7 < 3; i7++) {
            this.f15350f[i7] = h5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        h5.b.p(this.f15349e, byteBuffer);
        for (int i7 : this.f15350f) {
            h5.b.p(i7, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(f15348r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(h, this, this));
        sb2.append(this.f15349e);
        sb2.append(";opcolor0=");
        i6 i6Var = f15347n;
        com.google.android.recaptcha.internal.a.t(ze.a.b(i6Var, this, this));
        sb2.append(this.f15350f[0]);
        sb2.append(";opcolor1=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(i6Var, this, this));
        sb2.append(this.f15350f[1]);
        sb2.append(";opcolor2=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(i6Var, this, this));
        return p0.n(this.f15350f[2], "]", sb2);
    }
}
