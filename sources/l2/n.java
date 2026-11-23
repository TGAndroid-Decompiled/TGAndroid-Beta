package l2;
public final class n implements g9.t {
    public final int f19541a;
    public final Object f19542b;

    public n(Object obj, int i7) {
        this.f19541a = i7;
        this.f19542b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f19541a) {
            case 0:
                return (i) this.f19542b;
            case 1:
                return (a3.x) this.f19542b;
            case 2:
                return (k) this.f19542b;
            default:
                try {
                    return (x2.f0) ((Class) this.f19542b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
