package h9;
public final class k0 {
    public final Object f14009a;
    public final Object f14010b;
    public final Object f14011c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f14009a = obj;
        this.f14010b = obj2;
        this.f14011c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14009a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14010b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14011c);
        return new IllegalArgumentException(sb2.toString());
    }
}
