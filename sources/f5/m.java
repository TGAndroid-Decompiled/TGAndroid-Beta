package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.v6;
public final class m extends com.googlecode.mp4parser.c {
    public static final ka.c I;
    public static final ka.c J;
    public static final ka.c K;
    public static final ka.c L;
    public static final ka.c M;
    public static final ka.c N;
    public static final ka.c O;
    public static final ka.c P;
    public static final ka.c Q;
    public static final ka.c R;
    public static final ka.c S;
    public static final ka.c T;
    public static final ka.c U;
    public static final ka.c V;
    public int E;
    public int F;
    public int G;
    public int H;
    public Date e;
    public Date f8930f;
    public long h;
    public long f8931n;
    public double f8932r;
    public float f8933s;
    public qc.d v;
    public long f8934w;
    public int f8935x;
    public int f8936y;

    static {
        re.a aVar = new re.a(m.class, "MovieHeaderBox.java");
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
            this.e = v6.b(e5.b.j(byteBuffer));
            this.f8930f = v6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f8931n = e5.b.j(byteBuffer);
        } else {
            this.e = v6.b(e5.b.i(byteBuffer));
            this.f8930f = v6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f8931n = e5.b.i(byteBuffer);
        }
        this.f8932r = e5.b.f(byteBuffer);
        this.f8933s = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.v = qc.d.a(byteBuffer);
        this.f8935x = byteBuffer.getInt();
        this.f8936y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.f8934w = e5.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(v6.a(this.e));
            byteBuffer.putLong(v6.a(this.f8930f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f8931n);
        } else {
            byteBuffer.putInt((int) v6.a(this.e));
            byteBuffer.putInt((int) v6.a(this.f8930f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f8931n);
        }
        e5.b.n(byteBuffer, this.f8932r);
        e5.b.o(byteBuffer, this.f8933s);
        e5.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.v.b(byteBuffer);
        byteBuffer.putInt(this.f8935x);
        byteBuffer.putInt(this.f8936y);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt((int) this.f8934w);
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
        com.google.firebase.messaging.t b10 = re.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        e2.q(re.a.b(I, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        e2.q(re.a.b(J, this, this));
        sb2.append(this.f8930f);
        sb2.append(";timescale=");
        e2.q(re.a.b(K, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(re.a.b(L, this, this));
        sb2.append(this.f8931n);
        sb2.append(";rate=");
        e2.q(re.a.b(M, this, this));
        sb2.append(this.f8932r);
        sb2.append(";volume=");
        e2.q(re.a.b(N, this, this));
        sb2.append(this.f8933s);
        sb2.append(";matrix=");
        sb2.append(this.v);
        sb2.append(";nextTrackId=");
        e2.q(re.a.b(O, this, this));
        return a4.a.r(sb2, this.f8934w, "]");
    }
}
