package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.q6;
public final class k extends com.googlecode.mp4parser.c {
    public static final mg.n E;
    public static final mg.n F;
    public static final mg.n G;
    public static final mg.n H;
    public static final mg.n I;
    public static final mg.n f9340s;
    public static final mg.n v;
    public static final mg.n f9341w;
    public static final mg.n f9342x;
    public static final mg.n f9343y;
    public Date f9344e;
    public Date f9345f;
    public long h;
    public long f9346n;
    public String f9347r;

    static {
        re.a aVar = new re.a(k.class, "MediaHeaderBox.java");
        f9340s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f9341w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f9342x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f9343y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.f9344e = q6.b(e5.b.j(byteBuffer));
            this.f9345f = q6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f9346n = e5.b.j(byteBuffer);
        } else {
            this.f9344e = q6.b(e5.b.i(byteBuffer));
            this.f9345f = q6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f9346n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f9347r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(q6.a(this.f9344e));
            byteBuffer.putLong(q6.a(this.f9345f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f9346n);
        } else {
            byteBuffer.putInt((int) q6.a(this.f9344e));
            byteBuffer.putInt((int) q6.a(this.f9345f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f9346n);
        }
        String str = this.f9347r;
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
        e2.q(re.a.b(f9340s, this, this));
        sb2.append(this.f9344e);
        sb2.append(";modificationTime=");
        e2.q(re.a.b(v, this, this));
        sb2.append(this.f9345f);
        sb2.append(";timescale=");
        e2.q(re.a.b(f9341w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(re.a.b(f9342x, this, this));
        sb2.append(this.f9346n);
        sb2.append(";language=");
        e2.q(re.a.b(f9343y, this, this));
        return a4.a.s(sb2, this.f9347r, "]");
    }
}
