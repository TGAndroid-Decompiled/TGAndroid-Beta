package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class s16 implements dc7 {
    public final k16 a;
    public final boolean[] b;
    public final Bundle c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public s16(LaunchActivity launchActivity, k16 k16Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.a = k16Var;
        this.b = zArr;
        this.c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            ik.r0((d) b10.f(1, launchActivity.e0), null, jb6.M0(2131748832, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void l(boolean z) {
        try {
            this.a.run();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (this.b[0]) {
            return;
        }
        yv1 yv1Var = new yv1(this.c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            yv1Var.c6 = chatInvite;
        }
        ((ActionBarLayout) this.e.N()).S(yv1Var);
    }
}
