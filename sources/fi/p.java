package fi;

import org.telegram.messenger.FileLog;
public final class p extends v7.l {
    public final r f9459a;

    public p(r rVar) {
        this.f9459a = rVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.f9459a;
        bi.f0 f0Var = rVar.f9509j;
        if (f0Var != null) {
            rVar.f9509j = null;
            f0Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        r rVar = this.f9459a;
        bi.f0 f0Var = rVar.f9509j;
        if (f0Var != null) {
            rVar.f9509j = null;
            f0Var.run(Boolean.TRUE, uVar);
        }
    }
}
