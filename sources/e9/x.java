package e9;

import java.util.Comparator;
public final class x extends z {
    public static z f(int i10) {
        if (i10 < 0) {
            return z.f7447b;
        }
        if (i10 > 0) {
            return z.f7448c;
        }
        return z.f7446a;
    }

    @Override
    public final z a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override
    public final z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override
    public final z c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override
    public final z d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override
    public final int e() {
        return 0;
    }
}
