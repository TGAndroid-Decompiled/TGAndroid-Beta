package defpackage;
public final class hn1 implements icc {
    public final byte a;
    public final zu1 b;
    public final String c;
    public final tu0 d;

    public hn1(byte b, tu0 tu0Var, zu1 zu1Var, String str) {
        this.a = b;
        this.b = zu1Var;
        this.c = str;
        this.d = tu0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        tu0 tu0Var = this.d;
        String str = this.c;
        zu1 zu1Var = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        zu1Var.getClass();
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        zu1Var.getMessagesController().m(str, true);
                    }
                    tu0Var.run();
                    m01.o(zu1Var.getParentActivity(), str, false, null);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        zu1Var.getMessagesController().m(str, false);
                    }
                    tu0Var.run();
                    zu1Var.getParentActivity();
                    m01.p(str);
                    return;
                }
                return;
        }
    }
}
