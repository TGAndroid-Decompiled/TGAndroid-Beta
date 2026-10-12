package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import m.y0;
import w7.s6;
public final class k extends com.googlecode.mp4parser.c {
    public static final y0 E;
    public static final y0 F;
    public static final y0 G;
    public static final y0 H;
    public static final y0 I;
    public static final y0 f9697s;
    public static final y0 v;
    public static final y0 f9698w;
    public static final y0 f9699x;
    public static final y0 f9700y;
    public Date f9701e;
    public Date f9702f;
    public long h;
    public long f9703n;
    public String f9704r;

    static {
        se.a aVar = new se.a(k.class, "MediaHeaderBox.java");
        f9697s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f9698w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f9699x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f9700y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.f9701e = s6.b(e5.b.j(byteBuffer));
            this.f9702f = s6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f9703n = e5.b.j(byteBuffer);
        } else {
            this.f9701e = s6.b(e5.b.i(byteBuffer));
            this.f9702f = s6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f9703n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f9704r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(s6.a(this.f9701e));
            byteBuffer.putLong(s6.a(this.f9702f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f9703n);
        } else {
            byteBuffer.putInt((int) s6.a(this.f9701e));
            byteBuffer.putInt((int) s6.a(this.f9702f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f9703n);
        }
        String str = this.f9704r;
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            e5.b.p(i10, byteBuffer);
            e5.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(a1.g.q("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        com.google.firebase.messaging.s b10 = se.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        e2.q(se.a.b(f9697s, this, this));
        sb2.append(this.f9701e);
        sb2.append(";modificationTime=");
        e2.q(se.a.b(v, this, this));
        sb2.append(this.f9702f);
        sb2.append(";timescale=");
        e2.q(se.a.b(f9698w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(se.a.b(f9699x, this, this));
        sb2.append(this.f9703n);
        sb2.append(";language=");
        e2.q(se.a.b(f9700y, this, this));
        return a1.g.t(sb2, this.f9704r, "]");
    }
}
