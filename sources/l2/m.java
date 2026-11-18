package l2;
public final class m implements g9.t {
    public final int f19443a;
    public final Object f19444b;

    public m(Object obj, int i7) {
        this.f19443a = i7;
        this.f19444b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f19443a) {
            case 0:
                return (h) this.f19444b;
            case 1:
                return (a3.x) this.f19444b;
            case 2:
                return (j) this.f19444b;
            default:
                try {
                    return (x2.f0) ((Class) this.f19444b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
