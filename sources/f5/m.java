package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import m.g3;
import w7.t6;
public final class m extends com.googlecode.mp4parser.c {
    public static final g3 I;
    public static final g3 J;
    public static final g3 K;
    public static final g3 L;
    public static final g3 M;
    public static final g3 N;
    public static final g3 O;
    public static final g3 P;
    public static final g3 Q;
    public static final g3 R;
    public static final g3 S;
    public static final g3 T;
    public static final g3 U;
    public static final g3 V;
    public int E;
    public int F;
    public int G;
    public int H;
    public Date e;
    public Date f7812f;
    public long h;
    public long f7813n;
    public double f7814r;
    public float f7815s;
    public qc.d v;
    public long f7816w;
    public int f7817x;
    public int f7818y;

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
            this.e = t6.b(e5.b.j(byteBuffer));
            this.f7812f = t6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f7813n = e5.b.j(byteBuffer);
        } else {
            this.e = t6.b(e5.b.i(byteBuffer));
            this.f7812f = t6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            this.f7813n = e5.b.i(byteBuffer);
        }
        this.f7814r = e5.b.f(byteBuffer);
        this.f7815s = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.v = qc.d.a(byteBuffer);
        this.f7817x = byteBuffer.getInt();
        this.f7818y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.f7816w = e5.b.i(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(t6.a(this.e));
            byteBuffer.putLong(t6.a(this.f7812f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.f7813n);
        } else {
            byteBuffer.putInt((int) t6.a(this.e));
            byteBuffer.putInt((int) t6.a(this.f7812f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.f7813n);
        }
        e5.b.n(byteBuffer, this.f7814r);
        e5.b.o(byteBuffer, this.f7815s);
        e5.b.p(0, byteBuffer);
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        this.v.b(byteBuffer);
        byteBuffer.putInt(this.f7817x);
        byteBuffer.putInt(this.f7818y);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt((int) this.f7816w);
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
        com.google.firebase.messaging.s b10 = re.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        e2.q(re.a.b(I, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        e2.q(re.a.b(J, this, this));
        sb2.append(this.f7812f);
        sb2.append(";timescale=");
        e2.q(re.a.b(K, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(re.a.b(L, this, this));
        sb2.append(this.f7813n);
        sb2.append(";rate=");
        e2.q(re.a.b(M, this, this));
        sb2.append(this.f7814r);
        sb2.append(";volume=");
        e2.q(re.a.b(N, this, this));
        sb2.append(this.f7815s);
        sb2.append(";matrix=");
        sb2.append(this.v);
        sb2.append(";nextTrackId=");
        e2.q(re.a.b(O, this, this));
        return a4.a.r(sb2, this.f7816w, "]");
    }
}
