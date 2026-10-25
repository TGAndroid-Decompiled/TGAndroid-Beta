package i2;
public final class n implements e9.t {
    public final int f13661a;
    public final Object f13662b;

    public n(Object obj, int i10) {
        this.f13661a = i10;
        this.f13662b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f13661a) {
            case 0:
                return (i) this.f13662b;
            case 1:
                return (x2.t) this.f13662b;
            case 2:
                return (k) this.f13662b;
            default:
                try {
                    return (u2.f0) ((Class) this.f13662b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
