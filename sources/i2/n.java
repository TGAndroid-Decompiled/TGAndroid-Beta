package i2;
public final class n implements d9.u {
    public final int f11090a;
    public final Object f11091b;

    public n(Object obj, int i10) {
        this.f11090a = i10;
        this.f11091b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11090a) {
            case 0:
                return (i) this.f11091b;
            case 1:
                return (x2.s) this.f11091b;
            case 2:
                return (k) this.f11091b;
            default:
                try {
                    return (u2.f0) ((Class) this.f11091b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
