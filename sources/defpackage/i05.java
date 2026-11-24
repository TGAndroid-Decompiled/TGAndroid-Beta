package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class i05 implements k8c {
    public final c a;
    public final hn1 b;
    public final z3a c;
    public final k27 d;
    public final TL_wallet.walletTransaction e;
    public final String f;
    public final b g;
    public final long h;
    public final TLRPC.User i;

    public i05(c cVar, hn1 hn1Var, z3a z3aVar, k27 k27Var, TL_wallet.walletTransaction wallettransaction, String str, b bVar, long j, TLRPC.User user) {
        this.a = cVar;
        this.b = hn1Var;
        this.c = z3aVar;
        this.d = k27Var;
        this.e = wallettransaction;
        this.f = str;
        this.g = bVar;
        this.h = j;
        this.i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        c cVar = this.a;
        int i = cVar.a;
        hn1 hn1Var = this.b;
        z3a z3aVar = this.c;
        k27 k27Var = this.d;
        if (sendtransfer == null) {
            hn1Var.run();
            z3aVar.k(k27Var, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            c.m("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        boolean z = true;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (c.b(cVar.x(), this.f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z2 = wallettransaction.comment_encrypted;
        if (k27Var != null) {
            TLRPC.MessageAction messageAction = k27Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z2;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                k27Var.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(k27Var.k);
                z3aVar.getMessagesStorage().g1(arrayList, false, true, false, 0, false, 0, 0L);
                z3aVar.getNotificationCenter().k(kk7.l0, Long.valueOf(k27.B0(k27Var.k)), tb4.t(k27Var));
            }
        }
        if (sendtransfer.data_gasless == null) {
            z = false;
        }
        wallettransaction.gasless = z;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        b bVar = this.g;
        bVar.k();
        bVar.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = na7.q1(i).o1(this.i);
        cVar.Z();
        c.O("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i).sendRequestTyped(sendtransfer, new hc((byte) 0), new jl1(cVar, wallettransaction, z3aVar, k27Var, hn1Var, (byte) 4));
    }
}
