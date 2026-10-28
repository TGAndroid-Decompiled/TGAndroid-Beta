package i2;
public final class n implements e9.t {
    public final int f13660a;
    public final Object f13661b;

    public n(Object obj, int i10) {
        this.f13660a = i10;
        this.f13661b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f13660a) {
            case 0:
                return (i) this.f13661b;
            case 1:
                return (x2.t) this.f13661b;
            case 2:
                return (k) this.f13661b;
            default:
                try {
                    return (u2.f0) ((Class) this.f13661b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
