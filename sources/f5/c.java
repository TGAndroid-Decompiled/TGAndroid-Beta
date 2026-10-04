package f5;

import com.google.android.gms.internal.vision.e2;
import ii.n4;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final n4 f9670e;

    static {
        re.a aVar = new re.a(c.class, "ChunkOffsetBox.java");
        f9670e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        com.google.firebase.messaging.s b10 = re.a.b(f9670e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        e2.q(re.a.b(t.h, tVar, tVar));
        return a4.a.o(tVar.f9719f.length, "]", sb2);
    }
}
