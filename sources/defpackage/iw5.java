package defpackage;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class iw5 extends zu1 {
    public boolean Jd;
    public final boolean Kd;
    public final long Ld;
    public final jw5 Md;

    public iw5(jw5 jw5Var, Bundle bundle, boolean z, long j) {
        super(bundle);
        this.Md = jw5Var;
        this.Kd = z;
        this.Ld = j;
        this.Jd = false;
    }

    public final void Hd(long j, TLRPC.Chat chat) {
        boolean z;
        if (!hl.C1(getParentActivity())) {
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
        sjb.c(parentActivity, i, j2, f, null, z, chat.creator, this.Md.J0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Jd && this.Kd) {
            this.Jd = true;
            uc7 messagesController = getMessagesController();
            long j = this.Ld;
            TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
            if (xc2.h(M0)) {
                v21 K = d31.b0(this).K(2131623990, ob6.M0(2131748825, null), ob6.M0(2131748824, null), new ue2(this, j, M0, (byte) 25));
                K.s = false;
                K.k(true);
                return;
            }
            v21 Q = d31.b0(this).Q(2131623990, 36, ob6.M0(2131748825, null));
            Q.s = false;
            Q.k(true);
        }
    }
}
