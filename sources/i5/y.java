package i5;

import c8.jb;
import java.nio.ByteBuffer;
import java.util.Date;
import y7.i6;
public final class y extends com.googlecode.mp4parser.c {
    public static final i6 E;
    public static final i6 F;
    public static final i6 G;
    public static final i6 H;
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
    public static final i6 W;
    public static final i6 X;
    public static final i6 Y;
    public static final i6 Z;
    public static final i6 f15337a0;
    public static final i6 f15338b0;
    public double D;
    public Date f15339e;
    public Date f15340f;
    public long h;
    public long f15341n;
    public int f15342r;
    public int f15343s;
    public float f15344w;
    public pc.d f15345x;
    public double f15346y;

    static {
        ze.a aVar = new ze.a(y.class, "TrackHeaderBox.java");
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
        f15337a0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        f15338b0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
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
            this.f15339e = jb.b(h5.b.j(byteBuffer));
            this.f15340f = jb.b(h5.b.j(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            long j3 = byteBuffer.getLong();
            this.f15341n = j3;
            if (j3 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f15339e = jb.b(h5.b.i(byteBuffer));
            this.f15340f = jb.b(h5.b.i(byteBuffer));
            this.h = h5.b.i(byteBuffer);
            h5.b.i(byteBuffer);
            this.f15341n = h5.b.i(byteBuffer);
        }
        h5.b.i(byteBuffer);
        h5.b.i(byteBuffer);
        this.f15342r = h5.b.h(byteBuffer);
        this.f15343s = h5.b.h(byteBuffer);
        this.f15344w = h5.b.g(byteBuffer);
        h5.b.h(byteBuffer);
        this.f15345x = pc.d.a(byteBuffer);
        this.f15346y = h5.b.f(byteBuffer);
        this.D = h5.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        ui.e c10 = ze.a.c(N, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(jb.a(this.f15339e));
            byteBuffer.putLong(jb.a(this.f15340f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f15341n);
        } else {
            byteBuffer.putInt((int) jb.a(this.f15339e));
            byteBuffer.putInt((int) jb.a(this.f15340f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f15341n);
        }
        int i7 = (int) 0;
        byteBuffer.putInt(i7);
        byteBuffer.putInt(i7);
        h5.b.p(this.f15342r, byteBuffer);
        h5.b.p(this.f15343s, byteBuffer);
        h5.b.o(byteBuffer, this.f15344w);
        h5.b.p(0, byteBuffer);
        this.f15345x.b(byteBuffer);
        h5.b.n(byteBuffer, this.f15346y);
        h5.b.n(byteBuffer, this.D);
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
        ui.e b10 = ze.a.b(O, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(E, this, this));
        sb2.append(this.f15339e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(F, this, this));
        sb2.append(this.f15340f);
        sb2.append(";trackId=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(H, this, this));
        sb2.append(this.f15341n);
        sb2.append(";layer=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(I, this, this));
        sb2.append(this.f15342r);
        sb2.append(";alternateGroup=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(J, this, this));
        sb2.append(this.f15343s);
        sb2.append(";volume=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(K, this, this));
        sb2.append(this.f15344w);
        sb2.append(";matrix=");
        sb2.append(this.f15345x);
        sb2.append(";width=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(L, this, this));
        sb2.append(this.f15346y);
        sb2.append(";height=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(M, this, this));
        sb2.append(this.D);
        sb2.append("]");
        return sb2.toString();
    }
}
