package h3;

public final class o implements o8.i {

    public final int f8043a;

    public final Object f8044b;

    public o(Object obj, int i10) {
        this.f8043a = i10;
        this.f8044b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f8043a) {
            case 0:
                return (j) this.f8044b;
            case 1:
                return (b5.v) this.f8044b;
            case 2:
                return (l) this.f8044b;
            case 3:
                return Boolean.valueOf(((q0) this.f8044b).K);
            default:
                try {
                    return (j4.b0) ((Class) this.f8044b).getConstructor(null).newInstance(null);
                } catch (Exception e9) {
                    throw new IllegalStateException(e9);
                }
        }
    }
}
