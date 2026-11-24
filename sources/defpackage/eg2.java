package defpackage;

import org.telegram.tgnet.TLRPC;
public final class eg2 extends ke2 {
    public final boolean[] d1;
    public final long e1;
    public final wg2 f1;

    public eg2(wg2 wg2Var, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean[] zArr, long j3) {
        super(j, j2, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i, true, false, null);
        this.f1 = wg2Var;
        this.d1 = zArr;
        this.e1 = j3;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            wg2 wg2Var = this.f1;
            if (c41.a(wg2Var)) {
                long j = this.e1;
                if (j > 0) {
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
                    if (W1 != null) {
                        c41.C(W1.first_name, wg2Var).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
                if (L0 != null) {
                    c41.C(L0.title, wg2Var).j();
                }
            }
        }
    }
}
