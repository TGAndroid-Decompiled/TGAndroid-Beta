package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.t6;
public final class k extends com.googlecode.mp4parser.c {
    public static final m2.t E;
    public static final m2.t F;
    public static final m2.t G;
    public static final m2.t H;
    public static final m2.t I;
    public static final m2.t f9699s;
    public static final m2.t v;
    public static final m2.t f9700w;
    public static final m2.t f9701x;
    public static final m2.t f9702y;
    public Date f9703e;
    public Date f9704f;
    public long h;
    public long f9705n;
    public String f9706r;

    static {
        se.a aVar = new se.a(k.class, "MediaHeaderBox.java");
        f9699s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f9700w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f9701x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f9702y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.f9703e = t6.b(e5.b.j(byteBuffer));
            this.f9704f = t6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f9705n = e5.b.j(byteBuffer);
        } else {
            this.f9703e = t6.b(e5.b.i(byteBuffer));
            this.f9704f = t6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f9705n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f9706r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(t6.a(this.f9703e));
            byteBuffer.putLong(t6.a(this.f9704f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f9705n);
        } else {
            byteBuffer.putInt((int) t6.a(this.f9703e));
            byteBuffer.putInt((int) t6.a(this.f9704f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f9705n);
        }
        String str = this.f9706r;
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
        e2.q(se.a.b(f9699s, this, this));
        sb2.append(this.f9703e);
        sb2.append(";modificationTime=");
        e2.q(se.a.b(v, this, this));
        sb2.append(this.f9704f);
        sb2.append(";timescale=");
        e2.q(se.a.b(f9700w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(se.a.b(f9701x, this, this));
        sb2.append(this.f9705n);
        sb2.append(";language=");
        e2.q(se.a.b(f9702y, this, this));
        return a1.g.t(sb2, this.f9706r, "]");
    }
}
