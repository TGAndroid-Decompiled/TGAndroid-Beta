package oe;
public final class i implements ke.a {
    public static final i f21795a = new Object();
    public static final n f21796b = new n("kotlin.Long", me.b.f20964e);

    @Override
    public final void a(qe.h hVar, Object obj) {
        hVar.d(((Number) obj).longValue());
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        return Long.valueOf(decoder.g());
    }

    @Override
    public final me.d d() {
        return f21796b;
    }
}
