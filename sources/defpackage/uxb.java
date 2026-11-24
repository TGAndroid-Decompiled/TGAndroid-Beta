package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
public final class uxb extends g2 {
    public static final z24 F;
    public static final z24 G;
    public static final z24 H;
    public static final z24 I;
    public static final z24 J;
    public static final z24 K;
    public static final z24 L;
    public static final z24 M;
    public static final z24 N;
    public static final z24 O;
    public static final z24 P;
    public static final z24 Q;
    public static final z24 R;
    public static final z24 S;
    public static final z24 T;
    public static final z24 U;
    public static final z24 V;
    public static final z24 W;
    public static final z24 X;
    public static final z24 Y;
    public static final z24 Z;
    public static final z24 a0;
    public static final z24 b0;
    public static final z24 c0;
    public double E;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float w;
    public jj6 x;
    public double y;

    static {
        z74 z74Var = new z74(uxb.class, "TrackHeaderBox.java");
        F = z74Var.e(z74Var.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        G = z74Var.e(z74Var.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        O = z74Var.e(z74Var.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        P = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        Q = z74Var.e(z74Var.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        R = z74Var.e(z74Var.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        S = z74Var.e(z74Var.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        T = z74Var.e(z74Var.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        U = z74Var.e(z74Var.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        V = z74Var.e(z74Var.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        W = z74Var.e(z74Var.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        X = z74Var.e(z74Var.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        H = z74Var.e(z74Var.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        Y = z74Var.e(z74Var.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        Z = z74Var.e(z74Var.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        z74Var.e(z74Var.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        z74Var.e(z74Var.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        z74Var.e(z74Var.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        z74Var.e(z74Var.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        a0 = z74Var.e(z74Var.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        b0 = z74Var.e(z74Var.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        c0 = z74Var.e(z74Var.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        z74Var.e(z74Var.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        I = z74Var.e(z74Var.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        J = z74Var.e(z74Var.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        K = z74Var.e(z74Var.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        L = z74Var.e(z74Var.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        z74Var.e(z74Var.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        M = z74Var.e(z74Var.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        N = z74Var.e(z74Var.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = nce.b(hle.h(byteBuffer));
            this.f = nce.b(hle.h(byteBuffer));
            this.h = hle.g(byteBuffer);
            hle.g(byteBuffer);
            long j = byteBuffer.getLong();
            this.n = j;
            if (j < -1) {
                wn4.j("The tracks duration is bigger than Long.MAX_VALUE");
                return;
            }
        } else {
            this.e = nce.b(hle.g(byteBuffer));
            this.f = nce.b(hle.g(byteBuffer));
            this.h = hle.g(byteBuffer);
            hle.g(byteBuffer);
            this.n = hle.g(byteBuffer);
        }
        hle.g(byteBuffer);
        hle.g(byteBuffer);
        this.r = hle.f(byteBuffer);
        this.s = hle.f(byteBuffer);
        this.w = hle.e(byteBuffer);
        hle.f(byteBuffer);
        this.x = jj6.a(byteBuffer);
        this.y = hle.d(byteBuffer);
        this.E = hle.d(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        c5a c = z74.c(O, this, this, byteBuffer);
        n89.a().getClass();
        n89.b(c);
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(nce.a(date));
            byteBuffer.putLong(nce.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt(0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) nce.a(date));
            byteBuffer.putInt((int) nce.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt(0);
            byteBuffer.putInt((int) this.n);
        }
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        ile.d(this.r, byteBuffer);
        ile.d(this.s, byteBuffer);
        ile.c(byteBuffer, this.w);
        ile.d(0, byteBuffer);
        this.x.b(byteBuffer);
        ile.b(byteBuffer, this.y);
        ile.b(byteBuffer, this.E);
    }

    @Override
    public final long getContentSize() {
        long j;
        if (e() == 1) {
            j = 36;
        } else {
            j = 24;
        }
        return j + 60;
    }

    public final String toString() {
        c5a b = z74.b(P, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder("TrackHeaderBox[creationTime=");
        oo1.r(z74.b(F, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        oo1.r(z74.b(G, this, this));
        sb.append(this.f);
        sb.append(";trackId=");
        oo1.r(z74.b(H, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        oo1.r(z74.b(I, this, this));
        sb.append(this.n);
        sb.append(";layer=");
        oo1.r(z74.b(J, this, this));
        sb.append(this.r);
        sb.append(";alternateGroup=");
        oo1.r(z74.b(K, this, this));
        sb.append(this.s);
        sb.append(";volume=");
        oo1.r(z74.b(L, this, this));
        sb.append(this.w);
        sb.append(";matrix=");
        sb.append(this.x);
        sb.append(";width=");
        oo1.r(z74.b(M, this, this));
        sb.append(this.y);
        sb.append(";height=");
        oo1.r(z74.b(N, this, this));
        sb.append(this.E);
        sb.append("]");
        return sb.toString();
    }
}
