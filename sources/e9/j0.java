package e9;
public final class j0 {
    public final Object f8760a;
    public final Object f8761b;
    public final Object f8762c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8760a = obj;
        this.f8761b = obj2;
        this.f8762c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8760a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8761b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8762c);
        return new IllegalArgumentException(sb2.toString());
    }
}
