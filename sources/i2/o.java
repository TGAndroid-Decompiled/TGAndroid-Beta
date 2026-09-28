package i2;
public final class o implements d9.i {
    public final int f10787a;
    public final Object f10788b;

    public o(Object obj, int i10) {
        this.f10787a = i10;
        this.f10788b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10787a) {
            case 0:
                return (k) this.f10788b;
            case 1:
                return (x2.u) this.f10788b;
            case 2:
                return (l) this.f10788b;
            default:
                try {
                    return (u2.e0) ((Class) this.f10788b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
