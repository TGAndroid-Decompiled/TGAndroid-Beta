package e9;
public final class j0 {
    public final Object f8086a;
    public final Object f8087b;
    public final Object f8088c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8086a = obj;
        this.f8087b = obj2;
        this.f8088c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8086a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8087b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8088c);
        return new IllegalArgumentException(sb2.toString());
    }
}
