package l2;
public final class m implements g9.u {
    public final int f17934a;
    public final Object f17935b;

    public m(Object obj, int i7) {
        this.f17934a = i7;
        this.f17935b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f17934a) {
            case 0:
                return (h) this.f17935b;
            case 1:
                return (a3.x) this.f17935b;
            case 2:
                return (j) this.f17935b;
            default:
                try {
                    return (x2.f0) ((Class) this.f17935b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
