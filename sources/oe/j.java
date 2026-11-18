package oe;
public final class j implements ke.a {
    public final ke.a f21803a;
    public final o f21804b;

    public j(ke.a serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.f21803a = serializer;
        this.f21804b = new o(serializer.d());
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        if (obj != null) {
            hVar.i(this.f21803a, obj);
        } else {
            hVar.f();
        }
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        if (decoder.i()) {
            return decoder.l(this.f21803a);
        }
        return null;
    }

    @Override
    public final me.d d() {
        return this.f21804b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass() && kotlin.jvm.internal.j.a(this.f21803a, ((j) obj).f21803a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21803a.hashCode();
    }
}
