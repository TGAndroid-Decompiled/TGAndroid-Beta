package defpackage;

import org.telegram.messenger.a;
public final class ncb implements dn7, fn7 {
    public final pcb a;

    @Override
    public final String c(int i) {
        return this.a.n[i];
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
        pcb pcbVar = this.a;
        pcbVar.b();
        gba.o1 = i;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", gba.o1).apply();
        pcbVar.invalidate();
        try {
            hn7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
