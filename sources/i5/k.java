package i5;

import a8.p0;
import c8.kb;
import java.nio.ByteBuffer;
import java.util.Date;
import y7.i6;
public final class k extends com.googlecode.mp4parser.c {
    public static final i6 D;
    public static final i6 E;
    public static final i6 F;
    public static final i6 G;
    public static final i6 H;
    public static final i6 I;
    public static final i6 f15304s;
    public static final i6 f15305w;
    public static final i6 f15306x;
    public static final i6 f15307y;
    public Date f15308e;
    public Date f15309f;
    public long h;
    public long f15310n;
    public String f15311r;

    static {
        ze.a aVar = new ze.a(k.class, "MediaHeaderBox.java");
        f15304s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        f15305w = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f15306x = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f15307y = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
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
            this.f15308e = kb.b(h5.b.j(byteBuffer));
            this.f15309f = kb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f15310n = h5.b.j(byteBuffer);
        } else {
            this.f15308e = kb.b(h5.b.i(byteBuffer));
            this.f15309f = kb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f15310n = h5.b.i(byteBuffer);
        }
        int h = h5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < 3; i7++) {
            sb2.append((char) (((h >> ((2 - i7) * 5)) & 31) + 96));
        }
        this.f15311r = sb2.toString();
        h5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(kb.a(this.f15308e));
            byteBuffer.putLong(kb.a(this.f15309f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f15310n);
        } else {
            byteBuffer.putInt((int) kb.a(this.f15308e));
            byteBuffer.putInt((int) kb.a(this.f15309f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f15310n);
        }
        String str = this.f15311r;
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
        ui.e b10 = ze.a.b(I, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15304s, this, this));
        sb2.append(this.f15308e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15305w, this, this));
        sb2.append(this.f15309f);
        sb2.append(";timescale=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15306x, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15307y, this, this));
        sb2.append(this.f15310n);
        sb2.append(";language=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(D, this, this));
        return p0.s(sb2, this.f15311r, "]");
    }
}
