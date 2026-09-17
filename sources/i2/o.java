package i2;
public final class o implements d9.i {
    public final int f10803a;
    public final Object f10804b;

    public o(Object obj, int i10) {
        this.f10803a = i10;
        this.f10804b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10803a) {
            case 0:
                return (k) this.f10804b;
            case 1:
                return (x2.u) this.f10804b;
            case 2:
                return (l) this.f10804b;
            default:
                try {
                    return (u2.e0) ((Class) this.f10804b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
