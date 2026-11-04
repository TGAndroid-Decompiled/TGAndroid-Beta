package ii;

import org.telegram.messenger.a8;
import org.telegram.ui.Components.zb0;
public final class p extends b8.l0 {
    public final int f15133a;
    public final Object f15134b;

    public p(Object obj, int i3) {
        this.f15133a = i3;
        this.f15134b = obj;
    }

    @Override
    public final void a(int i3, CharSequence charSequence) {
        switch (this.f15133a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i3 + " \"" + ((Object) charSequence) + "\"");
                r rVar = (r) this.f15134b;
                ai.q4 q4Var = rVar.f15189j;
                if (q4Var != null) {
                    rVar.f15189j = null;
                    q4Var.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationError " + i3 + " \"" + ((Object) charSequence) + "\"");
                ((zb0) this.f15134b).o(true);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f15133a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                return;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((zb0) this.f15134b).o(true);
                return;
        }
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        switch (this.f15133a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                r rVar = (r) this.f15134b;
                ai.q4 q4Var = rVar.f15189j;
                if (q4Var != null) {
                    rVar.f15189j = null;
                    q4Var.a(Boolean.TRUE, uVar);
                    return;
                }
                return;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((zb0) this.f15134b).n(true);
                return;
        }
    }
}
