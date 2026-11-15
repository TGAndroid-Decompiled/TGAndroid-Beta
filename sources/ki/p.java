package ki;

import org.telegram.messenger.a8;
import org.telegram.ui.Components.fc0;
public final class p extends a8.m1 {
    public final int f18485a;
    public final Object f18486b;

    public p(Object obj, int i7) {
        this.f18485a = i7;
        this.f18486b = obj;
    }

    @Override
    public final void a(int i7, CharSequence charSequence) {
        switch (this.f18485a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                r rVar = (r) this.f18486b;
                bi.e4 e4Var = rVar.f18521j;
                if (e4Var != null) {
                    rVar.f18521j = null;
                    e4Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((fc0) this.f18486b).o(true);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f18485a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                return;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((fc0) this.f18486b).o(true);
                return;
        }
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        switch (this.f18485a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                r rVar = (r) this.f18486b;
                bi.e4 e4Var = rVar.f18521j;
                if (e4Var != null) {
                    rVar.f18521j = null;
                    e4Var.a(Boolean.TRUE, uVar);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((fc0) this.f18486b).n(true);
                return;
        }
    }
}
