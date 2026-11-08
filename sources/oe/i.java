package oe;
public final class i implements ke.a {
    public static final i f20915a = new Object();
    public static final n f20916b = new n("kotlin.Long", me.b.f20009e);

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
        return f20916b;
    }
}
