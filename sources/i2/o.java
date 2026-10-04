package i2;
public final class o implements d9.i {
    public final int f11754a;
    public final Object f11755b;

    public o(Object obj, int i10) {
        this.f11754a = i10;
        this.f11755b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11754a) {
            case 0:
                return (k) this.f11755b;
            case 1:
                return (x2.u) this.f11755b;
            case 2:
                return (l) this.f11755b;
            default:
                try {
                    return (u2.e0) ((Class) this.f11755b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
