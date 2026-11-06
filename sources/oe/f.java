package oe;
public final class f implements ke.a {
    public static final f f20906a = new Object();
    public static final n f20907b = new n("kotlin.Int", me.b.d);

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
        return f20907b;
    }
}
