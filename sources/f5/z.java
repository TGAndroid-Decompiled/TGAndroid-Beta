package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
public final class z extends a {
    public static final te.b h;
    public static final te.b f10476n;
    public static final te.b f10477r;
    public int e;
    public int[] f10478f;

    static {
        te.a aVar = new te.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f10476n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f10477r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.h(byteBuffer);
        this.f10478f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f10478f[i10] = e5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.p(this.e, byteBuffer);
        for (int i10 : this.f10478f) {
            e5.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.r b10 = te.a.b(f10477r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        k3.o(te.a.b(h, this, this));
        sb2.append(this.e);
        sb2.append(";opcolor0=");
        te.b bVar = f10476n;
        k3.o(te.a.b(bVar, this, this));
        sb2.append(this.f10478f[0]);
        sb2.append(";opcolor1=");
        k3.o(te.a.b(bVar, this, this));
        sb2.append(this.f10478f[1]);
        sb2.append(";opcolor2=");
        k3.o(te.a.b(bVar, this, this));
        return a1.g.n(this.f10478f[2], "]", sb2);
    }
}
