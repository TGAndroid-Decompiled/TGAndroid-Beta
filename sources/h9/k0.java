package h9;
public final class k0 {
    public final Object f14012a;
    public final Object f14013b;
    public final Object f14014c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f14012a = obj;
        this.f14013b = obj2;
        this.f14014c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14012a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14013b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14014c);
        return new IllegalArgumentException(sb2.toString());
    }
}
