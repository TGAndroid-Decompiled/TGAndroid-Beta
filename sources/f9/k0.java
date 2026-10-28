package f9;
public final class k0 {
    public final Object f10289a;
    public final Object f10290b;
    public final Object f10291c;

    public k0(Object obj, Object obj2, Object obj3) {
        this.f10289a = obj;
        this.f10290b = obj2;
        this.f10291c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f10289a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f10290b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f10291c);
        return new IllegalArgumentException(sb2.toString());
    }
}
