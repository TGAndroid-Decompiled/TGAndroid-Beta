package i2;
public final class m implements d9.u {
    public final int f12487a;
    public final Object f12488b;

    public m(Object obj, int i10) {
        this.f12487a = i10;
        this.f12488b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f12487a) {
            case 0:
                return (h) this.f12488b;
            case 1:
                return (x2.s) this.f12488b;
            case 2:
                return (j) this.f12488b;
            default:
                try {
                    return (u2.f0) ((Class) this.f12488b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
