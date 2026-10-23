package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.c7;
public final class k extends com.googlecode.mp4parser.c {
    public static final te.b E;
    public static final te.b F;
    public static final te.b G;
    public static final te.b H;
    public static final te.b I;
    public static final te.b f10437s;
    public static final te.b v;
    public static final te.b f10438w;
    public static final te.b f10439x;
    public static final te.b f10440y;
    public Date e;
    public Date f10441f;
    public long h;
    public long f10442n;
    public String f10443r;

    static {
        te.a aVar = new te.a(k.class, "MediaHeaderBox.java");
        f10437s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        v = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        I = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f10438w = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f10439x = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f10440y = aVar.e(aVar.d("getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
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
            this.e = c7.b(e5.b.j(byteBuffer));
            this.f10441f = c7.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f10442n = e5.b.j(byteBuffer);
        } else {
            this.e = c7.b(e5.b.i(byteBuffer));
            this.f10441f = c7.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f10442n = e5.b.i(byteBuffer);
        }
        int h = e5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((h >> ((2 - i10) * 5)) & 31) + 96));
        }
        this.f10443r = sb2.toString();
        e5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(c7.a(this.e));
            byteBuffer.putLong(c7.a(this.f10441f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f10442n);
        } else {
            byteBuffer.putInt((int) c7.a(this.e));
            byteBuffer.putInt((int) c7.a(this.f10441f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f10442n);
        }
        String str = this.f10443r;
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
        k3.o(te.a.b(f10437s, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        k3.o(te.a.b(v, this, this));
        sb2.append(this.f10441f);
        sb2.append(";timescale=");
        k3.o(te.a.b(f10438w, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        k3.o(te.a.b(f10439x, this, this));
        sb2.append(this.f10442n);
        sb2.append(";language=");
        k3.o(te.a.b(f10440y, this, this));
        return a1.g.s(sb2, this.f10443r, "]");
    }
}
