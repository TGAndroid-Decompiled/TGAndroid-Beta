package h5;

import org.telegram.ui.Components.i9;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final i9 f14236e;

    static {
        we.a aVar = new we.a(c.class, "ChunkOffsetBox.java");
        f14236e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        ui.f b10 = we.a.b(f14236e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        com.google.android.recaptcha.internal.a.t(we.a.b(t.h, tVar, tVar));
        return a1.g.o(tVar.f14286f.length, "]", sb2);
    }
}
