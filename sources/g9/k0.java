package g9;
public final class k0 {
    public final Object f12088a;
    public final Object f12089b;
    public final Object f12090c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f12088a = obj;
        this.f12089b = obj2;
        this.f12090c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f12088a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f12089b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f12090c);
        return new IllegalArgumentException(sb2.toString());
    }
}
