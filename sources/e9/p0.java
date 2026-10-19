package e9;
public final class p0 {
    public final Object f8482a;
    public final Object f8483b;
    public final Object f8484c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f8482a = obj;
        this.f8483b = obj2;
        this.f8484c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8482a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8483b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8484c);
        return new IllegalArgumentException(sb2.toString());
    }
}
