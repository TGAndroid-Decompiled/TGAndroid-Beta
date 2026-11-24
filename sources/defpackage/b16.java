package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class b16 implements qac {
    public final byte a;
    public final LaunchActivity b;

    public b16(LaunchActivity launchActivity, byte b) {
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
                if (launchActivity.p0 != null && booleanValue && e86.c() < 100 && (lastFragment = launchActivity.p0.getLastFragment()) != null && !(lastFragment instanceof m86)) {
                    int b2 = e86.b();
                    c41 b0 = c41.b0(lastFragment);
                    ci0 ci0Var = new ci0(b2 / 100.0f, lastFragment.getThemedColor(cmb.X5));
                    String M0 = jb6.M0(2131748472, null);
                    String a0 = jb6.a0("LowPowerEnabledSubtitle", null, 2131748473, String.format("%d%%", Integer.valueOf(b2)));
                    String M02 = jb6.M0(2131751372, null);
                    rz5 rz5Var = new rz5(launchActivity, (byte) 11);
                    b0.getClass();
                    Context X = b0.X();
                    ylb ylbVar = b0.c;
                    r31 r31Var = new r31(X, ylbVar);
                    r31Var.a.setImageDrawable(ci0Var);
                    r31Var.b.setText(M0);
                    r31Var.c.setText(a0);
                    s31 s31Var = new s31(ylbVar, b0.X(), true);
                    s31Var.e(M02);
                    s31Var.b = rz5Var;
                    r31Var.setButton(s31Var);
                    u31 b3 = b0.b(r31Var, 2750);
                    b3.j = 5000;
                    b3.j();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str2 = LaunchActivity.C1;
                oc7.r1(launchActivity.P).B3(null, user, null, 0, null, false, false);
                return;
        }
    }
}
