package e9;
public final class j0 {
    public final Object f8070a;
    public final Object f8071b;
    public final Object f8072c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8070a = obj;
        this.f8071b = obj2;
        this.f8072c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8070a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8071b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8072c);
        return new IllegalArgumentException(sb2.toString());
    }
}
