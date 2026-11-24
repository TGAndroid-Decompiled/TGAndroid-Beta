package defpackage;
public final class so0 extends aod {
    public final byte a;
    public final Object b;

    public so0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(int i, CharSequence charSequence) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fa4.b("BotBiometry onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                uo0 uo0Var = (uo0) obj;
                ae2 ae2Var = uo0Var.j;
                if (ae2Var != null) {
                    uo0Var.j = null;
                    ae2Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                fa4.b("PasscodeView onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                ((yv7) obj).o(true);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.a) {
            case 0:
                fa4.b("BotBiometry onAuthenticationFailed");
                return;
            default:
                fa4.b("PasscodeView onAuthenticationFailed");
                ((yv7) this.b).o(true);
                return;
        }
    }

    @Override
    public final void c(fj0 fj0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fa4.b("BotBiometry onAuthenticationSucceeded");
                uo0 uo0Var = (uo0) obj;
                ae2 ae2Var = uo0Var.j;
                if (ae2Var != null) {
                    uo0Var.j = null;
                    ae2Var.a(Boolean.TRUE, fj0Var);
                    return;
                }
                return;
            default:
                fa4.b("PasscodeView onAuthenticationSucceeded");
                ((yv7) obj).n(true);
                return;
        }
    }
}
