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
public final class g1 implements Runnable {
    public final int f8351a = 0;
    public final org.telegram.ui.ActionBar.a2 f8352b;
    public final long f8353c;
    public final Context d;
    public final int e;
    public final TLObject f8354f;
    public final Object h;
    public final Object f8355n;
    public final Object f8356r;
    public final Object f8357s;

    public g1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8352b = a2Var;
        this.d = context;
        this.e = i10;
        this.f8353c = j3;
        this.f8354f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f8355n = d6Var;
        this.f8356r = sVar;
        this.f8357s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f8351a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f8354f;
                d6 d6Var = (d6) this.f8355n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f8356r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8357s;
                this.f8352b.dismiss();
                new p1(this.d, this.e, this.f8353c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, d6Var, sVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var = this.f8352b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                i80 i80Var = (i80) this.f8355n;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f8356r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f8357s;
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f8354f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        i80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    k80.G = joinaspeers.peers;
                    long j3 = this.f8353c;
                    k80.I = j3;
                    k80.H = SystemClock.elapsedRealtime();
                    k80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    k80.v(this.d, j3, joinaspeers.peers, m2Var, this.e, peer, i80Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, AccountInstance accountInstance, i80 i80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.f8352b = a2Var;
        this.f8354f = tLObject;
        this.h = accountInstance;
        this.f8355n = i80Var;
        this.f8353c = j3;
        this.d = context;
        this.f8356r = m2Var;
        this.e = i10;
        this.f8357s = peer;
    }
}
