package h9;
public final class k0 {
    public final Object f14004a;
    public final Object f14005b;
    public final Object f14006c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f14004a = obj;
        this.f14005b = obj2;
        this.f14006c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14004a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14005b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14006c);
        return new IllegalArgumentException(sb2.toString());
    }
}
