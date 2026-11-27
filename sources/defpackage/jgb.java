package defpackage;

import org.telegram.messenger.a;
public final class jgb implements dq7, fq7 {
    public final lgb a;

    @Override
    public final String c(int i) {
        return this.a.n[i];
    }

    @Override
    public final void i(hq7 hq7Var, int i) {
        lgb lgbVar = this.a;
        lgbVar.b();
        xea.n1 = i;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", xea.n1).apply();
        lgbVar.invalidate();
        try {
            hq7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
