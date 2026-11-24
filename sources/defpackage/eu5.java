package defpackage;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class eu5 extends mu1 {
    public boolean vd;
    public final boolean wd;
    public final long xd;
    public final fu5 yd;

    public eu5(fu5 fu5Var, Bundle bundle, boolean z, long j) {
        super(bundle);
        this.yd = fu5Var;
        this.wd = z;
        this.xd = j;
        this.vd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.vd && this.wd) {
            this.vd = true;
            na7 messagesController = getMessagesController();
            long j = this.xd;
            TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
            if (hc2.h(K0)) {
                m21 K = u21.b0(this).K(2131623990, k96.M0(2131748879, null), k96.M0(2131748878, null), new de2(this, j, K0, (byte) 25));
                K.r = false;
                K.k(true);
                return;
            }
            m21 Q = u21.b0(this).Q(2131623990, 36, k96.M0(2131748879, null));
            Q.r = false;
            Q.k(true);
        }
    }

    public final void td(long j, TLRPC.Chat chat) {
        boolean z;
        if (!gl.C1(getParentActivity())) {
            return;
        }
        Activity parentActivity = getParentActivity();
        int i = this.currentAccount;
        long j2 = -j;
        TLRPC.User f = getUserConfig().f();
        if (chat.admin_rights != null) {
            z = true;
        } else {
            z = false;
        }
        wfb.c(parentActivity, i, j2, f, null, z, chat.creator, this.yd.J0);
    }
}
