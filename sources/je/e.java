package je;

import ce.a0;
public final class e extends h {
    public static final e d;

    static {
        int i10 = k.f15606c;
        int i11 = k.d;
        long j10 = k.e;
        String str = k.f15604a;
        ?? a0Var = new a0();
        a0Var.f15600c = new c(i10, j10, str, i11);
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
