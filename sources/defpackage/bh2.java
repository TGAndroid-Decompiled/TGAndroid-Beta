package defpackage;
public abstract class bh2 extends g2 {
    public static final z24 e;

    static {
        z74 z74Var = new z74(bh2.class, "ChunkOffsetBox.java");
        e = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        c5a b = z74.b(e, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[entryCount=");
        kwa kwaVar = (kwa) this;
        oo1.r(z74.b(kwa.h, kwaVar, kwaVar));
        return de9.l(sb, kwaVar.f.length, "]");
    }
}
