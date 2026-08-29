package j3;
public final class o implements p8.i {
    public final int f10650a;
    public final Object f10651b;

    public o(Object obj, int i10) {
        this.f10650a = i10;
        this.f10651b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f10650a) {
            case 0:
                return (j) this.f10651b;
            case 1:
                return (d5.u) this.f10651b;
            case 2:
                return (l) this.f10651b;
            case 3:
                return Boolean.valueOf(((q0) this.f10651b).K);
            default:
                try {
                    return (l4.b0) ((Class) this.f10651b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
