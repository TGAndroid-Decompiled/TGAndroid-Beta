package defpackage;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class eu5 extends mu1 {
    public boolean wd;
    public final boolean xd;
    public final long yd;
    public final fu5 zd;

    public eu5(fu5 fu5Var, Bundle bundle, boolean z, long j) {
        super(bundle);
        this.zd = fu5Var;
        this.xd = z;
        this.yd = j;
        this.wd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.wd && this.xd) {
            this.wd = true;
            na7 messagesController = getMessagesController();
            long j = this.yd;
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

    public final void vd(long j, TLRPC.Chat chat) {
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
        wfb.c(parentActivity, i, j2, f, null, z, chat.creator, this.zd.J0);
    }
}
