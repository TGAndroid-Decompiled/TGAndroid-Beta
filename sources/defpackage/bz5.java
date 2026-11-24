package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class bz5 implements p8c {
    public final byte a;
    public final LaunchActivity b;

    public bz5(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override
    public final void a(Object obj) {
        d lastFragment;
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = LaunchActivity.C1;
                if (launchActivity.p0 != null && booleanValue && e66.c() < 100 && (lastFragment = launchActivity.p0.getLastFragment()) != null && !(lastFragment instanceof m66)) {
                    int b2 = e66.b();
                    u21 b0 = u21.b0(lastFragment);
                    ch0 ch0Var = new ch0(b2 / 100.0f, lastFragment.getThemedColor(bkb.X5));
                    String M0 = k96.M0(2131748523, null);
                    String a0 = k96.a0("LowPowerEnabledSubtitle", null, 2131748524, String.format("%d%%", Integer.valueOf(b2)));
                    String M02 = k96.M0(2131751423, null);
                    rx5 rx5Var = new rx5(launchActivity, (byte) 11);
                    b0.getClass();
                    Context X = b0.X();
                    wjb wjbVar = b0.c;
                    j21 j21Var = new j21(X, wjbVar);
                    j21Var.a.setImageDrawable(ch0Var);
                    j21Var.b.setText(M0);
                    j21Var.c.setText(a0);
                    k21 k21Var = new k21(wjbVar, b0.X(), true);
                    k21Var.e(M02);
                    k21Var.b = rx5Var;
                    j21Var.setButton(k21Var);
                    m21 b3 = b0.b(j21Var, 2750);
                    b3.j = 5000;
                    b3.j();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str2 = LaunchActivity.C1;
                na7.q1(launchActivity.P).z3(null, user, null, 0, null, false, false);
                return;
        }
    }
}
