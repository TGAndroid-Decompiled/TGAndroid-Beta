package e9;
public final class j0 {
    public final Object f8755a;
    public final Object f8756b;
    public final Object f8757c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f8755a = obj;
        this.f8756b = obj2;
        this.f8757c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8755a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8756b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8757c);
        return new IllegalArgumentException(sb2.toString());
    }
}
