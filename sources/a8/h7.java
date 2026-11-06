package a8;
public abstract class h7 {
    public static be.c a(int i7, be.a aVar, int i10) {
        if ((i10 & 2) != 0) {
            aVar = be.a.f3182a;
        }
        if (i7 != -2) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != Integer.MAX_VALUE) {
                        if (aVar == be.a.f3182a) {
                            return new be.c(i7);
                        }
                        return new be.o(i7, aVar);
                    }
                    return new be.c(Integer.MAX_VALUE);
                } else if (aVar == be.a.f3182a) {
                    return new be.c(0);
                } else {
                    return new be.o(1, aVar);
                }
            } else if (aVar == be.a.f3182a) {
                return new be.o(1, be.a.f3183b);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else if (aVar == be.a.f3182a) {
            be.g.f3216g.getClass();
            return new be.c(be.f.f3215b);
        } else {
            return new be.o(1, aVar);
        }
    }
}
