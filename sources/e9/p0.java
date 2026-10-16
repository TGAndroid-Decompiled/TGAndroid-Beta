package e9;
public final class p0 {
    public final Object f8603a;
    public final Object f8604b;
    public final Object f8605c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f8603a = obj;
        this.f8604b = obj2;
        this.f8605c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8603a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8604b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8605c);
        return new IllegalArgumentException(sb2.toString());
    }
}
