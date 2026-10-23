package e9;
public final class p0 {
    public final Object f8489a;
    public final Object f8490b;
    public final Object f8491c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f8489a = obj;
        this.f8490b = obj2;
        this.f8491c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8489a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8490b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8491c);
        return new IllegalArgumentException(sb2.toString());
    }
}
