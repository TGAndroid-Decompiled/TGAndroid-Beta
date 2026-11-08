package hi;

import bi.p5;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ec0;
public final class n extends a8.l1 {
    public final int f14801a;
    public final Object f14802b;

    public n(Object obj, int i7) {
        this.f14801a = i7;
        this.f14802b = obj;
    }

    @Override
    public final void a(int i7, CharSequence charSequence) {
        switch (this.f14801a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                p pVar = (p) this.f14802b;
                p5 p5Var = pVar.f14855j;
                if (p5Var != null) {
                    pVar.f14855j = null;
                    p5Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((ec0) this.f14802b).o(true);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14801a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                return;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((ec0) this.f14802b).o(true);
                return;
        }
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        switch (this.f14801a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                p pVar = (p) this.f14802b;
                p5 p5Var = pVar.f14855j;
                if (p5Var != null) {
                    pVar.f14855j = null;
                    p5Var.a(Boolean.TRUE, uVar);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((ec0) this.f14802b).n(true);
                return;
        }
    }
}
