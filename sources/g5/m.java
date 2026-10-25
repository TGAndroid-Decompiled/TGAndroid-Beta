package g5;

import c3.h0;
import java.nio.ByteBuffer;
import java.util.Date;
import li.e3;
public final class m extends com.googlecode.mp4parser.c {
    public static final e3 I;
    public static final e3 J;
    public static final e3 K;
    public static final e3 L;
    public static final e3 M;
    public static final e3 N;
    public static final e3 O;
    public static final e3 P;
    public static final e3 Q;
    public static final e3 R;
    public static final e3 S;
    public static final e3 T;
    public static final e3 U;
    public static final e3 V;
    public int E;
    public int F;
    public int G;
    public int H;
    public Date e;
    public Date f12319f;
    public long h;
    public long f12320n;
    public double f12321r;
    public float f12322s;
    public sc.d v;
    public long f12323w;
    public int f12324x;
    public int f12325y;

    static {
        ue.a aVar = new ue.a(m.class, "MovieHeaderBox.java");
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
            this.e = i8.e.b(f5.b.j(byteBuffer));
            this.f12319f = i8.e.b(f5.b.j(byteBuffer));
            this.h = f5.b.i(byteBuffer);
            this.f12320n = f5.b.j(byteBuffer);
        } else {
            this.e = i8.e.b(f5.b.i(byteBuffer));
            this.f12319f = i8.e.b(f5.b.i(byteBuffer));
            this.h = f5.b.i(byteBuffer);
            this.f12320n = f5.b.i(byteBuffer);
        }
        this.f12321r = f5.b.f(byteBuffer);
        this.f12322s = f5.b.g(byteBuffer);
        f5.b.h(byteBuffer);
        f5.b.i(byteBuffer);
        f5.b.i(byteBuffer);
        this.v = sc.d.a(byteBuffer);
        this.f12324x = byteBuffer.getInt();
        this.f12325y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.f12323w = f5.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(i8.e.a(this.e));
            byteBuffer.putLong(i8.e.a(this.f12319f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f12320n);
        } else {
            byteBuffer.putInt((int) i8.e.a(this.e));
            byteBuffer.putInt((int) i8.e.a(this.f12319f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f12320n);
        }
        f5.b.n(byteBuffer, this.f12321r);
        f5.b.o(byteBuffer, this.f12322s);
        f5.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.v.b(byteBuffer);
        byteBuffer.putInt(this.f12324x);
        byteBuffer.putInt(this.f12325y);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt((int) this.f12323w);
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
        ti.e b10 = ue.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        h0.s(ue.a.b(I, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        h0.s(ue.a.b(J, this, this));
        sb2.append(this.f12319f);
        sb2.append(";timescale=");
        h0.s(ue.a.b(K, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        h0.s(ue.a.b(L, this, this));
        sb2.append(this.f12320n);
        sb2.append(";rate=");
        h0.s(ue.a.b(M, this, this));
        sb2.append(this.f12321r);
        sb2.append(";volume=");
        h0.s(ue.a.b(N, this, this));
        sb2.append(this.f12322s);
        sb2.append(";matrix=");
        sb2.append(this.v);
        sb2.append(";nextTrackId=");
        h0.s(ue.a.b(O, this, this));
        return a1.g.r(sb2, this.f12323w, "]");
    }
}
