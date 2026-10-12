package e9;
public final class j0 {
    public final Object f8752a;
    public final Object f8753b;
    public final Object f8754c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8752a = obj;
        this.f8753b = obj2;
        this.f8754c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8752a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8753b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8754c);
        return new IllegalArgumentException(sb2.toString());
    }
}
