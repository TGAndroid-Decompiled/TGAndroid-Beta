package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
public final class v1c extends h2 {
    public static final xh4 F;
    public static final xh4 G;
    public static final xh4 H;
    public static final xh4 I;
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
    public static final xh4 X;
    public static final xh4 Y;
    public static final xh4 Z;
    public static final xh4 a0;
    public static final xh4 b0;
    public static final xh4 c0;
    public double E;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float w;
    public ol6 x;
    public double y;

    static {
        u84 u84Var = new u84(v1c.class, "TrackHeaderBox.java");
        F = u84Var.e(u84Var.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        G = u84Var.e(u84Var.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        O = u84Var.e(u84Var.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        P = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        Q = u84Var.e(u84Var.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        R = u84Var.e(u84Var.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        S = u84Var.e(u84Var.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        T = u84Var.e(u84Var.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        U = u84Var.e(u84Var.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        V = u84Var.e(u84Var.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        W = u84Var.e(u84Var.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        X = u84Var.e(u84Var.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        H = u84Var.e(u84Var.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        Y = u84Var.e(u84Var.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        Z = u84Var.e(u84Var.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        u84Var.e(u84Var.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        u84Var.e(u84Var.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        u84Var.e(u84Var.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        u84Var.e(u84Var.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        a0 = u84Var.e(u84Var.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        b0 = u84Var.e(u84Var.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        c0 = u84Var.e(u84Var.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        u84Var.e(u84Var.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        I = u84Var.e(u84Var.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        J = u84Var.e(u84Var.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        K = u84Var.e(u84Var.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        L = u84Var.e(u84Var.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        u84Var.e(u84Var.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        M = u84Var.e(u84Var.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        N = u84Var.e(u84Var.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = ehe.b(zpe.h(byteBuffer));
            this.f = ehe.b(zpe.h(byteBuffer));
            this.h = zpe.g(byteBuffer);
            zpe.g(byteBuffer);
            long j = byteBuffer.getLong();
            this.n = j;
            if (j < -1) {
                xi4.l("The tracks duration is bigger than Long.MAX_VALUE");
                return;
            }
        } else {
            this.e = ehe.b(zpe.g(byteBuffer));
            this.f = ehe.b(zpe.g(byteBuffer));
            this.h = zpe.g(byteBuffer);
            zpe.g(byteBuffer);
            this.n = zpe.g(byteBuffer);
        }
        zpe.g(byteBuffer);
        zpe.g(byteBuffer);
        this.r = zpe.f(byteBuffer);
        this.s = zpe.f(byteBuffer);
        this.w = zpe.e(byteBuffer);
        zpe.f(byteBuffer);
        this.x = ol6.a(byteBuffer);
        this.y = zpe.d(byteBuffer);
        this.E = zpe.d(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        lyc c = u84.c(O, this, this, byteBuffer);
        zb9.a().getClass();
        zb9.b(c);
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(ehe.a(date));
            byteBuffer.putLong(ehe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt(0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) ehe.a(date));
            byteBuffer.putInt((int) ehe.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt(0);
            byteBuffer.putInt((int) this.n);
        }
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        aqe.d(this.r, byteBuffer);
        aqe.d(this.s, byteBuffer);
        aqe.c(byteBuffer, this.w);
        aqe.d(0, byteBuffer);
        this.x.b(byteBuffer);
        aqe.b(byteBuffer, this.y);
        aqe.b(byteBuffer, this.E);
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
        lyc b = u84.b(P, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder("TrackHeaderBox[creationTime=");
        bp1.r(u84.b(F, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        bp1.r(u84.b(G, this, this));
        sb.append(this.f);
        sb.append(";trackId=");
        bp1.r(u84.b(H, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        bp1.r(u84.b(I, this, this));
        sb.append(this.n);
        sb.append(";layer=");
        bp1.r(u84.b(J, this, this));
        sb.append(this.r);
        sb.append(";alternateGroup=");
        bp1.r(u84.b(K, this, this));
        sb.append(this.s);
        sb.append(";volume=");
        bp1.r(u84.b(L, this, this));
        sb.append(this.w);
        sb.append(";matrix=");
        sb.append(this.x);
        sb.append(";width=");
        bp1.r(u84.b(M, this, this));
        sb.append(this.y);
        sb.append(";height=");
        bp1.r(u84.b(N, this, this));
        sb.append(this.E);
        sb.append("]");
        return sb.toString();
    }
}
