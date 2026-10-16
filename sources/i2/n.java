package i2;
public final class n implements d9.u {
    public final int f11094a;
    public final Object f11095b;

    public n(Object obj, int i10) {
        this.f11094a = i10;
        this.f11095b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f11094a) {
            case 0:
                return (i) this.f11095b;
            case 1:
                return (x2.s) this.f11095b;
            case 2:
                return (k) this.f11095b;
            default:
                try {
                    return (u2.f0) ((Class) this.f11095b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
