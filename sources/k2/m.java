package k2;
public final class m implements f9.t {
    public final int f16621a;
    public final Object f16622b;

    public m(Object obj, int i3) {
        this.f16621a = i3;
        this.f16622b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f16621a) {
            case 0:
                return (h) this.f16622b;
            case 1:
                return (z2.s) this.f16622b;
            case 2:
                return (j) this.f16622b;
            default:
                try {
                    return (w2.f0) ((Class) this.f16622b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
