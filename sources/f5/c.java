package f5;

import com.google.android.gms.internal.vision.e2;
import m.y0;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final y0 f9678e;

    static {
        se.a aVar = new se.a(c.class, "ChunkOffsetBox.java");
        f9678e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = se.a.b(f9678e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        e2.q(se.a.b(t.h, tVar, tVar));
        return a1.g.o(tVar.f9727f.length, "]", sb2);
    }
}
