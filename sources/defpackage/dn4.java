package defpackage;
public final class dn4 implements nm4 {
    public final byte a;
    public final p89 b;

    public dn4(p89 p89Var, byte b) {
        this.a = b;
        this.b = p89Var;
    }

    @Override
    public final Object c(Object obj, zw2 zw2Var) {
        byte b = this.a;
        p89 p89Var = this.b;
        switch (b) {
            case 0:
                p89Var.a = obj;
                throw new j1(this);
            default:
                p89Var.a = obj;
                throw new j1(this);
        }
    }
}
