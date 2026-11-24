package defpackage;

import org.telegram.tgnet.TLRPC;
public final class lxa extends zc2 {
    public final boolean[] d1;
    public final uxa e1;
    public final nxa f1;

    public lxa(nxa nxaVar, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, boolean[] zArr, uxa uxaVar) {
        super(j, j2, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z, null);
        this.f1 = nxaVar;
        this.d1 = zArr;
        this.e1 = uxaVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            uxa uxaVar = this.e1;
            if (u21.a(uxaVar)) {
                u21.C(this.f1.a.first_name, uxaVar).j();
            }
        }
    }
}
