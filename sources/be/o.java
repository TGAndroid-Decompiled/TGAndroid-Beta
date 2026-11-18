package be;
public final class o extends c {
    public final a f3178w;

    public o(int i7, a aVar) {
        super(i7);
        this.f3178w = aVar;
        if (aVar != a.f3135a) {
            if (i7 >= 1) {
                return;
            }
            throw new IllegalArgumentException(i5.c.j(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.s.a(c.class).b() + " instead").toString());
    }

    public final java.lang.Object C(java.lang.Object r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: be.o.C(java.lang.Object, boolean):java.lang.Object");
    }

    @Override
    public final Object a(id.c cVar, Object obj) {
        if (!(C(obj, true) instanceof h)) {
            return gd.k.f13485a;
        }
        throw o();
    }

    @Override
    public final Object b(Object obj) {
        return C(obj, false);
    }

    @Override
    public final boolean s() {
        if (this.f3178w == a.f3136b) {
            return true;
        }
        return false;
    }
}
