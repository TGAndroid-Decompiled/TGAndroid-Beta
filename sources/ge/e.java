package ge;

import zd.a0;
public final class e extends h {
    public static final e d;

    static {
        int i10 = k.f10645c;
        int i11 = k.d;
        long j3 = k.f10646e;
        String str = k.f10643a;
        ?? a0Var = new a0();
        a0Var.f10639c = new c(i10, j3, str, i11);
        d = a0Var;
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
