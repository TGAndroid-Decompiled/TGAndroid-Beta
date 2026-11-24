package defpackage;

import org.telegram.tgnet.TLRPC;
public final class se2 extends zc2 {
    public final boolean[] d1;
    public final long e1;
    public final kf2 f1;

    public se2(kf2 kf2Var, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean[] zArr, long j3) {
        super(j, j2, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i, true, false, null);
        this.f1 = kf2Var;
        this.d1 = zArr;
        this.e1 = j3;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            kf2 kf2Var = this.f1;
            if (u21.a(kf2Var)) {
                long j = this.e1;
                if (j > 0) {
                    TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
                    if (V1 != null) {
                        u21.C(V1.first_name, kf2Var).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
                if (K0 != null) {
                    u21.C(K0.title, kf2Var).j();
                }
            }
        }
    }
}
