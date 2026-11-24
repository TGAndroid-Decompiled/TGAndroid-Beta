package defpackage;

import java.nio.ByteBuffer;
public final class dbc extends n3 {
    public static final z24 h;
    public static final z24 n;
    public static final z24 r;
    public int e;
    public int[] f;

    static {
        z74 z74Var = new z74(dbc.class, "VideoMediaHeaderBox.java");
        h = z74Var.e(z74Var.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = z74Var.e(z74Var.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        z74Var.e(z74Var.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        z74Var.e(z74Var.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = hle.f(byteBuffer);
        this.f = new int[3];
        for (int i = 0; i < 3; i++) {
            this.f[i] = hle.f(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        ile.d(this.e, byteBuffer);
        for (int i : this.f) {
            ile.d(i, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        c5a b = z74.b(r, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        oo1.r(z74.b(h, this, this));
        sb.append(this.e);
        sb.append(";opcolor0=");
        z24 z24Var = n;
        oo1.r(z74.b(z24Var, this, this));
        sb.append(this.f[0]);
        sb.append(";opcolor1=");
        oo1.r(z74.b(z24Var, this, this));
        sb.append(this.f[1]);
        sb.append(";opcolor2=");
        oo1.r(z74.b(z24Var, this, this));
        return de9.l(sb, this.f[2], "]");
    }
}
