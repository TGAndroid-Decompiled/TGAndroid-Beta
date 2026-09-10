package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import m.g3;
import w7.t6;
public final class k extends com.googlecode.mp4parser.c {
    public static final g3 E;
    public static final g3 F;
    public static final g3 G;
    public static final g3 H;
    public static final g3 I;
    public static final g3 f7805s;
    public static final g3 v;
    public static final g3 f7806w;
    public static final g3 f7807x;
    public static final g3 f7808y;
    public Date e;
    public Date f7809f;
    public long h;
    public long f7810n;
    public String f7811r;

    static {
        re.a aVar = new re.a(k.class, "MediaHeaderBox.java");
        f7805s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f7806w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f7807x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f7808y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.e = t6.b(e5.b.j(byteBuffer));
            this.f7809f = t6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f7810n = e5.b.j(byteBuffer);
        } else {
            this.e = t6.b(e5.b.i(byteBuffer));
            this.f7809f = t6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f7810n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f7811r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(t6.a(this.e));
            byteBuffer.putLong(t6.a(this.f7809f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f7810n);
        } else {
            byteBuffer.putInt((int) t6.a(this.e));
            byteBuffer.putInt((int) t6.a(this.f7809f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f7810n);
        }
        String str = this.f7811r;
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            e5.b.p(i10, byteBuffer);
            e5.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(a4.a.p("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        com.google.firebase.messaging.s b10 = re.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        e2.q(re.a.b(f7805s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        e2.q(re.a.b(v, this, this));
        sb2.append(this.f7809f);
        sb2.append(";timescale=");
        e2.q(re.a.b(f7806w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(re.a.b(f7807x, this, this));
        sb2.append(this.f7810n);
        sb2.append(";language=");
        e2.q(re.a.b(f7808y, this, this));
        return a4.a.s(sb2, this.f7811r, "]");
    }
}
