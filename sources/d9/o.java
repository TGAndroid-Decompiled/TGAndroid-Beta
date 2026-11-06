package d9;
public final class o implements n, he.a, ib.b {
    public final Object f8253a;

    public o(Object obj) {
        this.f8253a = obj;
    }

    public static o b(Object obj) {
        if (obj != null) {
            return new o(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override
    public Object a() {
        return this.f8253a;
    }

    @Override
    public Object mo24get() {
        return this.f8253a;
    }
}
