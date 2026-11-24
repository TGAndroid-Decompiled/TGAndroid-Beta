package defpackage;

import java.nio.ByteBuffer;
public final class oma extends n3 {
    public static final ai4 f;
    public static final ai4 h;
    public float e;

    static {
        i94 i94Var = new i94(oma.class, "SoundMediaHeaderBox.java");
        f = i94Var.e(i94Var.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"));
        h = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = jne.e(byteBuffer);
        jne.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        kne.c(byteBuffer, this.e);
        kne.d(0, byteBuffer);
    }

    public final String toString() {
        xvc b = i94.b(h, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("SoundMediaHeaderBox[balance=");
        aq1.r(i94.b(f, this, this));
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}
