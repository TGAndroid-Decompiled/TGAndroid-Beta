package i2;
public final class m implements d9.t {
    public final int f7966a;
    public final Object f7967b;

    public m(Object obj, int i10) {
        this.f7966a = i10;
        this.f7967b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f7966a) {
            case 0:
                return (h) this.f7967b;
            case 1:
                return (x2.t) this.f7967b;
            case 2:
                return (j) this.f7967b;
            default:
                try {
                    return (u2.f0) ((Class) this.f7967b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
