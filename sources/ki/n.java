package ki;

import bi.r6;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.oc0;
public final class n extends a8.n1 {
    public final int f18888a;
    public final Object f18889b;

    public n(Object obj, int i7) {
        this.f18888a = i7;
        this.f18889b = obj;
    }

    @Override
    public final void a(int i7, CharSequence charSequence) {
        switch (this.f18888a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                p pVar = (p) this.f18889b;
                r6 r6Var = pVar.f18922j;
                if (r6Var != null) {
                    pVar.f18922j = null;
                    r6Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((oc0) this.f18889b).o(true);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f18888a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                return;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((oc0) this.f18889b).o(true);
                return;
        }
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        switch (this.f18888a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                p pVar = (p) this.f18889b;
                r6 r6Var = pVar.f18922j;
                if (r6Var != null) {
                    pVar.f18922j = null;
                    r6Var.a(Boolean.TRUE, uVar);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((oc0) this.f18889b).n(true);
                return;
        }
    }
}
