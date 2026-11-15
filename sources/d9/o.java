package d9;
public final class o implements n, he.b, ib.b, q5.b {
    public final int f7639a;
    public final Object f7640b;

    public o(Object obj, int i7) {
        this.f7639a = i7;
        this.f7640b = obj;
    }

    public static o b(Object obj) {
        if (obj != null) {
            return new o(obj, 2);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override
    public Object a() {
        return this.f7640b;
    }

    @Override
    public Object mo24get() {
        switch (this.f7639a) {
            case 2:
                return this.f7640b;
            default:
                return this.f7640b;
        }
    }
}
