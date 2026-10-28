package g5;

import c3.h0;
import java.nio.ByteBuffer;
import java.util.Date;
import li.e3;
public final class k extends com.googlecode.mp4parser.c {
    public static final e3 E;
    public static final e3 F;
    public static final e3 G;
    public static final e3 H;
    public static final e3 I;
    public static final e3 f12311s;
    public static final e3 v;
    public static final e3 f12312w;
    public static final e3 f12313x;
    public static final e3 f12314y;
    public Date e;
    public Date f12315f;
    public long h;
    public long f12316n;
    public String f12317r;

    static {
        ue.a aVar = new ue.a(k.class, "MediaHeaderBox.java");
        f12311s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f12312w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f12313x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f12314y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.e = i8.e.b(f5.b.j(byteBuffer));
            this.f12315f = i8.e.b(f5.b.j(byteBuffer));
            this.h = f5.b.i(byteBuffer);
            this.f12316n = f5.b.j(byteBuffer);
        } else {
            this.e = i8.e.b(f5.b.i(byteBuffer));
            this.f12315f = i8.e.b(f5.b.i(byteBuffer));
            this.h = f5.b.i(byteBuffer);
            this.f12316n = f5.b.i(byteBuffer);
        }
        int h = f5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f12317r = sb2.toString();
        f5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(i8.e.a(this.e));
            byteBuffer.putLong(i8.e.a(this.f12315f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f12316n);
        } else {
            byteBuffer.putInt((int) i8.e.a(this.e));
            byteBuffer.putInt((int) i8.e.a(this.f12315f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f12316n);
        }
        String str = this.f12317r;
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            f5.b.p(i10, byteBuffer);
            f5.b.p(0, byteBuffer);
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
        ti.e b10 = ue.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        h0.s(ue.a.b(f12311s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        h0.s(ue.a.b(v, this, this));
        sb2.append(this.f12315f);
        sb2.append(";timescale=");
        h0.s(ue.a.b(f12312w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        h0.s(ue.a.b(f12313x, this, this));
        sb2.append(this.f12316n);
        sb2.append(";language=");
        h0.s(ue.a.b(f12314y, this, this));
        return a1.g.s(sb2, this.f12317r, "]");
    }
}
