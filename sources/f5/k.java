package f5;

import com.google.android.gms.internal.cast.a6;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.h7;
public final class k extends com.googlecode.mp4parser.c {
    public static final le.b E;
    public static final le.b F;
    public static final le.b G;
    public static final le.b H;
    public static final le.b I;
    public static final le.b f10421s;
    public static final le.b v;
    public static final le.b f10422w;
    public static final le.b f10423x;
    public static final le.b f10424y;
    public Date e;
    public Date f10425f;
    public long h;
    public long f10426n;
    public String f10427r;

    static {
        te.a aVar = new te.a(k.class, "MediaHeaderBox.java");
        f10421s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f10422w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f10423x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f10424y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.e = h7.b(e5.b.j(byteBuffer));
            this.f10425f = h7.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f10426n = e5.b.j(byteBuffer);
        } else {
            this.e = h7.b(e5.b.i(byteBuffer));
            this.f10425f = h7.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f10426n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f10427r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(h7.a(this.e));
            byteBuffer.putLong(h7.a(this.f10425f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f10426n);
        } else {
            byteBuffer.putInt((int) h7.a(this.e));
            byteBuffer.putInt((int) h7.a(this.f10425f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f10426n);
        }
        String str = this.f10427r;
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            e5.b.p(i10, byteBuffer);
            e5.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(a1.g.p("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        com.google.firebase.messaging.r b10 = te.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        a6.p(te.a.b(f10421s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        a6.p(te.a.b(v, this, this));
        sb2.append(this.f10425f);
        sb2.append(";timescale=");
        a6.p(te.a.b(f10422w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        a6.p(te.a.b(f10423x, this, this));
        sb2.append(this.f10426n);
        sb2.append(";language=");
        a6.p(te.a.b(f10424y, this, this));
        return a1.g.s(sb2, this.f10427r, "]");
    }
}
