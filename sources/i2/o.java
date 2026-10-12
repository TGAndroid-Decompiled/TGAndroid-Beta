package i2;
public final class o implements d9.j {
    public final int f11803a;
    public final Object f11804b;

    public o(Object obj, int i10) {
        this.f11803a = i10;
        this.f11804b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11803a) {
            case 0:
                return (k) this.f11804b;
            case 1:
                return (x2.u) this.f11804b;
            case 2:
                return (l) this.f11804b;
            default:
                try {
                    return (u2.e0) ((Class) this.f11804b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
