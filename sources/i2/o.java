package i2;
public final class o implements d9.i {
    public final int f10313a;
    public final Object f10314b;

    public o(Object obj, int i10) {
        this.f10313a = i10;
        this.f10314b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10313a) {
            case 0:
                return (k) this.f10314b;
            case 1:
                return (x2.u) this.f10314b;
            case 2:
                return (l) this.f10314b;
            default:
                try {
                    return (u2.f0) ((Class) this.f10314b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
