package i5;

import ab.c0;
import c8.qb;
import java.nio.ByteBuffer;
import java.util.Date;
public final class z extends com.googlecode.mp4parser.c {
    public static final v4.b F;
    public static final v4.b G;
    public static final v4.b H;
    public static final v4.b I;
    public static final v4.b J;
    public static final v4.b K;
    public static final v4.b L;
    public static final v4.b M;
    public static final v4.b N;
    public static final v4.b O;
    public static final v4.b P;
    public static final v4.b Q;
    public static final v4.b R;
    public static final v4.b S;
    public static final v4.b T;
    public static final v4.b U;
    public static final v4.b V;
    public static final v4.b W;
    public static final v4.b X;
    public static final v4.b Y;
    public static final v4.b Z;
    public static final v4.b f16202a0;
    public static final v4.b f16203b0;
    public static final v4.b f16204c0;
    public double E;
    public Date f16205e;
    public Date f16206f;
    public long h;
    public long f16207n;
    public int f16208r;
    public int f16209s;
    public float f16210w;
    public pc.d f16211x;
    public double f16212y;

    static {
        ze.a aVar = new ze.a(z.class, "TrackHeaderBox.java");
        F = aVar.e(aVar.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        G = aVar.e(aVar.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        O = aVar.e(aVar.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        P = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        Q = aVar.e(aVar.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        R = aVar.e(aVar.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        S = aVar.e(aVar.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        T = aVar.e(aVar.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        U = aVar.e(aVar.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        V = aVar.e(aVar.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        W = aVar.e(aVar.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        X = aVar.e(aVar.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        H = aVar.e(aVar.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        Y = aVar.e(aVar.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        Z = aVar.e(aVar.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        aVar.e(aVar.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        aVar.e(aVar.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        f16202a0 = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        f16203b0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        f16204c0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        aVar.e(aVar.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        I = aVar.e(aVar.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        J = aVar.e(aVar.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        K = aVar.e(aVar.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        L = aVar.e(aVar.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        aVar.e(aVar.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        M = aVar.e(aVar.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        N = aVar.e(aVar.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f16205e = qb.b(h5.b.j(byteBuffer));
            this.f16206f = qb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            long j3 = byteBuffer.getLong();
            this.f16207n = j3;
            if (j3 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f16205e = qb.b(h5.b.i(byteBuffer));
            this.f16206f = qb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            this.f16207n = h5.b.i(byteBuffer);
        }
        h5.b.i(byteBuffer);
        h5.b.i(byteBuffer);
        this.f16208r = h5.b.h(byteBuffer);
        this.f16209s = h5.b.h(byteBuffer);
        this.f16210w = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
        this.f16211x = pc.d.a(byteBuffer);
        this.f16212y = h5.b.f(byteBuffer);
        this.E = h5.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        c0 c10 = ze.a.c(O, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(qb.a(this.f16205e));
            byteBuffer.putLong(qb.a(this.f16206f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f16207n);
        } else {
            byteBuffer.putInt((int) qb.a(this.f16205e));
            byteBuffer.putInt((int) qb.a(this.f16206f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f16207n);
        }
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        h5.b.p(this.f16208r, byteBuffer);
        h5.b.p(this.f16209s, byteBuffer);
        h5.b.o(byteBuffer, this.f16210w);
        h5.b.p(0, byteBuffer);
        this.f16211x.b(byteBuffer);
        h5.b.n(byteBuffer, this.f16212y);
        h5.b.n(byteBuffer, this.E);
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
        c0 b10 = ze.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        c.w(ze.a.b(F, this, this));
        sb2.append(this.f16205e);
        sb2.append(";modificationTime=");
        c.w(ze.a.b(G, this, this));
        sb2.append(this.f16206f);
        sb2.append(";trackId=");
        c.w(ze.a.b(H, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        c.w(ze.a.b(I, this, this));
        sb2.append(this.f16207n);
        sb2.append(";layer=");
        c.w(ze.a.b(J, this, this));
        sb2.append(this.f16208r);
        sb2.append(";alternateGroup=");
        c.w(ze.a.b(K, this, this));
        sb2.append(this.f16209s);
        sb2.append(";volume=");
        c.w(ze.a.b(L, this, this));
        sb2.append(this.f16210w);
        sb2.append(";matrix=");
        sb2.append(this.f16211x);
        sb2.append(";width=");
        c.w(ze.a.b(M, this, this));
        sb2.append(this.f16212y);
        sb2.append(";height=");
        c.w(ze.a.b(N, this, this));
        sb2.append(this.E);
        sb2.append("]");
        return sb2.toString();
    }
}
