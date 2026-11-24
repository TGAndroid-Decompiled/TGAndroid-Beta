package defpackage;
public final class k11 extends ri4 {
    public final byte a;

    public k11(byte b) {
        this.a = b;
    }

    @Override
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((q11) obj).inOutOffset;
            case 1:
                return ((ch6) obj).O;
            default:
                return ((ch6) obj).N;
        }
    }

    @Override
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                q11.access$2400((q11) obj, f);
                return;
            case 1:
                ch6 ch6Var = (ch6) obj;
                ch6Var.O = f;
                ch6Var.invalidate();
                return;
            default:
                ch6 ch6Var2 = (ch6) obj;
                ch6Var2.N = f;
                ch6Var2.invalidate();
                return;
        }
    }
}
