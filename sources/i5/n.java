package i5;

import a8.p0;
import ab.c0;
import c8.pb;
import java.nio.ByteBuffer;
import java.util.Date;
public final class n extends com.googlecode.mp4parser.c {
    public static final ze.b J;
    public static final ze.b K;
    public static final ze.b L;
    public static final ze.b M;
    public static final ze.b N;
    public static final ze.b O;
    public static final ze.b P;
    public static final ze.b Q;
    public static final ze.b R;
    public static final ze.b S;
    public static final ze.b T;
    public static final ze.b U;
    public static final ze.b V;
    public static final ze.b W;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public Date f16083e;
    public Date f16084f;
    public long h;
    public long f16085n;
    public double f16086r;
    public float f16087s;
    public pc.d f16088w;
    public long f16089x;
    public int f16090y;

    static {
        ze.a aVar = new ze.a(n.class, "MovieHeaderBox.java");
        J = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        K = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        S = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        T = aVar.e(aVar.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        U = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        aVar.e(aVar.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        V = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        W = aVar.e(aVar.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        aVar.e(aVar.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        aVar.e(aVar.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        L = aVar.e(aVar.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        aVar.e(aVar.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        aVar.e(aVar.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        aVar.e(aVar.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        aVar.e(aVar.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        aVar.e(aVar.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        aVar.e(aVar.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        M = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        N = aVar.e(aVar.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        O = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        P = aVar.e(aVar.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        Q = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        R = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f16083e = pb.b(h5.b.j(byteBuffer));
            this.f16084f = pb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f16085n = h5.b.j(byteBuffer);
        } else {
            this.f16083e = pb.b(h5.b.i(byteBuffer));
            this.f16084f = pb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            this.f16085n = h5.b.i(byteBuffer);
        }
        this.f16086r = h5.b.f(byteBuffer);
        this.f16087s = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
        h5.b.i(byteBuffer);
        h5.b.i(byteBuffer);
        this.f16088w = pc.d.a(byteBuffer);
        this.f16090y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.I = byteBuffer.getInt();
        this.f16089x = h5.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(pb.a(this.f16083e));
            byteBuffer.putLong(pb.a(this.f16084f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f16085n);
        } else {
            byteBuffer.putInt((int) pb.a(this.f16083e));
            byteBuffer.putInt((int) pb.a(this.f16084f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f16085n);
        }
        h5.b.n(byteBuffer, this.f16086r);
        h5.b.o(byteBuffer, this.f16087s);
        h5.b.p(0, byteBuffer);
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        this.f16088w.b(byteBuffer);
        byteBuffer.putInt(this.f16090y);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt(this.I);
        byteBuffer.putInt((int) this.f16089x);
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
        c0 b10 = ze.a.b(Q, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        c.w(ze.a.b(J, this, this));
        sb2.append(this.f16083e);
        sb2.append(";modificationTime=");
        c.w(ze.a.b(K, this, this));
        sb2.append(this.f16084f);
        sb2.append(";timescale=");
        c.w(ze.a.b(L, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        c.w(ze.a.b(M, this, this));
        sb2.append(this.f16085n);
        sb2.append(";rate=");
        c.w(ze.a.b(N, this, this));
        sb2.append(this.f16086r);
        sb2.append(";volume=");
        c.w(ze.a.b(O, this, this));
        sb2.append(this.f16087s);
        sb2.append(";matrix=");
        sb2.append(this.f16088w);
        sb2.append(";nextTrackId=");
        c.w(ze.a.b(P, this, this));
        return p0.r(sb2, this.f16089x, "]");
    }
}
