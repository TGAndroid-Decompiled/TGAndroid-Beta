package ge;

import zd.x;
public final class e extends h {
    public static final e d;

    static {
        int i7 = k.f13861c;
        int i10 = k.d;
        long j3 = k.f13862e;
        String str = k.f13859a;
        ?? xVar = new x();
        xVar.f13855c = new c(i7, j3, str, i10);
        d = xVar;
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
