package d9;
public final class o implements n, he.b, ib.b, q5.b {
    public final int f7642a;
    public final Object f7643b;

    public o(Object obj, int i7) {
        this.f7642a = i7;
        this.f7643b = obj;
    }

    public static o b(Object obj) {
        if (obj != null) {
            return new o(obj, 2);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override
    public Object a() {
        return this.f7643b;
    }

    @Override
    public Object mo24get() {
        switch (this.f7642a) {
            case 2:
                return this.f7643b;
            default:
                return this.f7643b;
        }
    }
}
