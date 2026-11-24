package defpackage;
public final class s21 extends vk4 {
    public final byte a;

    public s21(byte b) {
        this.a = b;
    }

    @Override
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((y21) obj).inOutOffset;
            case 1:
                return ((ej6) obj).O;
            default:
                return ((ej6) obj).N;
        }
    }

    @Override
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                y21.access$2400((y21) obj, f);
                return;
            case 1:
                ej6 ej6Var = (ej6) obj;
                ej6Var.O = f;
                ej6Var.invalidate();
                return;
            default:
                ej6 ej6Var2 = (ej6) obj;
                ej6Var2.N = f;
                ej6Var2.invalidate();
                return;
        }
    }
}
