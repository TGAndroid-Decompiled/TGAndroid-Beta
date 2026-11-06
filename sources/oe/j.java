package oe;
public final class j implements ke.a {
    public final ke.a f20914a;
    public final o f20915b;

    public j(ke.a serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.f20914a = serializer;
        this.f20915b = new o(serializer.d());
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        if (obj != null) {
            hVar.i(this.f20914a, obj);
        } else {
            hVar.f();
        }
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        if (decoder.i()) {
            return decoder.l(this.f20914a);
        }
        return null;
    }

    @Override
    public final me.d d() {
        return this.f20915b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass() && kotlin.jvm.internal.j.a(this.f20914a, ((j) obj).f20914a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20914a.hashCode();
    }
}
