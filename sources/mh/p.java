package mh;

import org.telegram.messenger.FileLog;
public final class p extends f7.n {
    public final r f18024a;

    public p(r rVar) {
        this.f18024a = rVar;
    }

    @Override
    public final void a(int i9, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i9 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.f18024a;
        bg.y0 y0Var = rVar.f18068j;
        if (y0Var != null) {
            rVar.f18068j = null;
            y0Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        r rVar = this.f18024a;
        bg.y0 y0Var = rVar.f18068j;
        if (y0Var != null) {
            rVar.f18068j = null;
            y0Var.run(Boolean.TRUE, tVar);
        }
    }
}
