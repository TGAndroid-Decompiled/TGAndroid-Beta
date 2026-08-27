package nh;

import org.telegram.messenger.FileLog;

public final class o extends e7.t {

    public final q f18849b;

    public o(q qVar) {
        this.f18849b = qVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        q qVar = this.f18849b;
        cg.u0 u0Var = qVar.f18894j;
        if (u0Var != null) {
            qVar.f18894j = null;
            u0Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        q qVar = this.f18849b;
        cg.u0 u0Var = qVar.f18894j;
        if (u0Var != null) {
            qVar.f18894j = null;
            u0Var.run(Boolean.TRUE, tVar);
        }
    }
}
