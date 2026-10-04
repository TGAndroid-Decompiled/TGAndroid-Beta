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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k80;
public final class h1 implements Runnable {
    public final int f9073a = 0;
    public final org.telegram.ui.ActionBar.b2 f9074b;
    public final long f9075c;
    public final Context d;
    public final int f9076e;
    public final TLObject f9077f;
    public final Object h;
    public final Object f9078n;
    public final Object f9079r;
    public final Object f9080s;

    public h1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9074b = b2Var;
        this.d = context;
        this.f9076e = i10;
        this.f9075c = j3;
        this.f9077f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f9078n = d6Var;
        this.f9079r = sVar;
        this.f9080s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f9073a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f9077f;
                d6 d6Var = (d6) this.f9078n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f9079r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f9080s;
                this.f9074b.dismiss();
                new q1(this.d, this.f9076e, this.f9075c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, d6Var, sVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f9074b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                i80 i80Var = (i80) this.f9078n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9079r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f9080s;
                try {
                    b2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                TLObject tLObject = this.f9077f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        i80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    k80.G = joinaspeers.peers;
                    long j3 = this.f9075c;
                    k80.I = j3;
                    k80.H = SystemClock.elapsedRealtime();
                    k80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    k80.v(this.d, j3, joinaspeers.peers, n2Var, this.f9076e, peer, i80Var);
                    return;
                }
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, i80 i80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f9074b = b2Var;
        this.f9077f = tLObject;
        this.h = accountInstance;
        this.f9078n = i80Var;
        this.f9075c = j3;
        this.d = context;
        this.f9079r = n2Var;
        this.f9076e = i10;
        this.f9080s = peer;
    }
}
