package i2;
public final class o implements d9.u {
    public final int f12490a;
    public final Object f12491b;

    public o(Object obj, int i10) {
        this.f12490a = i10;
        this.f12491b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f12490a) {
            case 0:
                return (j) this.f12491b;
            case 1:
                return (x2.s) this.f12491b;
            case 2:
                return (l) this.f12491b;
            default:
                try {
                    return (u2.f0) ((Class) this.f12491b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
