package i2;
public final class n implements d9.u {
    public final int f12519a;
    public final Object f12520b;

    public n(Object obj, int i10) {
        this.f12519a = i10;
        this.f12520b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f12519a) {
            case 0:
                return (i) this.f12520b;
            case 1:
                return (x2.s) this.f12520b;
            case 2:
                return (k) this.f12520b;
            default:
                try {
                    return (u2.g0) ((Class) this.f12520b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
