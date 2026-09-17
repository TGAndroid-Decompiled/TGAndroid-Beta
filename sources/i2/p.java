package i2;
public final class p implements d9.j {
    public final int f11716a;
    public final Object f11717b;

    public p(Object obj, int i10) {
        this.f11716a = i10;
        this.f11717b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11716a) {
            case 0:
                return (l) this.f11717b;
            case 1:
                return (x2.u) this.f11717b;
            case 2:
                return (m) this.f11717b;
            default:
                try {
                    return (u2.e0) ((Class) this.f11717b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
