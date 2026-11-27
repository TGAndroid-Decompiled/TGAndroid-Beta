package defpackage;
public final class t11 extends vk4 {
    public final byte a;

    public t11(byte b) {
        this.a = b;
    }

    @Override
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((z11) obj).inOutOffset;
            case 1:
                return ((hj6) obj).O;
            default:
                return ((hj6) obj).N;
        }
    }

    @Override
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                z11.b((z11) obj, f);
                return;
            case 1:
                hj6 hj6Var = (hj6) obj;
                hj6Var.O = f;
                hj6Var.invalidate();
                return;
            default:
                hj6 hj6Var2 = (hj6) obj;
                hj6Var2.N = f;
                hj6Var2.invalidate();
                return;
        }
    }
}
