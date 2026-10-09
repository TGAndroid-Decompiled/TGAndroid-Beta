package he;

import ae.b0;
public final class e extends h {
    public static final e d;

    static {
        int i10 = k.f11121c;
        int i11 = k.d;
        long j3 = k.f11122e;
        String str = k.f11119a;
        ?? b0Var = new b0();
        b0Var.f11115c = new c(i10, j3, str, i11);
        d = b0Var;
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public final String toString() {
        return "Dispatchers.Default";
    }
}
