package h5;

import b8.fe;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Components.i9;
public final class k extends com.googlecode.mp4parser.c {
    public static final i9 E;
    public static final i9 F;
    public static final i9 G;
    public static final i9 H;
    public static final i9 I;
    public static final i9 J;
    public static final i9 f14255s;
    public static final i9 f14256w;
    public static final i9 f14257x;
    public static final i9 f14258y;
    public Date f14259e;
    public Date f14260f;
    public long h;
    public long f14261n;
    public String f14262r;

    static {
        we.a aVar = new we.a(k.class, "MediaHeaderBox.java");
        f14255s = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        f14256w = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.util.Date"));
        J = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "java.lang.String"));
        f14257x = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
        f14258y = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "long"));
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
            this.f14259e = fe.b(g5.b.j(byteBuffer));
            this.f14260f = fe.b(g5.b.j(byteBuffer));
            this.h = g5.b.i(byteBuffer);
            this.f14261n = g5.b.j(byteBuffer);
        } else {
            this.f14259e = fe.b(g5.b.i(byteBuffer));
            this.f14260f = fe.b(g5.b.i(byteBuffer));
            this.h = g5.b.i(byteBuffer);
            this.f14261n = g5.b.i(byteBuffer);
        }
        int h = g5.b.h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < 3; i3++) {
            sb2.append((char) (((h >> ((2 - i3) * 5)) & 31) + 96));
        }
        this.f14262r = sb2.toString();
        g5.b.h(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(fe.a(this.f14259e));
            byteBuffer.putLong(fe.a(this.f14260f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f14261n);
        } else {
            byteBuffer.putInt((int) fe.a(this.f14259e));
            byteBuffer.putInt((int) fe.a(this.f14260f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f14261n);
        }
        String str = this.f14262r;
        if (str.getBytes().length == 3) {
            int i3 = 0;
            for (int i10 = 0; i10 < 3; i10++) {
                i3 += (str.getBytes()[i10] - 96) << ((2 - i10) * 5);
            }
            g5.b.p(i3, byteBuffer);
            g5.b.p(0, byteBuffer);
            return;
        }
        throw new IllegalArgumentException(a1.g.q("\"", str, "\" language string isn't exactly 3 characters long!"));
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
        ui.f b10 = we.a.b(J, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MediaHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14255s, this, this));
        sb2.append(this.f14259e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14256w, this, this));
        sb2.append(this.f14260f);
        sb2.append(";timescale=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14257x, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14258y, this, this));
        sb2.append(this.f14261n);
        sb2.append(";language=");
        com.google.android.recaptcha.internal.a.t(we.a.b(E, this, this));
        return a1.g.s(sb2, this.f14262r, "]");
    }
}
