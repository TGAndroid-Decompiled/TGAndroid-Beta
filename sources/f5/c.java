package f5;

import com.google.android.gms.internal.play_billing.k3;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final te.b e;

    static {
        te.a aVar = new te.a(c.class, "ChunkOffsetBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        com.google.firebase.messaging.r b10 = te.a.b(e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        k3.p(te.a.b(t.h, tVar, tVar));
        return a1.g.n(tVar.f10445f.length, "]", sb2);
    }
}
