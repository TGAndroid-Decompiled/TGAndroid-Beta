package oe;
public final class f implements ke.a {
    public static final f f21889a = new Object();
    public static final n f21890b = new n("kotlin.Int", me.b.d);

    @Override
    public final void a(qe.h hVar, Object obj) {
        hVar.c(((Number) obj).intValue());
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        return Integer.valueOf(decoder.e());
    }

    @Override
    public final me.d d() {
        return f21890b;
    }
}
