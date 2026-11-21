package h9;
public final class k0 {
    public final Object f14038a;
    public final Object f14039b;
    public final Object f14040c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f14038a = obj;
        this.f14039b = obj2;
        this.f14040c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14038a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14039b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14040c);
        return new IllegalArgumentException(sb2.toString());
    }
}
