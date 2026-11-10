package l2;
public final class m implements g9.u {
    public final int f17938a;
    public final Object f17939b;

    public m(Object obj, int i7) {
        this.f17938a = i7;
        this.f17939b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f17938a) {
            case 0:
                return (h) this.f17939b;
            case 1:
                return (a3.x) this.f17939b;
            case 2:
                return (j) this.f17939b;
            default:
                try {
                    return (x2.e0) ((Class) this.f17939b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
