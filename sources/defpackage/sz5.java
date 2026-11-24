package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class sz5 implements ca7 {
    public final kz5 a;
    public final boolean[] b;
    public final Bundle c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public sz5(LaunchActivity launchActivity, kz5 kz5Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.a = kz5Var;
        this.b = zArr;
        this.c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            ij.r0((d) b00.f(1, launchActivity.e0), null, k96.M0(2131748883, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void m(boolean z) {
        try {
            this.a.run();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (this.b[0]) {
            return;
        }
        mu1 mu1Var = new mu1(this.c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            mu1Var.c6 = chatInvite;
        }
        ((ActionBarLayout) this.e.N()).S(mu1Var);
    }
}
