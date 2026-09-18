package e9;
public final class j0 {
    public final Object f8087a;
    public final Object f8088b;
    public final Object f8089c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8087a = obj;
        this.f8088b = obj2;
        this.f8089c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8087a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8088b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8089c);
        return new IllegalArgumentException(sb2.toString());
    }
}
