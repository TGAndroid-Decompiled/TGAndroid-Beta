package h9;
public final class k0 {
    public final Object f14335a;
    public final Object f14336b;
    public final Object f14337c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f14335a = obj;
        this.f14336b = obj2;
        this.f14337c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14335a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14336b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14337c);
        return new IllegalArgumentException(sb2.toString());
    }
}
