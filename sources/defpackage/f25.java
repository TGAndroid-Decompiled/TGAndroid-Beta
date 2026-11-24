package defpackage;
public final class f25 implements jac {
    public final byte a;
    public final jac b;

    public f25(jac jacVar, byte b) {
        this.a = b;
        this.b = jacVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                jacVar.a((y25) obj, (String) obj2);
                return;
            default:
                jacVar.a((Long) obj, (Boolean) obj2);
                return;
        }
    }
}
