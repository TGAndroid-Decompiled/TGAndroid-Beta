package e9;
public final class j0 {
    public final Object f8988a;
    public final Object f8989b;
    public final Object f8990c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8988a = obj;
        this.f8989b = obj2;
        this.f8990c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8988a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8989b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8990c);
        return new IllegalArgumentException(sb2.toString());
    }
}
