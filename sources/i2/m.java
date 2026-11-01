package i2;
public final class m implements d9.t {
    public final int f7967a;
    public final Object f7968b;

    public m(Object obj, int i10) {
        this.f7967a = i10;
        this.f7968b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f7967a) {
            case 0:
                return (h) this.f7968b;
            case 1:
                return (x2.t) this.f7968b;
            case 2:
                return (j) this.f7968b;
            default:
                try {
                    return (u2.f0) ((Class) this.f7968b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
