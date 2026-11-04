package de;

import wd.x;
public final class e extends h {
    public static final e d;

    static {
        int i3 = k.f8831c;
        int i10 = k.d;
        long j10 = k.f8832e;
        String str = k.f8829a;
        ?? xVar = new x();
        xVar.f8825c = new c(i3, j10, str, i10);
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
