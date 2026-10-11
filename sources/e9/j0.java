package e9;
public final class j0 {
    public final Object f8754a;
    public final Object f8755b;
    public final Object f8756c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8754a = obj;
        this.f8755b = obj2;
        this.f8756c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8754a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8755b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8756c);
        return new IllegalArgumentException(sb2.toString());
    }
}
