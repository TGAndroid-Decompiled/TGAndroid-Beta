package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.v6;
public final class y extends com.googlecode.mp4parser.c {
    public static final ka.c E;
    public static final ka.c F;
    public static final ka.c G;
    public static final ka.c H;
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
    public static final ka.c W;
    public static final ka.c X;
    public static final ka.c Y;
    public static final ka.c Z;
    public static final ka.c f8953a0;
    public static final ka.c f8954b0;
    public Date e;
    public Date f8955f;
    public long h;
    public long f8956n;
    public int f8957r;
    public int f8958s;
    public float v;
    public qc.d f8959w;
    public double f8960x;
    public double f8961y;

    static {
        re.a aVar = new re.a(y.class, "TrackHeaderBox.java");
        E = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        F = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        N = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        O = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        P = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        Q = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        R = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        S = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        T = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        U = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        V = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        W = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        G = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        X = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        Y = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        aVar.e(aVar.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        Z = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        f8953a0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        f8954b0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        H = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        I = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        J = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        K = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        L = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        M = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = v6.b(e5.b.j(byteBuffer));
            this.f8955f = v6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            e5.b.i(byteBuffer);
            long j3 = byteBuffer.getLong();
            this.f8956n = j3;
            if (j3 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = v6.b(e5.b.i(byteBuffer));
            this.f8955f = v6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            e5.b.i(byteBuffer);
            this.f8956n = e5.b.i(byteBuffer);
        }
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.f8957r = e5.b.h(byteBuffer);
        this.f8958s = e5.b.h(byteBuffer);
        this.v = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        this.f8959w = qc.d.a(byteBuffer);
        this.f8960x = e5.b.f(byteBuffer);
        this.f8961y = e5.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.firebase.messaging.t c10 = re.a.c(N, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(v6.a(this.e));
            byteBuffer.putLong(v6.a(this.f8955f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f8956n);
        } else {
            byteBuffer.putInt((int) v6.a(this.e));
            byteBuffer.putInt((int) v6.a(this.f8955f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f8956n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        e5.b.p(this.f8957r, byteBuffer);
        e5.b.p(this.f8958s, byteBuffer);
        e5.b.o(byteBuffer, this.v);
        e5.b.p(0, byteBuffer);
        this.f8959w.b(byteBuffer);
        e5.b.n(byteBuffer, this.f8960x);
        e5.b.n(byteBuffer, this.f8961y);
    }

    @Override
    public final long getContentSize() {
        long j3;
        if (e() == 1) {
            j3 = 36;
        } else {
            j3 = 24;
        }
        return j3 + 60;
    }

    public final String toString() {
        com.google.firebase.messaging.t b10 = re.a.b(O, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        e2.q(re.a.b(E, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        e2.q(re.a.b(F, this, this));
        sb2.append(this.f8955f);
        sb2.append(";trackId=");
        e2.q(re.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(re.a.b(H, this, this));
        sb2.append(this.f8956n);
        sb2.append(";layer=");
        e2.q(re.a.b(I, this, this));
        sb2.append(this.f8957r);
        sb2.append(";alternateGroup=");
        e2.q(re.a.b(J, this, this));
        sb2.append(this.f8958s);
        sb2.append(";volume=");
        e2.q(re.a.b(K, this, this));
        sb2.append(this.v);
        sb2.append(";matrix=");
        sb2.append(this.f8959w);
        sb2.append(";width=");
        e2.q(re.a.b(L, this, this));
        sb2.append(this.f8960x);
        sb2.append(";height=");
        e2.q(re.a.b(M, this, this));
        sb2.append(this.f8961y);
        sb2.append("]");
        return sb2.toString();
    }
}
