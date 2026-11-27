package defpackage;

import org.telegram.tgnet.TLRPC;
public final class n1b extends pd2 {
    public final boolean[] d1;
    public final w1b e1;
    public final p1b f1;

    public n1b(p1b p1bVar, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, boolean[] zArr, w1b w1bVar) {
        super(j, j2, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z, null);
        this.f1 = p1bVar;
        this.d1 = zArr;
        this.e1 = w1bVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            w1b w1bVar = this.e1;
            if (d31.a(w1bVar)) {
                d31.C(this.f1.a.first_name, w1bVar).j();
            }
        }
    }
}
