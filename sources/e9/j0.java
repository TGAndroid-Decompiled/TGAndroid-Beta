package e9;
public final class j0 {
    public final Object f7387a;
    public final Object f7388b;
    public final Object f7389c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f7387a = obj;
        this.f7388b = obj2;
        this.f7389c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f7387a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f7388b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f7389c);
        return new IllegalArgumentException(sb2.toString());
    }
}
