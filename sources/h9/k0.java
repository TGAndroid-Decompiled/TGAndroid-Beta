package h9;
public final class k0 {
    public final Object f14041a;
    public final Object f14042b;
    public final Object f14043c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f14041a = obj;
        this.f14042b = obj2;
        this.f14043c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14041a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14042b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14043c);
        return new IllegalArgumentException(sb2.toString());
    }
}
