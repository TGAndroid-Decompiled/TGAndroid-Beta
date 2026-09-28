package e9;
public final class j0 {
    public final Object f8069a;
    public final Object f8070b;
    public final Object f8071c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8069a = obj;
        this.f8070b = obj2;
        this.f8071c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8069a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8070b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8071c);
        return new IllegalArgumentException(sb2.toString());
    }
}
