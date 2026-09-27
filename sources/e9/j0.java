package e9;
public final class j0 {
    public final Object f8071a;
    public final Object f8072b;
    public final Object f8073c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8071a = obj;
        this.f8072b = obj2;
        this.f8073c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8071a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8072b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8073c);
        return new IllegalArgumentException(sb2.toString());
    }
}
