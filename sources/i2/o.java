package i2;
public final class o implements d9.j {
    public final int f10804a;
    public final Object f10805b;

    public o(Object obj, int i10) {
        this.f10804a = i10;
        this.f10805b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10804a) {
            case 0:
                return (k) this.f10805b;
            case 1:
                return (x2.v) this.f10805b;
            case 2:
                return (l) this.f10805b;
            default:
                try {
                    return (u2.e0) ((Class) this.f10805b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
