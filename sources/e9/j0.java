package e9;
public final class j0 {
    public final Object f8082a;
    public final Object f8083b;
    public final Object f8084c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8082a = obj;
        this.f8083b = obj2;
        this.f8084c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8082a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8083b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8084c);
        return new IllegalArgumentException(sb2.toString());
    }
}
