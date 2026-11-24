package defpackage;
public final class io1 implements gu2 {
    public final byte a;
    public final yv1 b;

    public io1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                yv1 yv1Var = this.b;
                if (intValue == 0) {
                    yv1Var.A1 = 0;
                    yv1Var.jd(true);
                    yv1Var.getMessagesController().x3(yv1Var.l6, yv1Var.d());
                    return;
                }
                yv1Var.jd(true);
                yv1Var.J(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                int intValue2 = num2.intValue();
                yv1 yv1Var2 = this.b;
                if (intValue2 == 0) {
                    yv1Var2.B1 = 0;
                    yv1Var2.id(true);
                    yv1Var2.getMessagesController().w3(yv1Var2.l6, yv1Var2.d());
                    return;
                }
                int i = yv1Var2.B1 - 1;
                yv1Var2.B1 = i;
                if (i <= 0) {
                    yv1Var2.getMessagesController().w3(yv1Var2.l6, yv1Var2.d());
                }
                yv1Var2.id(true);
                yv1Var2.J(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                yv1 yv1Var3 = this.b;
                yv1Var3.x7 = booleanValue;
                if (!booleanValue) {
                    yv1Var3.N6();
                    return;
                }
                return;
        }
    }
}
