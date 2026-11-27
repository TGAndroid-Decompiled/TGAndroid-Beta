package defpackage;
public final class tm1 implements pt2 {
    public final byte a;
    public final zu1 b;

    public tm1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                zu1 zu1Var = this.b;
                if (intValue == 0) {
                    zu1Var.A1 = 0;
                    zu1Var.jd(true);
                    zu1Var.getMessagesController().B3(zu1Var.l6, zu1Var.c());
                    return;
                }
                zu1Var.jd(true);
                zu1Var.J(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                int intValue2 = num2.intValue();
                zu1 zu1Var2 = this.b;
                if (intValue2 == 0) {
                    zu1Var2.B1 = 0;
                    zu1Var2.id(true);
                    zu1Var2.getMessagesController().A3(zu1Var2.l6, zu1Var2.c());
                    return;
                }
                int i = zu1Var2.B1 - 1;
                zu1Var2.B1 = i;
                if (i <= 0) {
                    zu1Var2.getMessagesController().A3(zu1Var2.l6, zu1Var2.c());
                }
                zu1Var2.id(true);
                zu1Var2.J(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                zu1 zu1Var3 = this.b;
                zu1Var3.x7 = booleanValue;
                if (!booleanValue) {
                    zu1Var3.N6();
                    return;
                }
                return;
        }
    }
}
