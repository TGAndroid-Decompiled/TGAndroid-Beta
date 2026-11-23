package h9;
public final class k0 {
    public final Object f14000a;
    public final Object f14001b;
    public final Object f14002c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f14000a = obj;
        this.f14001b = obj2;
        this.f14002c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14000a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14001b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14002c);
        return new IllegalArgumentException(sb2.toString());
    }
}
