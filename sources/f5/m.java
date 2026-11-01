package f5;

import c3.i0;
import java.nio.ByteBuffer;
import java.util.Date;
import v7.r8;
public final class m extends com.googlecode.mp4parser.c {
    public static final za.c I;
    public static final za.c J;
    public static final za.c K;
    public static final za.c L;
    public static final za.c M;
    public static final za.c N;
    public static final za.c O;
    public static final za.c P;
    public static final za.c Q;
    public static final za.c R;
    public static final za.c S;
    public static final za.c T;
    public static final za.c U;
    public static final za.c V;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public Date e;
    public Date f6879f;
    public long h;
    public long f6880n;
    public double f6881r;
    public float f6882s;
    public jc.d f6883w;
    public long f6884x;
    public int f6885y;

    static {
        le.a aVar = new le.a(m.class, "MovieHeaderBox.java");
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
            this.e = r8.b(e5.b.j(byteBuffer));
            this.f6879f = r8.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f6880n = e5.b.j(byteBuffer);
        } else {
            this.e = r8.b(e5.b.i(byteBuffer));
            this.f6879f = r8.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f6880n = e5.b.i(byteBuffer);
        }
        this.f6881r = e5.b.f(byteBuffer);
        this.f6882s = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.f6883w = jc.d.a(byteBuffer);
        this.f6885y = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.f6884x = e5.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(r8.a(this.e));
            byteBuffer.putLong(r8.a(this.f6879f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f6880n);
        } else {
            byteBuffer.putInt((int) r8.a(this.e));
            byteBuffer.putInt((int) r8.a(this.f6879f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f6880n);
        }
        e5.b.n(byteBuffer, this.f6881r);
        e5.b.o(byteBuffer, this.f6882s);
        e5.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.f6883w.b(byteBuffer);
        byteBuffer.putInt(this.f6885y);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt((int) this.f6884x);
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
        ji.f b10 = le.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        i0.s(le.a.b(I, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        i0.s(le.a.b(J, this, this));
        sb2.append(this.f6879f);
        sb2.append(";timescale=");
        i0.s(le.a.b(K, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        i0.s(le.a.b(L, this, this));
        sb2.append(this.f6880n);
        sb2.append(";rate=");
        i0.s(le.a.b(M, this, this));
        sb2.append(this.f6881r);
        sb2.append(";volume=");
        i0.s(le.a.b(N, this, this));
        sb2.append(this.f6882s);
        sb2.append(";matrix=");
        sb2.append(this.f6883w);
        sb2.append(";nextTrackId=");
        i0.s(le.a.b(O, this, this));
        return a1.g.q(sb2, this.f6884x, "]");
    }
}
