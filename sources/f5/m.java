package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import java.util.Date;
import ji.w4;
import w7.g7;
public final class m extends com.googlecode.mp4parser.c {
    public static final w4 I;
    public static final w4 J;
    public static final w4 K;
    public static final w4 L;
    public static final w4 M;
    public static final w4 N;
    public static final w4 O;
    public static final w4 P;
    public static final w4 Q;
    public static final w4 R;
    public static final w4 S;
    public static final w4 T;
    public static final w4 U;
    public static final w4 V;
    public int E;
    public int F;
    public int G;
    public int H;
    public Date e;
    public Date f8987f;
    public long h;
    public long f8988n;
    public double f8989r;
    public float f8990s;
    public rc.d v;
    public long f8991w;
    public int f8992x;
    public int f8993y;

    static {
        te.a aVar = new te.a(m.class, "MovieHeaderBox.java");
        I = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        J = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        R = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        S = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        T = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        aVar.e(aVar.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        U = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        V = aVar.e(aVar.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        aVar.e(aVar.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        aVar.e(aVar.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        K = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        aVar.e(aVar.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        aVar.e(aVar.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        aVar.e(aVar.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        aVar.e(aVar.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        aVar.e(aVar.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        L = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        M = aVar.e(aVar.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        N = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        O = aVar.e(aVar.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        P = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        Q = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = g7.b(e5.b.j(byteBuffer));
            this.f8987f = g7.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f8988n = e5.b.j(byteBuffer);
        } else {
            this.e = g7.b(e5.b.i(byteBuffer));
            this.f8987f = g7.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f8988n = e5.b.i(byteBuffer);
        }
        this.f8989r = e5.b.f(byteBuffer);
        this.f8990s = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.v = rc.d.a(byteBuffer);
        this.f8992x = byteBuffer.getInt();
        this.f8993y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.f8991w = e5.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(g7.a(this.e));
            byteBuffer.putLong(g7.a(this.f8987f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f8988n);
        } else {
            byteBuffer.putInt((int) g7.a(this.e));
            byteBuffer.putInt((int) g7.a(this.f8987f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f8988n);
        }
        e5.b.n(byteBuffer, this.f8989r);
        e5.b.o(byteBuffer, this.f8990s);
        e5.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.v.b(byteBuffer);
        byteBuffer.putInt(this.f8992x);
        byteBuffer.putInt(this.f8993y);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt((int) this.f8991w);
    }

    @Override
    public final long getContentSize() {
        long j10;
        if (e() == 1) {
            j10 = 32;
        } else {
            j10 = 20;
        }
        return j10 + 80;
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = te.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        k3.p(te.a.b(I, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        k3.p(te.a.b(J, this, this));
        sb2.append(this.f8987f);
        sb2.append(";timescale=");
        k3.p(te.a.b(K, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        k3.p(te.a.b(L, this, this));
        sb2.append(this.f8988n);
        sb2.append(";rate=");
        k3.p(te.a.b(M, this, this));
        sb2.append(this.f8989r);
        sb2.append(";volume=");
        k3.p(te.a.b(N, this, this));
        sb2.append(this.f8990s);
        sb2.append(";matrix=");
        sb2.append(this.v);
        sb2.append(";nextTrackId=");
        k3.p(te.a.b(O, this, this));
        return a1.g.r(sb2, this.f8991w, "]");
    }
}
