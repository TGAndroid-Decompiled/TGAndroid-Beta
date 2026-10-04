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
    public final int f9074a = 0;
    public final org.telegram.ui.ActionBar.b2 f9075b;
    public final long f9076c;
    public final Context d;
    public final int f9077e;
    public final TLObject f9078f;
    public final Object h;
    public final Object f9079n;
    public final Object f9080r;
    public final Object f9081s;

    public h1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9075b = b2Var;
        this.d = context;
        this.f9077e = i10;
        this.f9076c = j3;
        this.f9078f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f9079n = d6Var;
        this.f9080r = sVar;
        this.f9081s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f9074a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f9078f;
                d6 d6Var = (d6) this.f9079n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f9080r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f9081s;
                this.f9075b.dismiss();
                new q1(this.d, this.f9077e, this.f9076c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, d6Var, sVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f9075b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                i80 i80Var = (i80) this.f9079n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9080r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f9081s;
                try {
                    b2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                TLObject tLObject = this.f9078f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        i80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    k80.G = joinaspeers.peers;
                    long j3 = this.f9076c;
                    k80.I = j3;
                    k80.H = SystemClock.elapsedRealtime();
                    k80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    k80.v(this.d, j3, joinaspeers.peers, n2Var, this.f9077e, peer, i80Var);
                    return;
                }
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, i80 i80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f9075b = b2Var;
        this.f9078f = tLObject;
        this.h = accountInstance;
        this.f9079n = i80Var;
        this.f9076c = j3;
        this.d = context;
        this.f9080r = n2Var;
        this.f9077e = i10;
        this.f9081s = peer;
    }
}
