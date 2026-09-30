package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.u6;
public final class k extends com.googlecode.mp4parser.c {
    public static final ka.c E;
    public static final ka.c F;
    public static final ka.c G;
    public static final ka.c H;
    public static final ka.c I;
    public static final ka.c f8905s;
    public static final ka.c v;
    public static final ka.c f8906w;
    public static final ka.c f8907x;
    public static final ka.c f8908y;
    public Date e;
    public Date f8909f;
    public long h;
    public long f8910n;
    public String f8911r;

    static {
        re.a aVar = new re.a(k.class, "MediaHeaderBox.java");
        f8905s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f8906w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f8907x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f8908y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.e = u6.b(e5.b.j(byteBuffer));
            this.f8909f = u6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f8910n = e5.b.j(byteBuffer);
        } else {
            this.e = u6.b(e5.b.i(byteBuffer));
            this.f8909f = u6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f8910n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f8911r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(u6.a(this.e));
            byteBuffer.putLong(u6.a(this.f8909f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f8910n);
        } else {
            byteBuffer.putInt((int) u6.a(this.e));
            byteBuffer.putInt((int) u6.a(this.f8909f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f8910n);
        }
        String str = this.f8911r;
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            e5.b.p(i10, byteBuffer);
            e5.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(a4.a.q("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        com.google.firebase.messaging.t b10 = re.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        e2.q(re.a.b(f8905s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        e2.q(re.a.b(v, this, this));
        sb2.append(this.f8909f);
        sb2.append(";timescale=");
        e2.q(re.a.b(f8906w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(re.a.b(f8907x, this, this));
        sb2.append(this.f8910n);
        sb2.append(";language=");
        e2.q(re.a.b(f8908y, this, this));
        return a4.a.t(sb2, this.f8911r, "]");
    }
}
