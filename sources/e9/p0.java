package e9;
public final class p0 {
    public final Object f8600a;
    public final Object f8601b;
    public final Object f8602c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f8600a = obj;
        this.f8601b = obj2;
        this.f8602c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8600a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8601b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8602c);
        return new IllegalArgumentException(sb2.toString());
    }
}
