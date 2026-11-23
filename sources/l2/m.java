package l2;
public final class m implements g9.t {
    public final int f19437a;
    public final Object f19438b;

    public m(Object obj, int i7) {
        this.f19437a = i7;
        this.f19438b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f19437a) {
            case 0:
                return (h) this.f19438b;
            case 1:
                return (a3.x) this.f19438b;
            case 2:
                return (j) this.f19438b;
            default:
                try {
                    return (x2.f0) ((Class) this.f19438b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
