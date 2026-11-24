package defpackage;
public final class sm1 implements vs2 {
    public final byte a;
    public final mu1 b;

    public sm1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                mu1 mu1Var = this.b;
                if (intValue == 0) {
                    mu1Var.A1 = 0;
                    mu1Var.Xc(true);
                    mu1Var.getMessagesController().v3(mu1Var.l6, mu1Var.d());
                    return;
                }
                mu1Var.Xc(true);
                mu1Var.J(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                int intValue2 = num2.intValue();
                mu1 mu1Var2 = this.b;
                if (intValue2 == 0) {
                    mu1Var2.B1 = 0;
                    mu1Var2.Wc(true);
                    mu1Var2.getMessagesController().u3(mu1Var2.l6, mu1Var2.d());
                    return;
                }
                int i = mu1Var2.B1 - 1;
                mu1Var2.B1 = i;
                if (i <= 0) {
                    mu1Var2.getMessagesController().u3(mu1Var2.l6, mu1Var2.d());
                }
                mu1Var2.Wc(true);
                mu1Var2.J(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mu1 mu1Var3 = this.b;
                mu1Var3.x7 = booleanValue;
                if (!booleanValue) {
                    mu1Var3.G6();
                    return;
                }
                return;
        }
    }
}
