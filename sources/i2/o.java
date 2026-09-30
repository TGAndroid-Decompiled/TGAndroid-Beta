package i2;
public final class o implements d9.i {
    public final int f10801a;
    public final Object f10802b;

    public o(Object obj, int i10) {
        this.f10801a = i10;
        this.f10802b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10801a) {
            case 0:
                return (k) this.f10802b;
            case 1:
                return (x2.u) this.f10802b;
            case 2:
                return (l) this.f10802b;
            default:
                try {
                    return (u2.e0) ((Class) this.f10802b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
