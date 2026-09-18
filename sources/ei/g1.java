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
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.f80;
public final class g1 implements Runnable {
    public final int f8356a = 0;
    public final org.telegram.ui.ActionBar.b2 f8357b;
    public final long f8358c;
    public final Context d;
    public final int e;
    public final TLObject f8359f;
    public final Object h;
    public final Object f8360n;
    public final Object f8361r;
    public final Object f8362s;

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, e6 e6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.f8357b = b2Var;
        this.d = context;
        this.e = i10;
        this.f8358c = j3;
        this.f8359f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f8360n = e6Var;
        this.f8361r = tVar;
        this.f8362s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f8356a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f8359f;
                e6 e6Var = (e6) this.f8360n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f8361r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8362s;
                this.f8357b.dismiss();
                new p1(this.d, this.e, this.f8358c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, e6Var, tVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f8357b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                d80 d80Var = (d80) this.f8360n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8361r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f8362s;
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f8359f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        d80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    f80.G = joinaspeers.peers;
                    long j3 = this.f8358c;
                    f80.I = j3;
                    f80.H = SystemClock.elapsedRealtime();
                    f80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    f80.v(this.d, j3, joinaspeers.peers, n2Var, this.e, peer, d80Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, d80 d80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f8357b = b2Var;
        this.f8359f = tLObject;
        this.h = accountInstance;
        this.f8360n = d80Var;
        this.f8358c = j3;
        this.d = context;
        this.f8361r = n2Var;
        this.e = i10;
        this.f8362s = peer;
    }
}
