package i5;

import a8.p0;
import ab.c0;
import c8.pb;
import java.nio.ByteBuffer;
import java.util.Date;
public final class l extends com.googlecode.mp4parser.c {
    public static final ze.b E;
    public static final ze.b F;
    public static final ze.b G;
    public static final ze.b H;
    public static final ze.b I;
    public static final ze.b J;
    public static final ze.b f16078s;
    public static final ze.b f16079w;
    public static final ze.b f16080x;
    public static final ze.b f16081y;
    public Date f16082e;
    public Date f16083f;
    public long h;
    public long f16084n;
    public String f16085r;

    static {
        ze.a aVar = new ze.a(l.class, "MediaHeaderBox.java");
        f16078s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        f16079w = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        J = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f16080x = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f16081y = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        E = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        F = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        G = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        H = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        I = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f16082e = pb.b(h5.b.j(byteBuffer));
            this.f16083f = pb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f16084n = h5.b.j(byteBuffer);
        } else {
            this.f16082e = pb.b(h5.b.i(byteBuffer));
            this.f16083f = pb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f16084n = h5.b.i(byteBuffer);
        }
        int h = h5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < 3; i7++) {
            sb2.append((char) (((h >> ((2 - i7) * 5)) & 31) + 96));
        }
        this.f16085r = sb2.toString();
        h5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(pb.a(this.f16082e));
            byteBuffer.putLong(pb.a(this.f16083f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f16084n);
        } else {
            byteBuffer.putInt((int) pb.a(this.f16082e));
            byteBuffer.putInt((int) pb.a(this.f16083f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f16084n);
        }
        String str = this.f16085r;
        if (str.getBytes().length == 3) {
            int i7 = 0;
            for (int i10 = 0; i10 < 3; i10++) {
                i7 += (str.getBytes()[i10] - 96) << ((2 - i10) * 5);
            }
            h5.b.p(i7, byteBuffer);
            h5.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(p0.p("\"", str, "\" language string isn't exactly 3 characters long!"));
    }

    @Override
    public final long getContentSize() {
        long j3;
        if (e() == 1) {
            j3 = 32;
        } else {
            j3 = 20;
        }
        return j3 + 4;
    }

    public final String toString() {
        c0 b10 = ze.a.b(J, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        c.w(ze.a.b(f16078s, this, this));
        sb2.append(this.f16082e);
        sb2.append(";modificationTime=");
        c.w(ze.a.b(f16079w, this, this));
        sb2.append(this.f16083f);
        sb2.append(";timescale=");
        c.w(ze.a.b(f16080x, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        c.w(ze.a.b(f16081y, this, this));
        sb2.append(this.f16084n);
        sb2.append(";language=");
        c.w(ze.a.b(E, this, this));
        return p0.s(sb2, this.f16085r, "]");
    }
}
