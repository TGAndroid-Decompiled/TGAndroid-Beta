package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;
public final class k87 implements i8c {
    public final byte a = 0;
    public final boolean b;
    public final long c;
    public final gk7 d;
    public final Object e;
    public final Object f;

    public k87(na7 na7Var, long j, d dVar, TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights, boolean z) {
        this.d = na7Var;
        this.c = j;
        this.e = dVar;
        this.f = tL_messages_editChatDefaultBannedRights;
        this.b = z;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        boolean z = this.b;
        Object obj4 = this.e;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                na7 na7Var = (na7) gk7Var;
                d dVar = (d) obj4;
                TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = (TLRPC.TL_messages_editChatDefaultBannedRights) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    na7Var.getClass();
                    gl.e3(new r57(na7Var, this.c, (byte) 21), 1000L);
                    return;
                }
                ij.c0(na7Var.currentAccount, tL_error, dVar, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
                return;
            default:
                qpc qpcVar = (qpc) gk7Var;
                String str = (String) obj4;
                c cVar = (c) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (str2 != null) {
                    qpcVar.e0.setLoading(false);
                    u21.b0(qpcVar).f0(str2, false);
                    return;
                }
                wallettransaction.peer = c.h(qpcVar.f, qpcVar.h, qpcVar.n);
                wallettransaction.comment = str;
                wallettransaction.comment_encrypted = z;
                wallettransaction.date = qpcVar.getConnectionsManager().getCurrentTime();
                gl.t1(qpcVar.I);
                hmc.I0(qpcVar.getParentActivity(), qpcVar.getCurrentAccount(), wallettransaction, new hpc(qpcVar, cVar, this.c, (byte) 1), new fpc(qpcVar, (byte) 4), qpcVar.m0(), null, qpcVar.getResourceProvider());
                gl.e3(new dpc(qpcVar, (byte) 3), 1000L);
                return;
        }
    }

    public k87(qpc qpcVar, String str, boolean z, c cVar, long j) {
        this.d = qpcVar;
        this.e = str;
        this.b = z;
        this.f = cVar;
        this.c = j;
    }
}
