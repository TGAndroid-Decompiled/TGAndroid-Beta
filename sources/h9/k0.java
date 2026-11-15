package h9;
public final class k0 {
    public final Object f13691a;
    public final Object f13692b;
    public final Object f13693c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f13691a = obj;
        this.f13692b = obj2;
        this.f13693c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f13691a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f13692b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f13693c);
        return new IllegalArgumentException(sb2.toString());
    }
}
