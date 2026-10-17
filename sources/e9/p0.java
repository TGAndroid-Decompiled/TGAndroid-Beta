package e9;
public final class p0 {
    public final Object f8484a;
    public final Object f8485b;
    public final Object f8486c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f8484a = obj;
        this.f8485b = obj2;
        this.f8486c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8484a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8485b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8486c);
        return new IllegalArgumentException(sb2.toString());
    }
}
