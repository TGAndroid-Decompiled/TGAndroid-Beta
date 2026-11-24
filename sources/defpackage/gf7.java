package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
public final class gf7 extends g2 {
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
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public double r;
    public float s;
    public jj6 w;
    public long x;
    public int y;

    static {
        z74 z74Var = new z74(gf7.class, "MovieHeaderBox.java");
        J = z74Var.e(z74Var.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        K = z74Var.e(z74Var.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        S = z74Var.e(z74Var.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        T = z74Var.e(z74Var.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        U = z74Var.e(z74Var.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        z74Var.e(z74Var.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        z74Var.e(z74Var.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        V = z74Var.e(z74Var.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        W = z74Var.e(z74Var.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        z74Var.e(z74Var.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        z74Var.e(z74Var.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        z74Var.e(z74Var.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        L = z74Var.e(z74Var.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        z74Var.e(z74Var.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        z74Var.e(z74Var.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        z74Var.e(z74Var.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        z74Var.e(z74Var.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        z74Var.e(z74Var.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        z74Var.e(z74Var.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        z74Var.e(z74Var.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        z74Var.e(z74Var.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        z74Var.e(z74Var.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        M = z74Var.e(z74Var.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        N = z74Var.e(z74Var.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        O = z74Var.e(z74Var.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        z74Var.e(z74Var.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        P = z74Var.e(z74Var.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        Q = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        R = z74Var.e(z74Var.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = nce.b(hle.h(byteBuffer));
            this.f = nce.b(hle.h(byteBuffer));
            this.h = hle.g(byteBuffer);
            this.n = hle.h(byteBuffer);
        } else {
            this.e = nce.b(hle.g(byteBuffer));
            this.f = nce.b(hle.g(byteBuffer));
            this.h = hle.g(byteBuffer);
            this.n = hle.g(byteBuffer);
        }
        this.r = hle.d(byteBuffer);
        this.s = hle.e(byteBuffer);
        hle.f(byteBuffer);
        hle.g(byteBuffer);
        hle.g(byteBuffer);
        this.w = jj6.a(byteBuffer);
        this.y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.I = byteBuffer.getInt();
        this.x = hle.g(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(nce.a(date));
            byteBuffer.putLong(nce.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) nce.a(date));
            byteBuffer.putInt((int) nce.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        ile.b(byteBuffer, this.r);
        ile.c(byteBuffer, this.s);
        ile.d(0, byteBuffer);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        this.w.b(byteBuffer);
        byteBuffer.putInt(this.y);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        byteBuffer.putInt(this.H);
        byteBuffer.putInt(this.I);
        byteBuffer.putInt((int) this.x);
    }

    @Override
    public final long getContentSize() {
        long j;
        if (e() == 1) {
            j = 32;
        } else {
            j = 20;
        }
        return j + 80;
    }

    public final String toString() {
        c5a b = z74.b(Q, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        oo1.r(z74.b(J, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        oo1.r(z74.b(K, this, this));
        sb.append(this.f);
        sb.append(";timescale=");
        oo1.r(z74.b(L, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        oo1.r(z74.b(M, this, this));
        sb.append(this.n);
        sb.append(";rate=");
        oo1.r(z74.b(N, this, this));
        sb.append(this.r);
        sb.append(";volume=");
        oo1.r(z74.b(O, this, this));
        sb.append(this.s);
        sb.append(";matrix=");
        sb.append(this.w);
        sb.append(";nextTrackId=");
        oo1.r(z74.b(P, this, this));
        return ls6.p(sb, this.x, "]");
    }
}
