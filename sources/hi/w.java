package hi;

import bi.m5;
import org.telegram.messenger.FileLog;
public final class w extends a8.a1 {
    public final y f13340a;

    public w(y yVar) {
        this.f13340a = yVar;
    }

    @Override
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        y yVar = this.f13340a;
        m5 m5Var = yVar.f13371j;
        if (m5Var != null) {
            yVar.f13371j = null;
            m5Var.run(Boolean.FALSE, null);
        }
    }

    @Override
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        y yVar = this.f13340a;
        m5 m5Var = yVar.f13371j;
        if (m5Var != null) {
            yVar.f13371j = null;
            m5Var.run(Boolean.TRUE, sVar);
        }
    }
}
