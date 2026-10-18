package e9;
public final class p0 {
    public final Object f8483a;
    public final Object f8484b;
    public final Object f8485c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f8483a = obj;
        this.f8484b = obj2;
        this.f8485c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f8483a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8484b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f8485c);
        return new IllegalArgumentException(sb2.toString());
    }
}
