package defpackage;
public final class eo1 implements jac {
    public final byte a;
    public final yv1 b;
    public final String c;
    public final tv0 d;

    public eo1(byte b, tv0 tv0Var, yv1 yv1Var, String str) {
        this.a = b;
        this.b = yv1Var;
        this.c = str;
        this.d = tv0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        tv0 tv0Var = this.d;
        String str = this.c;
        yv1 yv1Var = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        yv1Var.getClass();
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        yv1Var.getMessagesController().m(str, false);
                    }
                    tv0Var.run();
                    yv1Var.getParentActivity();
                    l11.p(str);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        yv1Var.getMessagesController().m(str, true);
                    }
                    tv0Var.run();
                    l11.o(yv1Var.getParentActivity(), str, false, null);
                    return;
                }
                return;
        }
    }
}
