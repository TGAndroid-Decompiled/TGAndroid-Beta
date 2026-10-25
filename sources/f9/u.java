package f9;

import java.util.Comparator;
public final class u extends w {
    public static w f(int i10) {
        if (i10 < 0) {
            return w.f10353b;
        }
        if (i10 > 0) {
            return w.f10354c;
        }
        return w.f10352a;
    }

    @Override
    public final w a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override
    public final w b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override
    public final w c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override
    public final w d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override
    public final int e() {
        return 0;
    }
}
