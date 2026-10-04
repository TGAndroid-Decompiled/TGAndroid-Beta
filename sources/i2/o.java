package i2;
public final class o implements d9.i {
    public final int f11755a;
    public final Object f11756b;

    public o(Object obj, int i10) {
        this.f11755a = i10;
        this.f11756b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11755a) {
            case 0:
                return (k) this.f11756b;
            case 1:
                return (x2.u) this.f11756b;
            case 2:
                return (l) this.f11756b;
            default:
                try {
                    return (u2.e0) ((Class) this.f11756b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
