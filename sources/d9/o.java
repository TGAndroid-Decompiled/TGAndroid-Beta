package d9;
public final class o implements n, he.a, ib.b {
    public final Object f8251a;

    public o(Object obj) {
        this.f8251a = obj;
    }

    public static o b(Object obj) {
        if (obj != null) {
            return new o(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override
    public Object a() {
        return this.f8251a;
    }

    @Override
    public Object mo24get() {
        return this.f8251a;
    }
}
