package l2;
public final class m implements g9.t {
    public final int f19076a;
    public final Object f19077b;

    public m(Object obj, int i7) {
        this.f19076a = i7;
        this.f19077b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f19076a) {
            case 0:
                return (h) this.f19077b;
            case 1:
                return (a3.x) this.f19077b;
            case 2:
                return (j) this.f19077b;
            default:
                try {
                    return (x2.e0) ((Class) this.f19077b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
