package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;
public final class la7 implements jac {
    public final byte a = 0;
    public final boolean b;
    public final long c;
    public final jm7 d;
    public final Object e;
    public final Object f;

    public la7(oc7 oc7Var, long j, d dVar, TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights, boolean z) {
        this.d = oc7Var;
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
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) jm7Var;
                d dVar = (d) obj4;
                TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = (TLRPC.TL_messages_editChatDefaultBannedRights) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    oc7Var.getClass();
                    gm.d3(new r77(oc7Var, this.c, (byte) 22), 1000L);
                    return;
                }
                ik.c0(oc7Var.currentAccount, tL_error, dVar, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
                return;
            default:
                rrc rrcVar = (rrc) jm7Var;
                String str = (String) obj4;
                c cVar = (c) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (str2 != null) {
                    rrcVar.e0.setLoading(false);
                    c41.b0(rrcVar).f0(str2, false);
                    return;
                }
                wallettransaction.peer = c.h(rrcVar.f, rrcVar.h, rrcVar.n);
                wallettransaction.comment = str;
                wallettransaction.comment_encrypted = z;
                wallettransaction.date = rrcVar.getConnectionsManager().getCurrentTime();
                gm.t1(rrcVar.I);
                goc.J0(rrcVar.getParentActivity(), rrcVar.getCurrentAccount(), wallettransaction, new jrc(rrcVar, cVar, this.c, (byte) 1), new hrc(rrcVar, (byte) 4), rrcVar.n0(), null, rrcVar.getResourceProvider());
                gm.d3(new frc(rrcVar, (byte) 3), 1000L);
                return;
        }
    }

    public la7(rrc rrcVar, String str, boolean z, c cVar, long j) {
        this.d = rrcVar;
        this.e = str;
        this.b = z;
        this.f = cVar;
        this.c = j;
    }
}
