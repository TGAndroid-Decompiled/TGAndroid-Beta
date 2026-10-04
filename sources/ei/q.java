package ei;

import org.telegram.messenger.FileLog;
public final class q extends v7.o {
    public final s f9258a;

    public q(s sVar) {
        this.f9258a = sVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        s sVar = this.f9258a;
        ai.m0 m0Var = sVar.f9321j;
        if (m0Var != null) {
            sVar.f9321j = null;
            m0Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        s sVar2 = this.f9258a;
        ai.m0 m0Var = sVar2.f9321j;
        if (m0Var != null) {
            sVar2.f9321j = null;
            m0Var.run(Boolean.TRUE, sVar);
        }
    }
}
