package g9;

import java.util.Comparator;
public final class u extends w {
    public static w f(int i3) {
        if (i3 < 0) {
            return w.f12161b;
        }
        if (i3 > 0) {
            return w.f12162c;
        }
        return w.f12160a;
    }

    @Override
    public final w a(int i3, int i10) {
        return f(Integer.compare(i3, i10));
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
