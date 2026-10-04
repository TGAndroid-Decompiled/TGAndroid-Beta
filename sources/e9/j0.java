package e9;
public final class j0 {
    public final Object f8761a;
    public final Object f8762b;
    public final Object f8763c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8761a = obj;
        this.f8762b = obj2;
        this.f8763c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8761a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8762b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8763c);
        return new IllegalArgumentException(sb2.toString());
    }
}
