package i5;

import ab.c0;
import c8.mb;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Components.ff;
public final class z extends com.googlecode.mp4parser.c {
    public static final ff F;
    public static final ff G;
    public static final ff H;
    public static final ff I;
    public static final ff J;
    public static final ff K;
    public static final ff L;
    public static final ff M;
    public static final ff N;
    public static final ff O;
    public static final ff P;
    public static final ff Q;
    public static final ff R;
    public static final ff S;
    public static final ff T;
    public static final ff U;
    public static final ff V;
    public static final ff W;
    public static final ff X;
    public static final ff Y;
    public static final ff Z;
    public static final ff f15798a0;
    public static final ff f15799b0;
    public static final ff f15800c0;
    public double E;
    public Date f15801e;
    public Date f15802f;
    public long h;
    public long f15803n;
    public int f15804r;
    public int f15805s;
    public float f15806w;
    public pc.d f15807x;
    public double f15808y;

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
        f15798a0 = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        f15799b0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        f15800c0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
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
            this.f15801e = mb.b(h5.b.j(byteBuffer));
            this.f15802f = mb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            long j3 = byteBuffer.getLong();
            this.f15803n = j3;
            if (j3 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f15801e = mb.b(h5.b.i(byteBuffer));
            this.f15802f = mb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            this.f15803n = h5.b.i(byteBuffer);
        }
        h5.b.i(byteBuffer);
        h5.b.i(byteBuffer);
        this.f15804r = h5.b.h(byteBuffer);
        this.f15805s = h5.b.h(byteBuffer);
        this.f15806w = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
        this.f15807x = pc.d.a(byteBuffer);
        this.f15808y = h5.b.f(byteBuffer);
        this.E = h5.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        c0 c10 = ze.a.c(O, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(mb.a(this.f15801e));
            byteBuffer.putLong(mb.a(this.f15802f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f15803n);
        } else {
            byteBuffer.putInt((int) mb.a(this.f15801e));
            byteBuffer.putInt((int) mb.a(this.f15802f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f15803n);
        }
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        h5.b.p(this.f15804r, byteBuffer);
        h5.b.p(this.f15805s, byteBuffer);
        h5.b.o(byteBuffer, this.f15806w);
        h5.b.p(0, byteBuffer);
        this.f15807x.b(byteBuffer);
        h5.b.n(byteBuffer, this.f15808y);
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
        c.u(ze.a.b(F, this, this));
        sb2.append(this.f15801e);
        sb2.append(";modificationTime=");
        c.u(ze.a.b(G, this, this));
        sb2.append(this.f15802f);
        sb2.append(";trackId=");
        c.u(ze.a.b(H, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        c.u(ze.a.b(I, this, this));
        sb2.append(this.f15803n);
        sb2.append(";layer=");
        c.u(ze.a.b(J, this, this));
        sb2.append(this.f15804r);
        sb2.append(";alternateGroup=");
        c.u(ze.a.b(K, this, this));
        sb2.append(this.f15805s);
        sb2.append(";volume=");
        c.u(ze.a.b(L, this, this));
        sb2.append(this.f15806w);
        sb2.append(";matrix=");
        sb2.append(this.f15807x);
        sb2.append(";width=");
        c.u(ze.a.b(M, this, this));
        sb2.append(this.f15808y);
        sb2.append(";height=");
        c.u(ze.a.b(N, this, this));
        sb2.append(this.E);
        sb2.append("]");
        return sb2.toString();
    }
}
