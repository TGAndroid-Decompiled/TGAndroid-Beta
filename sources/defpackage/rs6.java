package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
public final class rs6 extends h2 {
    public static final xh4 E;
    public static final xh4 F;
    public static final xh4 G;
    public static final xh4 H;
    public static final xh4 I;
    public static final xh4 J;
    public static final xh4 s;
    public static final xh4 w;
    public static final xh4 x;
    public static final xh4 y;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public String r;

    static {
        u84 u84Var = new u84(rs6.class, "MediaHeaderBox.java");
        s = u84Var.e(u84Var.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        w = u84Var.e(u84Var.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        J = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        x = u84Var.e(u84Var.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        y = u84Var.e(u84Var.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        E = u84Var.e(u84Var.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        F = u84Var.e(u84Var.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        u84Var.e(u84Var.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        G = u84Var.e(u84Var.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        H = u84Var.e(u84Var.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        I = u84Var.e(u84Var.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = ehe.b(zpe.h(byteBuffer));
            this.f = ehe.b(zpe.h(byteBuffer));
            this.h = zpe.g(byteBuffer);
            this.n = zpe.h(byteBuffer);
        } else {
            this.e = ehe.b(zpe.g(byteBuffer));
            this.f = ehe.b(zpe.g(byteBuffer));
            this.h = zpe.g(byteBuffer);
            this.n = zpe.g(byteBuffer);
        }
        int f = zpe.f(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((f >> ((2 - i) * 5)) & 31) + 96));
        }
        this.r = sb.toString();
        zpe.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(ehe.a(date));
            byteBuffer.putLong(ehe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) ehe.a(date));
            byteBuffer.putInt((int) ehe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        String str = this.r;
        if (str.getBytes().length == 3) {
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
            }
            aqe.d(i, byteBuffer);
            aqe.d(0, byteBuffer);
            return;
        }
        lq5.j(qd4.y("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        lyc b = u84.b(J, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder("MediaHeaderBox[creationTime=");
        bp1.r(u84.b(s, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        bp1.r(u84.b(w, this, this));
        sb.append(this.f);
        sb.append(";timescale=");
        bp1.r(u84.b(x, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        bp1.r(u84.b(y, this, this));
        sb.append(this.n);
        sb.append(";language=");
        bp1.r(u84.b(E, this, this));
        return c00.k(sb, this.r, "]");
    }
}
