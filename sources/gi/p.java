package gi;

import ai.r5;
import org.telegram.messenger.FileLog;
public final class p extends v7.l {
    public final r f11399a;

    public p(r rVar) {
        this.f11399a = rVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.f11399a;
        r5 r5Var = rVar.f11442j;
        if (r5Var != null) {
            rVar.f11442j = null;
            r5Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        r rVar = this.f11399a;
        r5 r5Var = rVar.f11442j;
        if (r5Var != null) {
            rVar.f11442j = null;
            r5Var.run(Boolean.TRUE, tVar);
        }
    }
}
