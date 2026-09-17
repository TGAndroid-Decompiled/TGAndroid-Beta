package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.q6;
public final class y extends com.googlecode.mp4parser.c {
    public static final mg.n E;
    public static final mg.n F;
    public static final mg.n G;
    public static final mg.n H;
    public static final mg.n I;
    public static final mg.n J;
    public static final mg.n K;
    public static final mg.n L;
    public static final mg.n M;
    public static final mg.n N;
    public static final mg.n O;
    public static final mg.n P;
    public static final mg.n Q;
    public static final mg.n R;
    public static final mg.n S;
    public static final mg.n T;
    public static final mg.n U;
    public static final mg.n V;
    public static final mg.n W;
    public static final mg.n X;
    public static final mg.n Y;
    public static final mg.n Z;
    public static final mg.n f9349a0;
    public static final mg.n f9350b0;
    public Date f9351e;
    public Date f9352f;
    public long h;
    public long f9353n;
    public int f9354r;
    public int f9355s;
    public float v;
    public qc.d f9356w;
    public double f9357x;
    public double f9358y;

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
        f9349a0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        f9350b0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
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
            this.f9351e = q6.b(e5.b.j(byteBuffer));
            this.f9352f = q6.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            e5.b.i(byteBuffer);
            long j3 = byteBuffer.getLong();
            this.f9353n = j3;
            if (j3 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f9351e = q6.b(e5.b.i(byteBuffer));
            this.f9352f = q6.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            e5.b.i(byteBuffer);
            this.f9353n = e5.b.i(byteBuffer);
        }
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.f9354r = e5.b.h(byteBuffer);
        this.f9355s = e5.b.h(byteBuffer);
        this.v = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        this.f9356w = qc.d.a(byteBuffer);
        this.f9357x = e5.b.f(byteBuffer);
        this.f9358y = e5.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.firebase.messaging.s c10 = re.a.c(N, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(q6.a(this.f9351e));
            byteBuffer.putLong(q6.a(this.f9352f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f9353n);
        } else {
            byteBuffer.putInt((int) q6.a(this.f9351e));
            byteBuffer.putInt((int) q6.a(this.f9352f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f9353n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        e5.b.p(this.f9354r, byteBuffer);
        e5.b.p(this.f9355s, byteBuffer);
        e5.b.o(byteBuffer, this.v);
        e5.b.p(0, byteBuffer);
        this.f9356w.b(byteBuffer);
        e5.b.n(byteBuffer, this.f9357x);
        e5.b.n(byteBuffer, this.f9358y);
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
        com.google.firebase.messaging.s b10 = re.a.b(O, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        e2.q(re.a.b(E, this, this));
        sb2.append(this.f9351e);
        sb2.append(";modificationTime=");
        e2.q(re.a.b(F, this, this));
        sb2.append(this.f9352f);
        sb2.append(";trackId=");
        e2.q(re.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        e2.q(re.a.b(H, this, this));
        sb2.append(this.f9353n);
        sb2.append(";layer=");
        e2.q(re.a.b(I, this, this));
        sb2.append(this.f9354r);
        sb2.append(";alternateGroup=");
        e2.q(re.a.b(J, this, this));
        sb2.append(this.f9355s);
        sb2.append(";volume=");
        e2.q(re.a.b(K, this, this));
        sb2.append(this.v);
        sb2.append(";matrix=");
        sb2.append(this.f9356w);
        sb2.append(";width=");
        e2.q(re.a.b(L, this, this));
        sb2.append(this.f9357x);
        sb2.append(";height=");
        e2.q(re.a.b(M, this, this));
        sb2.append(this.f9358y);
        sb2.append("]");
        return sb2.toString();
    }
}
