package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
public final class wzb extends g2 {
    public static final ai4 F;
    public static final ai4 G;
    public static final ai4 H;
    public static final ai4 I;
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
    public static final ai4 X;
    public static final ai4 Y;
    public static final ai4 Z;
    public static final ai4 a0;
    public static final ai4 b0;
    public static final ai4 c0;
    public double E;
    public Date e;
    public Date f;
    public long h;
    public long n;
    public int r;
    public int s;
    public float w;
    public ml6 x;
    public double y;

    static {
        i94 i94Var = new i94(wzb.class, "TrackHeaderBox.java");
        F = i94Var.e(i94Var.d("getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        G = i94Var.e(i94Var.d("getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.util.Date"));
        O = i94Var.e(i94Var.d("getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        P = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "java.lang.String"));
        Q = i94Var.e(i94Var.d("setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "void"));
        R = i94Var.e(i94Var.d("setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "void"));
        S = i94Var.e(i94Var.d("setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "void"));
        T = i94Var.e(i94Var.d("setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "void"));
        U = i94Var.e(i94Var.d("setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "void"));
        V = i94Var.e(i94Var.d("setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "void"));
        W = i94Var.e(i94Var.d("setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "void"));
        X = i94Var.e(i94Var.d("setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "void"));
        H = i94Var.e(i94Var.d("getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        Y = i94Var.e(i94Var.d("setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "void"));
        Z = i94Var.e(i94Var.d("setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "void"));
        i94Var.e(i94Var.d("isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        i94Var.e(i94Var.d("isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        i94Var.e(i94Var.d("isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        i94Var.e(i94Var.d("isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "boolean"));
        a0 = i94Var.e(i94Var.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        b0 = i94Var.e(i94Var.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        c0 = i94Var.e(i94Var.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
        i94Var.e(i94Var.d("setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "void"));
        I = i94Var.e(i94Var.d("getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "long"));
        J = i94Var.e(i94Var.d("getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        K = i94Var.e(i94Var.d("getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "int"));
        L = i94Var.e(i94Var.d("getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "float"));
        i94Var.e(i94Var.d("getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "com.googlecode.mp4parser.util.Matrix"));
        M = i94Var.e(i94Var.d("getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
        N = i94Var.e(i94Var.d("getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "double"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.e = oee.b(jne.h(byteBuffer));
            this.f = oee.b(jne.h(byteBuffer));
            this.h = jne.g(byteBuffer);
            jne.g(byteBuffer);
            long j = byteBuffer.getLong();
            this.n = j;
            if (j < -1) {
                zo4.k("The tracks duration is bigger than Long.MAX_VALUE");
                return;
            }
        } else {
            this.e = oee.b(jne.g(byteBuffer));
            this.f = oee.b(jne.g(byteBuffer));
            this.h = jne.g(byteBuffer);
            jne.g(byteBuffer);
            this.n = jne.g(byteBuffer);
        }
        jne.g(byteBuffer);
        jne.g(byteBuffer);
        this.r = jne.f(byteBuffer);
        this.s = jne.f(byteBuffer);
        this.w = jne.e(byteBuffer);
        jne.f(byteBuffer);
        this.x = ml6.a(byteBuffer);
        this.y = jne.d(byteBuffer);
        this.E = jne.d(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        xvc c = i94.c(O, this, this, byteBuffer);
        pa9.a().getClass();
        pa9.b(c);
        i(byteBuffer);
        int e = e();
        Date date = this.e;
        if (e == 1) {
            byteBuffer.putLong(oee.a(date));
            byteBuffer.putLong(oee.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt(0);
            byteBuffer.putLong(this.n);
        } else {
            byteBuffer.putInt((int) oee.a(date));
            byteBuffer.putInt((int) oee.a(this.f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt(0);
            byteBuffer.putInt((int) this.n);
        }
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        kne.d(this.r, byteBuffer);
        kne.d(this.s, byteBuffer);
        kne.c(byteBuffer, this.w);
        kne.d(0, byteBuffer);
        this.x.b(byteBuffer);
        kne.b(byteBuffer, this.y);
        kne.b(byteBuffer, this.E);
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
        xvc b = i94.b(P, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("TrackHeaderBox[creationTime=");
        aq1.r(i94.b(F, this, this));
        sb.append(this.e);
        sb.append(";modificationTime=");
        aq1.r(i94.b(G, this, this));
        sb.append(this.f);
        sb.append(";trackId=");
        aq1.r(i94.b(H, this, this));
        sb.append(this.h);
        sb.append(";duration=");
        aq1.r(i94.b(I, this, this));
        sb.append(this.n);
        sb.append(";layer=");
        aq1.r(i94.b(J, this, this));
        sb.append(this.r);
        sb.append(";alternateGroup=");
        aq1.r(i94.b(K, this, this));
        sb.append(this.s);
        sb.append(";volume=");
        aq1.r(i94.b(L, this, this));
        sb.append(this.w);
        sb.append(";matrix=");
        sb.append(this.x);
        sb.append(";width=");
        aq1.r(i94.b(M, this, this));
        sb.append(this.y);
        sb.append(";height=");
        aq1.r(i94.b(N, this, this));
        sb.append(this.E);
        sb.append("]");
        return sb.toString();
    }
}
