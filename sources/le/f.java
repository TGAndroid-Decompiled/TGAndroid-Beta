package le;
public final class f implements he.a {
    public static final f f18187a = new Object();
    public static final n f18188b = new n("kotlin.Int", je.b.d);

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        return Integer.valueOf(decoder.e());
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        hVar.c(((Number) obj).intValue());
    }

    @Override
    public final je.d d() {
        return f18188b;
    }
}
