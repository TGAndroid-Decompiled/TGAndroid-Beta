package e9;
public final class p0 {
    public final Object f8485a;
    public final Object f8486b;
    public final Object f8487c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f8485a = obj;
        this.f8486b = obj2;
        this.f8487c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8485a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8486b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8487c);
        return new IllegalArgumentException(sb2.toString());
    }
}
