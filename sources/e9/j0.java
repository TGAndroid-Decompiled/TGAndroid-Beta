package e9;
public final class j0 {
    public final Object f8960a;
    public final Object f8961b;
    public final Object f8962c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8960a = obj;
        this.f8961b = obj2;
        this.f8962c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8960a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8961b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8962c);
        return new IllegalArgumentException(sb2.toString());
    }
}
