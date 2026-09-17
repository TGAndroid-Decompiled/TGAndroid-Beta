package i2;
public final class p implements d9.j {
    public final int f11690a;
    public final Object f11691b;

    public p(Object obj, int i10) {
        this.f11690a = i10;
        this.f11691b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11690a) {
            case 0:
                return (l) this.f11691b;
            case 1:
                return (x2.u) this.f11691b;
            case 2:
                return (m) this.f11691b;
            default:
                try {
                    return (u2.e0) ((Class) this.f11691b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
