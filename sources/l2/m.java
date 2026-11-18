package l2;
public final class m implements g9.t {
    public final int f19440a;
    public final Object f19441b;

    public m(Object obj, int i7) {
        this.f19440a = i7;
        this.f19441b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f19440a) {
            case 0:
                return (h) this.f19441b;
            case 1:
                return (a3.x) this.f19441b;
            case 2:
                return (j) this.f19441b;
            default:
                try {
                    return (x2.f0) ((Class) this.f19441b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
