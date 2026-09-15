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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.w70;
public final class g1 implements Runnable {
    public final int f8352a = 0;
    public final org.telegram.ui.ActionBar.b2 f8353b;
    public final long f8354c;
    public final Context d;
    public final int e;
    public final TLObject f8355f;
    public final Object h;
    public final Object f8356n;
    public final Object f8357r;
    public final Object f8358s;

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, e6 e6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.f8353b = b2Var;
        this.d = context;
        this.e = i10;
        this.f8354c = j3;
        this.f8355f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f8356n = e6Var;
        this.f8357r = tVar;
        this.f8358s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f8352a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f8355f;
                e6 e6Var = (e6) this.f8356n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f8357r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8358s;
                this.f8353b.dismiss();
                new p1(this.d, this.e, this.f8354c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, e6Var, tVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f8353b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                u70 u70Var = (u70) this.f8356n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8357r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f8358s;
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f8355f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        u70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    w70.G = joinaspeers.peers;
                    long j3 = this.f8354c;
                    w70.I = j3;
                    w70.H = SystemClock.elapsedRealtime();
                    w70.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    w70.v(this.d, j3, joinaspeers.peers, n2Var, this.e, peer, u70Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, u70 u70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f8353b = b2Var;
        this.f8355f = tLObject;
        this.h = accountInstance;
        this.f8356n = u70Var;
        this.f8354c = j3;
        this.d = context;
        this.f8357r = n2Var;
        this.e = i10;
        this.f8358s = peer;
    }
}
