package e9;
public final class j0 {
    public final Object f8084a;
    public final Object f8085b;
    public final Object f8086c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8084a = obj;
        this.f8085b = obj2;
        this.f8086c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8084a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8085b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8086c);
        return new IllegalArgumentException(sb2.toString());
    }
}
