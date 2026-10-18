package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import java.util.Date;
import w7.f7;
public final class y extends com.googlecode.mp4parser.c {
    public static final le.b E;
    public static final le.b F;
    public static final le.b G;
    public static final le.b H;
    public static final le.b I;
    public static final le.b J;
    public static final le.b K;
    public static final le.b L;
    public static final le.b M;
    public static final le.b N;
    public static final le.b O;
    public static final le.b P;
    public static final le.b Q;
    public static final le.b R;
    public static final le.b S;
    public static final le.b T;
    public static final le.b U;
    public static final le.b V;
    public static final le.b W;
    public static final le.b X;
    public static final le.b Y;
    public static final le.b Z;
    public static final le.b f10451a0;
    public static final le.b f10452b0;
    public Date e;
    public Date f10453f;
    public long h;
    public long f10454n;
    public int f10455r;
    public int f10456s;
    public float v;
    public rc.d f10457w;
    public double f10458x;
    public double f10459y;

    static {
        te.a aVar = new te.a(y.class, "TrackHeaderBox.java");
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
        f10451a0 = aVar.e(aVar.d("setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "void"));
        f10452b0 = aVar.e(aVar.d("setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "void"));
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
            this.e = f7.b(e5.b.j(byteBuffer));
            this.f10453f = f7.b(e5.b.j(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            e5.b.i(byteBuffer);
            long j10 = byteBuffer.getLong();
            this.f10454n = j10;
            if (j10 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.e = f7.b(e5.b.i(byteBuffer));
            this.f10453f = f7.b(e5.b.i(byteBuffer));
            this.h = e5.b.i(byteBuffer);
            e5.b.i(byteBuffer);
            this.f10454n = e5.b.i(byteBuffer);
        }
        e5.b.i(byteBuffer);
        e5.b.i(byteBuffer);
        this.f10455r = e5.b.h(byteBuffer);
        this.f10456s = e5.b.h(byteBuffer);
        this.v = e5.b.g(byteBuffer);
        e5.b.h(byteBuffer);
        this.f10457w = rc.d.a(byteBuffer);
        this.f10458x = e5.b.f(byteBuffer);
        this.f10459y = e5.b.f(byteBuffer);
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.firebase.messaging.r c10 = te.a.c(N, this, this, byteBuffer);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        i(byteBuffer);
        if (e() == 1) {
            byteBuffer.putLong(f7.a(this.e));
            byteBuffer.putLong(f7.a(this.f10453f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.f10454n);
        } else {
            byteBuffer.putInt((int) f7.a(this.e));
            byteBuffer.putInt((int) f7.a(this.f10453f));
            byteBuffer.putInt((int) this.h);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.f10454n);
        }
        int i10 = (int) 0;
        byteBuffer.putInt(i10);
        byteBuffer.putInt(i10);
        e5.b.p(this.f10455r, byteBuffer);
        e5.b.p(this.f10456s, byteBuffer);
        e5.b.o(byteBuffer, this.v);
        e5.b.p(0, byteBuffer);
        this.f10457w.b(byteBuffer);
        e5.b.n(byteBuffer, this.f10458x);
        e5.b.n(byteBuffer, this.f10459y);
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
        com.google.firebase.messaging.r b10 = te.a.b(O, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("TrackHeaderBox[creationTime=");
        k3.p(te.a.b(E, this, this));
        sb2.append(this.e);
        sb2.append(";modificationTime=");
        k3.p(te.a.b(F, this, this));
        sb2.append(this.f10453f);
        sb2.append(";trackId=");
        k3.p(te.a.b(G, this, this));
        sb2.append(this.h);
        sb2.append(";duration=");
        k3.p(te.a.b(H, this, this));
        sb2.append(this.f10454n);
        sb2.append(";layer=");
        k3.p(te.a.b(I, this, this));
        sb2.append(this.f10455r);
        sb2.append(";alternateGroup=");
        k3.p(te.a.b(J, this, this));
        sb2.append(this.f10456s);
        sb2.append(";volume=");
        k3.p(te.a.b(K, this, this));
        sb2.append(this.v);
        sb2.append(";matrix=");
        sb2.append(this.f10457w);
        sb2.append(";width=");
        k3.p(te.a.b(L, this, this));
        sb2.append(this.f10458x);
        sb2.append(";height=");
        k3.p(te.a.b(M, this, this));
        sb2.append(this.f10459y);
        sb2.append("]");
        return sb2.toString();
    }
}
