package i2;
public final class o implements d9.i {
    public final int f10802a;
    public final Object f10803b;

    public o(Object obj, int i10) {
        this.f10802a = i10;
        this.f10803b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10802a) {
            case 0:
                return (k) this.f10803b;
            case 1:
                return (x2.u) this.f10803b;
            case 2:
                return (l) this.f10803b;
            default:
                try {
                    return (u2.e0) ((Class) this.f10803b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
