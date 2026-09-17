package fi;

import org.telegram.messenger.FileLog;
public final class q extends v7.n {
    public final s f9918a;

    public q(s sVar) {
        this.f9918a = sVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        s sVar = this.f9918a;
        bi.f0 f0Var = sVar.f9973j;
        if (f0Var != null) {
            sVar.f9973j = null;
            f0Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        s sVar = this.f9918a;
        bi.f0 f0Var = sVar.f9973j;
        if (f0Var != null) {
            sVar.f9973j = null;
            f0Var.run(Boolean.TRUE, tVar);
        }
    }
}
