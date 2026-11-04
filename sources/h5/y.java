package h5;

import b8.fe;
import java.nio.ByteBuffer;
import java.util.Date;
import org.telegram.ui.Components.i9;
public final class y extends com.googlecode.mp4parser.c {
    public static final i9 F;
    public static final i9 G;
    public static final i9 H;
    public static final i9 I;
    public static final i9 J;
    public static final i9 K;
    public static final i9 L;
    public static final i9 M;
    public static final i9 N;
    public static final i9 O;
    public static final i9 P;
    public static final i9 Q;
    public static final i9 R;
    public static final i9 S;
    public static final i9 T;
    public static final i9 U;
    public static final i9 V;
    public static final i9 W;
    public static final i9 X;
    public static final i9 Y;
    public static final i9 Z;
    public static final i9 f14293a0;
    public static final i9 f14294b0;
    public static final i9 f14295c0;
    public double E;
    public Date f14296e;
    public Date f14297f;
    public long h;
    public long f14298n;
    public int f14299r;
    public int f14300s;
    public float f14301w;
    public mc.d f14302x;
    public double f14303y;

    static {
        we.a aVar = new we.a(y.class, "TrackHeaderBox.java");
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
        f14293a0 = aVar.e(aVar.d("setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "void"));
        f14294b0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        f14295c0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
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
            this.f14296e = fe.b(g5.b.j(byteBuffer));
            this.f14297f = fe.b(g5.b.j(byteBuffer));
            this.h = g5.b.i(byteBuffer);
            g5.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.f14298n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f14296e = fe.b(g5.b.i(byteBuffer));
            this.f14297f = fe.b(g5.b.i(byteBuffer));
            this.h = g5.b.i(byteBuffer);
            g5.b.i(byteBuffer);
            this.f14298n = g5.b.i(byteBuffer);
        }
        g5.b.i(byteBuffer);
        g5.b.i(byteBuffer);
        this.f14299r = g5.b.h(byteBuffer);
        this.f14300s = g5.b.h(byteBuffer);
        this.f14301w = g5.b.g(byteBuffer);
        g5.b.h(byteBuffer);
        this.f14302x = mc.d.a(byteBuffer);
        this.f14303y = g5.b.f(byteBuffer);
        this.E = g5.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        ui.f c2 = we.a.c(O, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c2);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(fe.a(this.f14296e));
            byteBuffer.putLong(fe.a(this.f14297f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f14298n);
        } else {
            byteBuffer.putInt((int) fe.a(this.f14296e));
            byteBuffer.putInt((int) fe.a(this.f14297f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f14298n);
        }
        int i3 = (int) 0;
        byteBuffer.putInt(i3);
        byteBuffer.putInt(i3);
        g5.b.p(this.f14299r, byteBuffer);
        g5.b.p(this.f14300s, byteBuffer);
        g5.b.o(byteBuffer, this.f14301w);
        g5.b.p(0, byteBuffer);
        this.f14302x.b(byteBuffer);
        g5.b.n(byteBuffer, this.f14303y);
        g5.b.n(byteBuffer, this.E);
    }

    @Override
    public final long getContentSize() {
        long j10;
        if (e() == 1) {
            j10 = 36;
        } else {
            j10 = 24;
        }
        return j10 + 60;
    }

    public final String toString() {
        ui.f b10 = we.a.b(P, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        com.google.android.recaptcha.internal.a.t(we.a.b(F, this, this));
        sb2.append(this.f14296e);
        sb2.append(";modificationTime=");
        com.google.android.recaptcha.internal.a.t(we.a.b(G, this, this));
        sb2.append(this.f14297f);
        sb2.append(";trackId=");
        com.google.android.recaptcha.internal.a.t(we.a.b(H, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        com.google.android.recaptcha.internal.a.t(we.a.b(I, this, this));
        sb2.append(this.f14298n);
        sb2.append(";layer=");
        com.google.android.recaptcha.internal.a.t(we.a.b(J, this, this));
        sb2.append(this.f14299r);
        sb2.append(";alternateGroup=");
        com.google.android.recaptcha.internal.a.t(we.a.b(K, this, this));
        sb2.append(this.f14300s);
        sb2.append(";volume=");
        com.google.android.recaptcha.internal.a.t(we.a.b(L, this, this));
        sb2.append(this.f14301w);
        sb2.append(";matrix=");
        sb2.append(this.f14302x);
        sb2.append(";width=");
        com.google.android.recaptcha.internal.a.t(we.a.b(M, this, this));
        sb2.append(this.f14303y);
        sb2.append(";height=");
        com.google.android.recaptcha.internal.a.t(we.a.b(N, this, this));
        sb2.append(this.E);
        sb2.append("]");
        return sb2.toString();
    }
}
