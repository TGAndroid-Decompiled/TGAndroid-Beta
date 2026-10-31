package f5;

import c3.i0;
import java.nio.ByteBuffer;
import java.util.Date;
import v7.r8;
public final class k extends com.googlecode.mp4parser.c {
    public static final za.c D;
    public static final za.c E;
    public static final za.c F;
    public static final za.c G;
    public static final za.c H;
    public static final za.c I;
    public static final za.c f6871s;
    public static final za.c f6872w;
    public static final za.c f6873x;
    public static final za.c f6874y;
    public Date e;
    public Date f6875f;
    public long h;
    public long f6876n;
    public String f6877r;

    static {
        le.a aVar = new le.a(k.class, "MediaHeaderBox.java");
        f6871s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        f6872w = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f6873x = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f6874y = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        D = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        E = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "void"));
        aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "void"));
        F = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "void"));
        G = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "void"));
        H = aVar.e(aVar.d("setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = r8.b(e5.b.j(byteBuffer));
            this.f6875f = r8.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f6876n = e5.b.j(byteBuffer);
        } else {
            this.e = r8.b(e5.b.i(byteBuffer));
            this.f6875f = r8.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f6876n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f6877r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(r8.a(this.e));
            byteBuffer.putLong(r8.a(this.f6875f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f6876n);
        } else {
            byteBuffer.putInt((int) r8.a(this.e));
            byteBuffer.putInt((int) r8.a(this.f6875f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f6876n);
        }
        String str = this.f6877r;
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            e5.b.p(i10, byteBuffer);
            e5.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(a1.g.n("\"", str, "\" language string isn't exactly 3 characters long!"));
    }

    @Override
    public final long getContentSize() {
        long j10;
        if (e() == 1) {
            j10 = 32;
        } else {
            j10 = 20;
        }
        return j10 + 4;
    }

    public final String toString() {
        ji.f b10 = le.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        i0.s(le.a.b(f6871s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        i0.s(le.a.b(f6872w, this, this));
        sb2.append(this.f6875f);
        sb2.append(";timescale=");
        i0.s(le.a.b(f6873x, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        i0.s(le.a.b(f6874y, this, this));
        sb2.append(this.f6876n);
        sb2.append(";language=");
        i0.s(le.a.b(D, this, this));
        return a1.g.r(sb2, this.f6877r, "]");
    }
}
