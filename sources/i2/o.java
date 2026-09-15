package i2;
public final class o implements d9.i {
    public final int f10800a;
    public final Object f10801b;

    public o(Object obj, int i10) {
        this.f10800a = i10;
        this.f10801b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10800a) {
            case 0:
                return (k) this.f10801b;
            case 1:
                return (x2.u) this.f10801b;
            case 2:
                return (l) this.f10801b;
            default:
                try {
                    return (u2.e0) ((Class) this.f10801b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
