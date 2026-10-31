package f5;

import c3.i0;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final za.c e;

    static {
        le.a aVar = new le.a(c.class, "ChunkOffsetBox.java");
        e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        ji.f b10 = le.a.b(e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        i0.s(le.a.b(t.h, tVar, tVar));
        return a1.g.p(sb2, tVar.f6897f.length, "]");
    }
}
