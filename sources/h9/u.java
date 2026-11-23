package h9;

import java.util.Comparator;
public final class u extends w {
    public static w f(int i7) {
        if (i7 < 0) {
            return w.f14114b;
        }
        if (i7 > 0) {
            return w.f14115c;
        }
        return w.f14113a;
    }

    @Override
    public final w a(int i7, int i10) {
        return f(Integer.compare(i7, i10));
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
