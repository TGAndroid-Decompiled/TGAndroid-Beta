package i2;
public final class o implements d9.u {
    public final int f12492a;
    public final Object f12493b;

    public o(Object obj, int i10) {
        this.f12492a = i10;
        this.f12493b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f12492a) {
            case 0:
                return (j) this.f12493b;
            case 1:
                return (x2.s) this.f12493b;
            case 2:
                return (l) this.f12493b;
            default:
                try {
                    return (u2.f0) ((Class) this.f12493b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
