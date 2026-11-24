package defpackage;
public final class ht2 extends y11 {
    public final w11 G;

    public ht2(int i, w11 w11Var) {
        super(i);
        this.G = w11Var;
        if (w11Var != w11.a) {
            if (i >= 1) {
                return;
            }
            c1b.a(td4.o(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        String b = h79.a(y11.class).b();
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + b + " instead").toString());
    }

    public final java.lang.Object G(java.lang.Object r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht2.G(java.lang.Object, boolean):java.lang.Object");
    }

    @Override
    public final Object a(px2 px2Var, Object obj) {
        if (!(G(obj, true) instanceof mk1)) {
            return g7c.a;
        }
        throw n();
    }

    @Override
    public final Object d(Object obj) {
        return G(obj, false);
    }

    @Override
    public final boolean u() {
        if (this.G == w11.b) {
            return true;
        }
        return false;
    }
}
