package i5;

import a8.p0;
import c8.jb;
import java.nio.ByteBuffer;
import java.util.Date;
import y7.i6;
public final class m extends com.googlecode.mp4parser.c {
    public static final i6 I;
    public static final i6 J;
    public static final i6 K;
    public static final i6 L;
    public static final i6 M;
    public static final i6 N;
    public static final i6 O;
    public static final i6 P;
    public static final i6 Q;
    public static final i6 R;
    public static final i6 S;
    public static final i6 T;
    public static final i6 U;
    public static final i6 V;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public Date f15307e;
    public Date f15308f;
    public long h;
    public long f15309n;
    public double f15310r;
    public float f15311s;
    public pc.d f15312w;
    public long f15313x;
    public int f15314y;

    static {
        ze.a aVar = new ze.a(m.class, "MovieHeaderBox.java");
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
            this.f15307e = jb.b(h5.b.j(byteBuffer));
            this.f15308f = jb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f15309n = h5.b.j(byteBuffer);
        } else {
            this.f15307e = jb.b(h5.b.i(byteBuffer));
            this.f15308f = jb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f15309n = h5.b.i(byteBuffer);
        }
        this.f15310r = h5.b.f(byteBuffer);
        this.f15311s = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
        h5.b.i(byteBuffer);
        h5.b.i(byteBuffer);
        this.f15312w = pc.d.a(byteBuffer);
        this.f15314y = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.f15313x = h5.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(jb.a(this.f15307e));
            byteBuffer.putLong(jb.a(this.f15308f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f15309n);
        } else {
            byteBuffer.putInt((int) jb.a(this.f15307e));
            byteBuffer.putInt((int) jb.a(this.f15308f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f15309n);
        }
        h5.b.n(byteBuffer, this.f15310r);
        h5.b.o(byteBuffer, this.f15311s);
        h5.b.p(0, byteBuffer);
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        this.f15312w.b(byteBuffer);
        byteBuffer.putInt(this.f15314y);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt((int) this.f15313x);
    }

    @Override
    public final long getContentSize() {
        long j3;
        if (e() == 1) {
            j3 = 32;
        } else {
            j3 = 20;
        }
        return j3 + 80;
    }

    public final String toString() {
        ui.e b10 = ze.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(I, this, this));
        sb2.append(this.f15307e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(J, this, this));
        sb2.append(this.f15308f);
        sb2.append(";timescale=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(K, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(L, this, this));
        sb2.append(this.f15309n);
        sb2.append(";rate=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(M, this, this));
        sb2.append(this.f15310r);
        sb2.append(";volume=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(N, this, this));
        sb2.append(this.f15311s);
        sb2.append(";matrix=");
        sb2.append(this.f15312w);
        sb2.append(";nextTrackId=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(O, this, this));
        return p0.r(sb2, this.f15313x, "]");
    }
}
