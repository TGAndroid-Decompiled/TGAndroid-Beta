package defpackage;

import java.nio.ByteBuffer;
public final class gdc extends n3 {
    public static final ai4 h;
    public static final ai4 n;
    public static final ai4 r;
    public int e;
    public int[] f;

    static {
        i94 i94Var = new i94(gdc.class, "VideoMediaHeaderBox.java");
        h = i94Var.e(i94Var.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"));
        n = i94Var.e(i94Var.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"));
        r = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"));
        i94Var.e(i94Var.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"));
        i94Var.e(i94Var.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = jne.f(byteBuffer);
        this.f = new int[3];
        for (int i = 0; i < 3; i++) {
            this.f[i] = jne.f(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        kne.d(this.e, byteBuffer);
        for (int i : this.f) {
            kne.d(i, byteBuffer);
        }
    }

    @Override
    public final long getContentSize() {
        return 12L;
    }

    public final String toString() {
        xvc b = i94.b(r, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        aq1.r(i94.b(h, this, this));
        sb.append(this.e);
        sb.append(";opcolor0=");
        ai4 ai4Var = n;
        aq1.r(i94.b(ai4Var, this, this));
        sb.append(this.f[0]);
        sb.append(";opcolor1=");
        aq1.r(i94.b(ai4Var, this, this));
        sb.append(this.f[1]);
        sb.append(";opcolor2=");
        aq1.r(i94.b(ai4Var, this, this));
        return hg9.k(sb, this.f[2], "]");
    }
}
