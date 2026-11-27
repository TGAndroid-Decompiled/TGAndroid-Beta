package defpackage;
public final class ps2 extends z01 {
    public final x01 G;

    public ps2(int i, x01 x01Var) {
        super(i);
        this.G = x01Var;
        if (x01Var != x01.a) {
            if (i >= 1) {
                return;
            }
            bya.a(qd4.n(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        String b = s89.a(z01.class).b();
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + b + " instead").toString());
    }

    public final java.lang.Object G(java.lang.Object r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps2.G(java.lang.Object, boolean):java.lang.Object");
    }

    @Override
    public final Object a(zw2 zw2Var, Object obj) {
        if (!(G(obj, true) instanceof nj1)) {
            return g9c.a;
        }
        throw n();
    }

    @Override
    public final Object d(Object obj) {
        return G(obj, false);
    }

    @Override
    public final boolean u() {
        if (this.G == x01.b) {
            return true;
        }
        return false;
    }
}
