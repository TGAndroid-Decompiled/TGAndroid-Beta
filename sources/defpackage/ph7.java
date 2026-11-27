package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
public final class ph7 extends h2 {
    public static final xh4 J;
    public static final xh4 K;
    public static final xh4 L;
    public static final xh4 M;
    public static final xh4 N;
    public static final xh4 O;
    public static final xh4 P;
    public static final xh4 Q;
    public static final xh4 R;
    public static final xh4 S;
    public static final xh4 T;
    public static final xh4 U;
    public static final xh4 V;
    public static final xh4 W;
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
    public ol6 w;
    public long x;
    public int y;

    static {
        u84 u84Var = new u84(ph7.class, "MovieHeaderBox.java");
        J = u84Var.e(u84Var.d("getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        K = u84Var.e(u84Var.d("getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.util.Date"));
        S = u84Var.e(u84Var.d("setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "void"));
        T = u84Var.e(u84Var.d("setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "void"));
        U = u84Var.e(u84Var.d("setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "void"));
        u84Var.e(u84Var.d("setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "void"));
        u84Var.e(u84Var.d("setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "void"));
        V = u84Var.e(u84Var.d("setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        W = u84Var.e(u84Var.d("setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "void"));
        u84Var.e(u84Var.d("getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        u84Var.e(u84Var.d("setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "void"));
        u84Var.e(u84Var.d("getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        L = u84Var.e(u84Var.d("getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        u84Var.e(u84Var.d("setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "void"));
        u84Var.e(u84Var.d("getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        u84Var.e(u84Var.d("setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "void"));
        u84Var.e(u84Var.d("getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        u84Var.e(u84Var.d("setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "void"));
        u84Var.e(u84Var.d("getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        u84Var.e(u84Var.d("setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "void"));
        u84Var.e(u84Var.d("getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "int"));
        u84Var.e(u84Var.d("setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "void"));
        M = u84Var.e(u84Var.d("getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        N = u84Var.e(u84Var.d("getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "double"));
        O = u84Var.e(u84Var.d("getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "float"));
        u84Var.e(u84Var.d("getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        P = u84Var.e(u84Var.d("getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "long"));
        Q = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "java.lang.String"));
        R = u84Var.e(u84Var.d("setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = ehe.b(zpe.h(byteBuffer));
            this.f = ehe.b(zpe.h(byteBuffer));
            this.h = zpe.g(byteBuffer);
            this.n = zpe.h(byteBuffer);
        } else {
            this.e = ehe.b(zpe.g(byteBuffer));
            this.f = ehe.b(zpe.g(byteBuffer));
            this.h = zpe.g(byteBuffer);
            this.n = zpe.g(byteBuffer);
        }
        this.r = zpe.d(byteBuffer);
        this.s = zpe.e(byteBuffer);
        zpe.f(byteBuffer);
        zpe.g(byteBuffer);
        zpe.g(byteBuffer);
        this.w = ol6.a(byteBuffer);
        this.y = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.H = byteBuffer.getInt();
        this.I = byteBuffer.getInt();
        this.x = zpe.g(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(ehe.a(date));
            byteBuffer.putLong(ehe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) ehe.a(date));
            byteBuffer.putInt((int) ehe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) this.n);
        }
        aqe.b(byteBuffer, this.r);
        aqe.c(byteBuffer, this.s);
        aqe.d(0, byteBuffer);
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
        lyc b = u84.b(Q, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        bp1.r(u84.b(J, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        bp1.r(u84.b(K, this, this));
        sb.append(this.f);
        sb.append(";timescale=");
        bp1.r(u84.b(L, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        bp1.r(u84.b(M, this, this));
        sb.append(this.n);
        sb.append(";rate=");
        bp1.r(u84.b(N, this, this));
        sb.append(this.r);
        sb.append(";volume=");
        bp1.r(u84.b(O, this, this));
        sb.append(this.s);
        sb.append(";matrix=");
        sb.append(this.w);
        sb.append(";nextTrackId=");
        bp1.r(u84.b(P, this, this));
        return qu6.p(sb, this.x, "]");
    }
}
