package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
public final class z extends a {
    public static final mg.n h;
    public static final mg.n f9387n;
    public static final mg.n f9388r;
    public int f9389e;
    public int[] f9390f;

    static {
        re.a aVar = new re.a(z.class, "VideoMediaHeaderBox.java");
        h = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        f9387n = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        f9388r = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f9389e = e5.b.h(byteBuffer);
        this.f9390f = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f9390f[i10] = e5.b.h(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        e5.b.p(this.f9389e, byteBuffer);
        for (int i10 : this.f9390f) {
            e5.b.p(i10, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(f9388r, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        e2.q(re.a.b(h, this, this));
        sb2.append(this.f9389e);
        sb2.append(";opcolor0=");
        mg.n nVar = f9387n;
        e2.q(re.a.b(nVar, this, this));
        sb2.append(this.f9390f[0]);
        sb2.append(";opcolor1=");
        e2.q(re.a.b(nVar, this, this));
        sb2.append(this.f9390f[1]);
        sb2.append(";opcolor2=");
        e2.q(re.a.b(nVar, this, this));
        return a4.a.n(this.f9390f[2], "]", sb2);
    }
}
