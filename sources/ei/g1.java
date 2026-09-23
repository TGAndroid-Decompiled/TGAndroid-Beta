package ei;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.x70;
public final class g1 implements Runnable {
    public final int f8340a = 0;
    public final org.telegram.ui.ActionBar.b2 f8341b;
    public final long f8342c;
    public final Context d;
    public final int e;
    public final TLObject f8343f;
    public final Object h;
    public final Object f8344n;
    public final Object f8345r;
    public final Object f8346s;

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8341b = b2Var;
        this.d = context;
        this.e = i10;
        this.f8342c = j3;
        this.f8343f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f8344n = d6Var;
        this.f8345r = sVar;
        this.f8346s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f8340a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f8343f;
                d6 d6Var = (d6) this.f8344n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f8345r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8346s;
                this.f8341b.dismiss();
                new p1(this.d, this.e, this.f8342c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, d6Var, sVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f8341b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                v70 v70Var = (v70) this.f8344n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8345r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f8346s;
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f8343f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        v70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    x70.G = joinaspeers.peers;
                    long j3 = this.f8342c;
                    x70.I = j3;
                    x70.H = SystemClock.elapsedRealtime();
                    x70.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    x70.v(this.d, j3, joinaspeers.peers, n2Var, this.e, peer, v70Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, v70 v70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f8341b = b2Var;
        this.f8343f = tLObject;
        this.h = accountInstance;
        this.f8344n = v70Var;
        this.f8342c = j3;
        this.d = context;
        this.f8345r = n2Var;
        this.e = i10;
        this.f8346s = peer;
    }
}
