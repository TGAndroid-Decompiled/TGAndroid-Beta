package defpackage;
public final class sp0 extends dqd {
    public final byte a;
    public final Object b;

    public sp0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(int i, CharSequence charSequence) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fc4.b("BotBiometry onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                up0 up0Var = (up0) obj;
                lf2 lf2Var = up0Var.j;
                if (lf2Var != null) {
                    up0Var.j = null;
                    lf2Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                fc4.b("PasscodeView onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                ((by7) obj).o(true);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.a) {
            case 0:
                fc4.b("BotBiometry onAuthenticationFailed");
                return;
            default:
                fc4.b("PasscodeView onAuthenticationFailed");
                ((by7) this.b).o(true);
                return;
        }
    }

    @Override
    public final void c(fk0 fk0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fc4.b("BotBiometry onAuthenticationSucceeded");
                up0 up0Var = (up0) obj;
                lf2 lf2Var = up0Var.j;
                if (lf2Var != null) {
                    up0Var.j = null;
                    lf2Var.a(Boolean.TRUE, fk0Var);
                    return;
                }
                return;
            default:
                fc4.b("PasscodeView onAuthenticationSucceeded");
                ((by7) obj).n(true);
                return;
        }
    }
}
