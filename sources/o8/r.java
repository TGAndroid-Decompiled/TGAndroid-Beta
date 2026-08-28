package o8;

import java.util.Comparator;
public final class r extends t {
    public static t f(int i9) {
        if (i9 < 0) {
            return t.f19088b;
        }
        if (i9 > 0) {
            return t.f19089c;
        }
        return t.f19087a;
    }

    @Override
    public final t a(int i9, int i10) {
        int i11;
        if (i9 < i10) {
            i11 = -1;
        } else if (i9 > i10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return f(i11);
    }

    @Override
    public final t b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override
    public final t c(boolean z10, boolean z11) {
        int i9;
        if (z10 == z11) {
            i9 = 0;
        } else if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        return f(i9);
    }

    @Override
    public final t d(boolean z10, boolean z11) {
        int i9;
        if (z11 == z10) {
            i9 = 0;
        } else if (z11) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        return f(i9);
    }

    @Override
    public final int e() {
        return 0;
    }
}
