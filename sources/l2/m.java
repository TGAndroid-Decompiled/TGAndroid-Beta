package l2;
public final class m implements g9.t {
    public final int f19471a;
    public final Object f19472b;

    public m(Object obj, int i7) {
        this.f19471a = i7;
        this.f19472b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f19471a) {
            case 0:
                return (h) this.f19472b;
            case 1:
                return (a3.x) this.f19472b;
            case 2:
                return (j) this.f19472b;
            default:
                try {
                    return (x2.f0) ((Class) this.f19472b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
