package defpackage;
public final class pm1 implements i8c {
    public final byte a;
    public final mu1 b;
    public final String c;

    public pm1(mu1 mu1Var, String str, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        mu1 mu1Var = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        mu1Var.getClass();
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        mu1Var.getMessagesController().m(str, false);
                    }
                    mu1Var.getParentActivity();
                    d01.o(str);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        mu1Var.getMessagesController().m(str, true);
                    }
                    d01.n(mu1Var.getParentActivity(), str, false, null);
                    return;
                }
                return;
        }
    }
}
