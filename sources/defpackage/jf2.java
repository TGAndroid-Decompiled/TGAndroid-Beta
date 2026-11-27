package defpackage;

import org.telegram.tgnet.TLRPC;
public final class jf2 extends pd2 {
    public final boolean[] d1;
    public final long e1;
    public final bg2 f1;

    public jf2(bg2 bg2Var, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean[] zArr, long j3) {
        super(j, j2, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i, true, false, null);
        this.f1 = bg2Var;
        this.d1 = zArr;
        this.e1 = j3;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            bg2 bg2Var = this.f1;
            if (d31.a(bg2Var)) {
                long j = this.e1;
                if (j > 0) {
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
                    if (X1 != null) {
                        d31.C(X1.first_name, bg2Var).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
                if (M0 != null) {
                    d31.C(M0.title, bg2Var).j();
                }
            }
        }
    }
}
