package i5;

import a8.p0;
import ab.c0;
public abstract class d extends com.googlecode.mp4parser.c {
    public static final ze.b f16081e;

    static {
        ze.a aVar = new ze.a(d.class, "ChunkOffsetBox.java");
        f16081e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        c0 b10 = ze.a.b(f16081e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        u uVar = (u) this;
        c.w(ze.a.b(u.h, uVar, uVar));
        return p0.n(uVar.f16131f.length, "]", sb2);
    }
}
