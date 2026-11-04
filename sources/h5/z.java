package h5;

import java.nio.ByteBuffer;
import org.telegram.ui.Components.i9;
public final class z extends a {
    public static final i9 h;
    public static final i9 f14304n;
    public static final i9 f14305r;
    public int f14306e;
    public int[] f14307f;

    static {
        we.a aVar = new we.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f14304n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f14305r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f14306e = g5.b.h(byteBuffer);
        this.f14307f = new int[3];
        for (int i3 = 0; i3 < 3; i3++) {
            this.f14307f[i3] = g5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        g5.b.p(this.f14306e, byteBuffer);
        for (int i3 : this.f14307f) {
            g5.b.p(i3, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        ui.f b10 = we.a.b(f14305r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        com.google.android.recaptcha.internal.a.t(we.a.b(h, this, this));
        sb2.append(this.f14306e);
        sb2.append(";opcolor0=");
        i9 i9Var = f14304n;
        com.google.android.recaptcha.internal.a.t(we.a.b(i9Var, this, this));
        sb2.append(this.f14307f[0]);
        sb2.append(";opcolor1=");
        com.google.android.recaptcha.internal.a.t(we.a.b(i9Var, this, this));
        sb2.append(this.f14307f[1]);
        sb2.append(";opcolor2=");
        com.google.android.recaptcha.internal.a.t(we.a.b(i9Var, this, this));
        return a1.g.o(this.f14307f[2], "]", sb2);
    }
}
