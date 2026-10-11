package i2;
public final class o implements d9.j {
    public final int f11804a;
    public final Object f11805b;

    public o(Object obj, int i10) {
        this.f11804a = i10;
        this.f11805b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11804a) {
            case 0:
                return (k) this.f11805b;
            case 1:
                return (x2.u) this.f11805b;
            case 2:
                return (l) this.f11805b;
            default:
                try {
                    return (u2.e0) ((Class) this.f11805b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
