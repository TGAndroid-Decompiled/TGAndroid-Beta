package defpackage;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class dw5 extends yv1 {
    public boolean Gd;
    public final boolean Hd;
    public final long Id;
    public final ew5 Jd;

    public dw5(ew5 ew5Var, Bundle bundle, boolean z, long j) {
        super(bundle);
        this.Jd = ew5Var;
        this.Hd = z;
        this.Id = j;
        this.Gd = false;
    }

    public final void Hd(long j, TLRPC.Chat chat) {
        boolean z;
        if (!gm.C1(getParentActivity())) {
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
        xhb.c(parentActivity, i, j2, f, null, z, chat.creator, this.Jd.J0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Gd && this.Hd) {
            this.Gd = true;
            oc7 messagesController = getMessagesController();
            long j = this.Id;
            TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
            if (sd2.h(L0)) {
                u31 K = c41.b0(this).K(2131623990, jb6.M0(2131748828, null), jb6.M0(2131748827, null), new of2(this, j, L0, (byte) 25));
                K.s = false;
                K.k(true);
                return;
            }
            u31 Q = c41.b0(this).Q(2131623990, 36, jb6.M0(2131748828, null));
            Q.s = false;
            Q.k(true);
        }
    }
}
