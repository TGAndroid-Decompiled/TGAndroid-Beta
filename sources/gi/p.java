package gi;

import ai.q5;
import org.telegram.messenger.FileLog;
public final class p extends v7.l {
    public final r f11375a;

    public p(r rVar) {
        this.f11375a = rVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.f11375a;
        q5 q5Var = rVar.f11417j;
        if (q5Var != null) {
            rVar.f11417j = null;
            q5Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        r rVar = this.f11375a;
        q5 q5Var = rVar.f11417j;
        if (q5Var != null) {
            rVar.f11417j = null;
            q5Var.run(Boolean.TRUE, tVar);
        }
    }
}
