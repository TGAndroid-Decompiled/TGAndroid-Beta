package ki;

import bi.o6;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.qc0;
public final class n extends a8.m1 {
    public final int f18819a;
    public final Object f18820b;

    public n(Object obj, int i7) {
        this.f18819a = i7;
        this.f18820b = obj;
    }

    @Override
    public final void a(int i7, CharSequence charSequence) {
        switch (this.f18819a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                p pVar = (p) this.f18820b;
                o6 o6Var = pVar.f18853j;
                if (o6Var != null) {
                    pVar.f18853j = null;
                    o6Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((qc0) this.f18820b).o(true);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f18819a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                return;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((qc0) this.f18820b).o(true);
                return;
        }
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        switch (this.f18819a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                p pVar = (p) this.f18820b;
                o6 o6Var = pVar.f18853j;
                if (o6Var != null) {
                    pVar.f18853j = null;
                    o6Var.a(Boolean.TRUE, uVar);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((qc0) this.f18820b).n(true);
                return;
        }
    }
}
