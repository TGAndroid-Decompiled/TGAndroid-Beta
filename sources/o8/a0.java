package o8;
public final class a0 {
    public final Object f19024a;
    public final Object f19025b;
    public final Object f19026c;

    public a0(Object obj, Object obj2, Object obj3) {
        this.f19024a = obj;
        this.f19025b = obj2;
        this.f19026c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f19024a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f19025b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f19026c);
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        sb2.append(" and ");
        sb2.append(valueOf3);
        sb2.append("=");
        sb2.append(valueOf4);
        return new IllegalArgumentException(sb2.toString());
    }
}
