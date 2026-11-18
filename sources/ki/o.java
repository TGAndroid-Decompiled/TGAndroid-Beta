package ki;

import bi.l6;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.pc0;
public final class o extends a8.m1 {
    public final int f18806a;
    public final Object f18807b;

    public o(Object obj, int i7) {
        this.f18806a = i7;
        this.f18807b = obj;
    }

    @Override
    public final void a(int i7, CharSequence charSequence) {
        switch (this.f18806a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                q qVar = (q) this.f18807b;
                l6 l6Var = qVar.f18840j;
                if (l6Var != null) {
                    qVar.f18840j = null;
                    l6Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((pc0) this.f18807b).o(true);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f18806a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                return;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((pc0) this.f18807b).o(true);
                return;
        }
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        switch (this.f18806a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                q qVar = (q) this.f18807b;
                l6 l6Var = qVar.f18840j;
                if (l6Var != null) {
                    qVar.f18840j = null;
                    l6Var.a(Boolean.TRUE, uVar);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((pc0) this.f18807b).n(true);
                return;
        }
    }
}
