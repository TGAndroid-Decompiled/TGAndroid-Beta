package le;
public final class j implements he.a {
    public final he.a f18195a;
    public final o f18196b;

    public j(he.a serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.f18195a = serializer;
        this.f18196b = new o(serializer.d());
    }

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        if (decoder.i()) {
            return decoder.l(this.f18195a);
        }
        return null;
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        if (obj != null) {
            hVar.i(this.f18195a, obj);
        } else {
            hVar.f();
        }
    }

    @Override
    public final je.d d() {
        return this.f18196b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass() && kotlin.jvm.internal.j.a(this.f18195a, ((j) obj).f18195a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18195a.hashCode();
    }
}
