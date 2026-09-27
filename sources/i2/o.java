package i2;
public final class o implements d9.i {
    public final int f10790a;
    public final Object f10791b;

    public o(Object obj, int i10) {
        this.f10790a = i10;
        this.f10791b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10790a) {
            case 0:
                return (k) this.f10791b;
            case 1:
                return (x2.u) this.f10791b;
            case 2:
                return (l) this.f10791b;
            default:
                try {
                    return (u2.e0) ((Class) this.f10791b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
