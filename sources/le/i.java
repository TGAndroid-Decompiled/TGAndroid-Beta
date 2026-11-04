package le;
public final class i implements he.a {
    public static final i f18193a = new Object();
    public static final n f18194b = new n("kotlin.Long", je.b.f16241e);

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        return Long.valueOf(decoder.g());
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        hVar.d(((Number) obj).longValue());
    }

    @Override
    public final je.d d() {
        return f18194b;
    }
}
