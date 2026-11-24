package defpackage;

import org.telegram.tgnet.TLRPC;
public final class oza extends ke2 {
    public final boolean[] d1;
    public final xza e1;
    public final qza f1;

    public oza(qza qzaVar, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, boolean[] zArr, xza xzaVar) {
        super(j, j2, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z, null);
        this.f1 = qzaVar;
        this.d1 = zArr;
        this.e1 = xzaVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            xza xzaVar = this.e1;
            if (c41.a(xzaVar)) {
                c41.C(this.f1.a.first_name, xzaVar).j();
            }
        }
    }
}
