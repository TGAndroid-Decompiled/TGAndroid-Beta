package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
public final class jh7 extends g2 {
    public static final ai4 J;
    public static final ai4 K;
    public static final ai4 L;
    public static final ai4 M;
    public static final ai4 N;
    public static final ai4 O;
    public static final ai4 P;
    public static final ai4 Q;
    public static final ai4 R;
    public static final ai4 S;
    public static final ai4 T;
    public static final ai4 U;
    public static final ai4 V;
    public static final ai4 W;
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
    public ml6 w;
    public long x;
    public int y;

    static {
        i94 i94Var = new i94(jh7.class, "MovieHeaderBox.java");
        J = i94Var.e(i94Var.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        K = i94Var.e(i94Var.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        S = i94Var.e(i94Var.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        T = i94Var.e(i94Var.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        U = i94Var.e(i94Var.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        i94Var.e(i94Var.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        i94Var.e(i94Var.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        V = i94Var.e(i94Var.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        W = i94Var.e(i94Var.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        i94Var.e(i94Var.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        i94Var.e(i94Var.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        i94Var.e(i94Var.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        L = i94Var.e(i94Var.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        i94Var.e(i94Var.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        i94Var.e(i94Var.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        i94Var.e(i94Var.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        i94Var.e(i94Var.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        i94Var.e(i94Var.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        i94Var.e(i94Var.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        i94Var.e(i94Var.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        i94Var.e(i94Var.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        i94Var.e(i94Var.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        M = i94Var.e(i94Var.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        N = i94Var.e(i94Var.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        O = i94Var.e(i94Var.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        i94Var.e(i94Var.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        P = i94Var.e(i94Var.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        Q = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        R = i94Var.e(i94Var.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = oee.b(jne.h(byteBuffer));
            this.f = oee.b(jne.h(byteBuffer));
            this.h = jne.g(byteBuffer);
            this.n = jne.h(byteBuffer);
        } else {
            this.e = oee.b(jne.g(byteBuffer));
            this.f = oee.b(jne.g(byteBuffer));
            this.h = jne.g(byteBuffer);
            this.n = jne.g(byteBuffer);
        }
        this.r = jne.d(byteBuffer);
        this.s = jne.e(byteBuffer);
        jne.f(byteBuffer);
        jne.g(byteBuffer);
        jne.g(byteBuffer);
        this.w = ml6.a(byteBuffer);
        this.y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.I = byteBuffer.getInt();
        this.x = jne.g(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(oee.a(date));
            byteBuffer.putLong(oee.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) oee.a(date));
            byteBuffer.putInt((int) oee.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        kne.b(byteBuffer, this.r);
        kne.c(byteBuffer, this.s);
        kne.d(0, byteBuffer);
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
        xvc b = i94.b(Q, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        aq1.r(i94.b(J, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        aq1.r(i94.b(K, this, this));
        sb.append(this.f);
        sb.append(";timescale=");
        aq1.r(i94.b(L, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        aq1.r(i94.b(M, this, this));
        sb.append(this.n);
        sb.append(";rate=");
        aq1.r(i94.b(N, this, this));
        sb.append(this.r);
        sb.append(";volume=");
        aq1.r(i94.b(O, this, this));
        sb.append(this.s);
        sb.append(";matrix=");
        sb.append(this.w);
        sb.append(";nextTrackId=");
        aq1.r(i94.b(P, this, this));
        return kt6.q(sb, this.x, "]");
    }
}
