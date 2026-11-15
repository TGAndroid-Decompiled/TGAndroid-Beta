package i5;

import a8.p0;
import ab.c0;
import c8.mb;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Components.ff;
public final class l extends com.googlecode.mp4parser.c {
    public static final ff E;
    public static final ff F;
    public static final ff G;
    public static final ff H;
    public static final ff I;
    public static final ff J;
    public static final ff f15760s;
    public static final ff f15761w;
    public static final ff f15762x;
    public static final ff f15763y;
    public Date f15764e;
    public Date f15765f;
    public long h;
    public long f15766n;
    public String f15767r;

    static {
        ze.a aVar = new ze.a(l.class, "MediaHeaderBox.java");
        f15760s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        f15761w = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        J = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f15762x = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f15763y = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
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
            this.f15764e = mb.b(h5.b.j(byteBuffer));
            this.f15765f = mb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f15766n = h5.b.j(byteBuffer);
        } else {
            this.f15764e = mb.b(h5.b.i(byteBuffer));
            this.f15765f = mb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f15766n = h5.b.i(byteBuffer);
        }
        int h = h5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < 3; i7++) {
            sb2.append((char) (((h >> ((2 - i7) * 5)) & 31) + 96));
        }
        this.f15767r = sb2.toString();
        h5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(mb.a(this.f15764e));
            byteBuffer.putLong(mb.a(this.f15765f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f15766n);
        } else {
            byteBuffer.putInt((int) mb.a(this.f15764e));
            byteBuffer.putInt((int) mb.a(this.f15765f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f15766n);
        }
        String str = this.f15767r;
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
        c.u(ze.a.b(f15760s, this, this));
        sb2.append(this.f15764e);
        sb2.append(";modificationTime=");
        c.u(ze.a.b(f15761w, this, this));
        sb2.append(this.f15765f);
        sb2.append(";timescale=");
        c.u(ze.a.b(f15762x, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        c.u(ze.a.b(f15763y, this, this));
        sb2.append(this.f15766n);
        sb2.append(";language=");
        c.u(ze.a.b(E, this, this));
        return p0.s(sb2, this.f15767r, "]");
    }
}
