package g5;

import c3.h0;
import li.e3;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final e3 e;

    static {
        ue.a aVar = new ue.a(c.class, "ChunkOffsetBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        ti.e b10 = ue.a.b(e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        h0.s(ue.a.b(t.h, tVar, tVar));
        return a1.g.n(tVar.f12337f.length, "]", sb2);
    }
}
