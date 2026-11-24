package defpackage;

import org.telegram.messenger.a;
public final class peb implements hp7, jp7 {
    public final reb a;

    @Override
    public final String c(int i) {
        return this.a.n[i];
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        reb rebVar = this.a;
        rebVar.b();
        gda.n1 = i;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", gda.n1).apply();
        rebVar.invalidate();
        try {
            lp7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
