package di;

import bi.k6;
import org.telegram.messenger.FileLog;
public final class s extends v7.n {
    public final u f6882a;

    public s(u uVar) {
        this.f6882a = uVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        u uVar = this.f6882a;
        k6 k6Var = uVar.f6934j;
        if (k6Var != null) {
            uVar.f6934j = null;
            k6Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        u uVar = this.f6882a;
        k6 k6Var = uVar.f6934j;
        if (k6Var != null) {
            uVar.f6934j = null;
            k6Var.run(Boolean.TRUE, tVar);
        }
    }
}
