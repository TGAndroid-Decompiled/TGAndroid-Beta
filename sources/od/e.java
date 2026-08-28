package od;

import hd.a0;
public final class e extends h {
    public static final e d;

    static {
        int i9 = k.f19226c;
        int i10 = k.d;
        long j10 = k.f19227e;
        String str = k.f19224a;
        ?? a0Var = new a0();
        a0Var.f19220c = new c(i9, j10, str, i10);
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
