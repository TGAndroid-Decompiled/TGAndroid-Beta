package h3;
public final class o implements n8.i {
    public final int f9613a;
    public final Object f9614b;

    public o(Object obj, int i9) {
        this.f9613a = i9;
        this.f9614b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f9613a) {
            case 0:
                return (j) this.f9614b;
            case 1:
                return (b5.w) this.f9614b;
            case 2:
                return (l) this.f9614b;
            case 3:
                return Boolean.valueOf(((q0) this.f9614b).K);
            default:
                try {
                    return (j4.c0) ((Class) this.f9614b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
