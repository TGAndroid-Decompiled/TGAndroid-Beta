package i2;
public final class n implements d9.u {
    public final int f12489a;
    public final Object f12490b;

    public n(Object obj, int i10) {
        this.f12489a = i10;
        this.f12490b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f12489a) {
            case 0:
                return (i) this.f12490b;
            case 1:
                return (x2.s) this.f12490b;
            case 2:
                return (k) this.f12490b;
            default:
                try {
                    return (u2.e0) ((Class) this.f12490b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
