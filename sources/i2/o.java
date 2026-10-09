package i2;
public final class o implements d9.j {
    public final int f11805a;
    public final Object f11806b;

    public o(Object obj, int i10) {
        this.f11805a = i10;
        this.f11806b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11805a) {
            case 0:
                return (k) this.f11806b;
            case 1:
                return (x2.u) this.f11806b;
            case 2:
                return (l) this.f11806b;
            default:
                try {
                    return (u2.e0) ((Class) this.f11806b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
