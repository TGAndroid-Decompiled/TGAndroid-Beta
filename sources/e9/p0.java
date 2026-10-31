package e9;
public final class p0 {
    public final Object f6398a;
    public final Object f6399b;
    public final Object f6400c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f6398a = obj;
        this.f6399b = obj2;
        this.f6400c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f6398a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f6399b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f6400c);
        return new IllegalArgumentException(sb2.toString());
    }
}
