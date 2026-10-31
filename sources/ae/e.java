package ae;

import td.a0;
public final class e extends h {
    public static final e d;

    static {
        int i10 = l.f429c;
        int i11 = l.d;
        long j10 = l.e;
        String str = l.f427a;
        ?? a0Var = new a0();
        a0Var.f422c = new c(i10, j10, str, i11);
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
