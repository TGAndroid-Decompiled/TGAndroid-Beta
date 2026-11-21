package l2;
public final class m implements g9.t {
    public final int f19468a;
    public final Object f19469b;

    public m(Object obj, int i7) {
        this.f19468a = i7;
        this.f19469b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f19468a) {
            case 0:
                return (h) this.f19469b;
            case 1:
                return (a3.x) this.f19469b;
            case 2:
                return (j) this.f19469b;
            default:
                try {
                    return (x2.f0) ((Class) this.f19469b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
