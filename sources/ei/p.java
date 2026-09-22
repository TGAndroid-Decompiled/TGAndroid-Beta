package ei;

import org.telegram.messenger.FileLog;
public final class p extends v7.n {
    public final r f8523a;

    public p(r rVar) {
        this.f8523a = rVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.f8523a;
        ai.m0 m0Var = rVar.f8581j;
        if (m0Var != null) {
            rVar.f8581j = null;
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
        r rVar = this.f8523a;
        ai.m0 m0Var = rVar.f8581j;
        if (m0Var != null) {
            rVar.f8581j = null;
            m0Var.run(Boolean.TRUE, sVar);
        }
    }
}
