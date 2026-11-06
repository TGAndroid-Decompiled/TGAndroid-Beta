package i5;

import a8.p0;
import y7.i6;
public abstract class c extends com.googlecode.mp4parser.c {
    public static final i6 f15280e;

    static {
        ze.a aVar = new ze.a(c.class, "ChunkOffsetBox.java");
        f15280e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        ui.e b10 = ze.a.b(f15280e, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        t tVar = (t) this;
        com.google.android.recaptcha.internal.a.t(ze.a.b(t.h, tVar, tVar));
        return p0.n(tVar.f15330f.length, "]", sb2);
    }
}
