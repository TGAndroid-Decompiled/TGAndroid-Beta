package e9;

import java.util.Comparator;
public final class z extends b0 {
    public static b0 f(int i10) {
        if (i10 < 0) {
            return b0.f8418b;
        }
        if (i10 > 0) {
            return b0.f8419c;
        }
        return b0.f8417a;
    }

    @Override
    public final b0 a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override
    public final b0 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override
    public final b0 c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override
    public final b0 d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override
    public final int e() {
        return 0;
    }
}
