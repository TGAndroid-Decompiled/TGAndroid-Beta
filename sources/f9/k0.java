package f9;
public final class k0 {
    public final Object f10290a;
    public final Object f10291b;
    public final Object f10292c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f10290a = obj;
        this.f10291b = obj2;
        this.f10292c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f10290a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f10291b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f10292c);
        return new IllegalArgumentException(sb2.toString());
    }
}
