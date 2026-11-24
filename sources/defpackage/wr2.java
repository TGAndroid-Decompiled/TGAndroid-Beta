package defpackage;
public final class wr2 extends q01 {
    public final o01 G;

    public wr2(int i, o01 o01Var) {
        super(i);
        this.G = o01Var;
        if (o01Var != o01.a) {
            if (i >= 1) {
                return;
            }
            v0b.a(tb4.n(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        String b = f59.a(q01.class).b();
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + b + " instead").toString());
    }

    public final java.lang.Object G(java.lang.Object r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr2.G(java.lang.Object, boolean):java.lang.Object");
    }

    @Override
    public final Object a(fw2 fw2Var, Object obj) {
        if (!(G(obj, true) instanceof ej1)) {
            return g5c.a;
        }
        throw n();
    }

    @Override
    public final Object d(Object obj) {
        return G(obj, false);
    }

    @Override
    public final boolean u() {
        if (this.G == o01.b) {
            return true;
        }
        return false;
    }
}
