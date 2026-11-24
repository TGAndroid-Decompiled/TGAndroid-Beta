package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
public final class ns6 extends g2 {
    public static final ai4 E;
    public static final ai4 F;
    public static final ai4 G;
    public static final ai4 H;
    public static final ai4 I;
    public static final ai4 J;
    public static final ai4 s;
    public static final ai4 w;
    public static final ai4 x;
    public static final ai4 y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        i94 i94Var = new i94(ns6.class, "MediaHeaderBox.java");
        s = i94Var.e(i94Var.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        w = i94Var.e(i94Var.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        J = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        x = i94Var.e(i94Var.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        y = i94Var.e(i94Var.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        E = i94Var.e(i94Var.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        F = i94Var.e(i94Var.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        i94Var.e(i94Var.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        G = i94Var.e(i94Var.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        H = i94Var.e(i94Var.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        I = i94Var.e(i94Var.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = oee.b(jne.h(byteBuffer));
            this.f = oee.b(jne.h(byteBuffer));
            this.h = jne.g(byteBuffer);
            this.n = jne.h(byteBuffer);
        } else {
            this.e = oee.b(jne.g(byteBuffer));
            this.f = oee.b(jne.g(byteBuffer));
            this.h = jne.g(byteBuffer);
            this.n = jne.g(byteBuffer);
        }
        int f = jne.f(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((f >> ((2 - i) * 5)) & 31) + 96));
        }
        this.r = sb.toString();
        jne.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(oee.a(date));
            byteBuffer.putLong(oee.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) oee.a(date));
            byteBuffer.putInt((int) oee.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length == 3) {
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
            }
            kne.d(i, byteBuffer);
            kne.d(0, byteBuffer);
            return;
        }
        u36.j(kt6.o("\"", str, "\" language string isn't exactly 3 characters long!"));
    }

    @Override
    public final long getContentSize() {
        long j;
        if (e() == 1) {
            j = 32;
        } else {
            j = 20;
        }
        return j + 4;
    }

    public final String toString() {
        xvc b = i94.b(J, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("MediaHeaderBox[creationTime=");
        aq1.r(i94.b(s, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        aq1.r(i94.b(w, this, this));
        sb.append(this.f);
        sb.append(";timescale=");
        aq1.r(i94.b(x, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        aq1.r(i94.b(y, this, this));
        sb.append(this.n);
        sb.append(";language=");
        aq1.r(i94.b(E, this, this));
        return b10.j(sb, this.r, "]");
    }
}
