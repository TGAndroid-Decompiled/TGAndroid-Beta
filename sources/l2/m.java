package l2;
public final class m implements g9.u {
    public final int f17937a;
    public final Object f17938b;

    public m(Object obj, int i7) {
        this.f17937a = i7;
        this.f17938b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f17937a) {
            case 0:
                return (h) this.f17938b;
            case 1:
                return (a3.x) this.f17938b;
            case 2:
                return (j) this.f17938b;
            default:
                try {
                    return (x2.f0) ((Class) this.f17938b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
