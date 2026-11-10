package h9;
public final class k0 {
    public final Object f14337a;
    public final Object f14338b;
    public final Object f14339c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f14337a = obj;
        this.f14338b = obj2;
        this.f14339c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14337a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14338b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14339c);
        return new IllegalArgumentException(sb2.toString());
    }
}
