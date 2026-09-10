package di;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.f80;
public final class j1 implements Runnable {
    public final int f6693a = 0;
    public final org.telegram.ui.ActionBar.d2 f6694b;
    public final long f6695c;
    public final Context d;
    public final int e;
    public final TLObject f6696f;
    public final Object h;
    public final Object f6697n;
    public final Object f6698r;
    public final Object f6699s;

    public j1(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.g gVar) {
        this.f6694b = d2Var;
        this.d = context;
        this.e = i10;
        this.f6695c = j3;
        this.f6696f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f6697n = f6Var;
        this.f6698r = tVar;
        this.f6699s = gVar;
    }

    @Override
    public final void run() {
        switch (this.f6693a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f6696f;
                f6 f6Var = (f6) this.f6697n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f6698r;
                org.telegram.tgnet.g gVar = (org.telegram.tgnet.g) this.f6699s;
                this.f6694b.dismiss();
                new s1(this.d, this.e, this.f6695c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, f6Var, tVar, gVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = this.f6694b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                d80 d80Var = (d80) this.f6697n;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f6698r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f6699s;
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f6696f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        d80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    f80.G = joinaspeers.peers;
                    long j3 = this.f6695c;
                    f80.I = j3;
                    f80.H = SystemClock.elapsedRealtime();
                    f80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    f80.v(this.d, j3, joinaspeers.peers, p2Var, this.e, peer, d80Var);
                    return;
                }
                return;
        }
    }

    public j1(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, AccountInstance accountInstance, d80 d80Var, long j3, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.f6694b = d2Var;
        this.f6696f = tLObject;
        this.h = accountInstance;
        this.f6697n = d80Var;
        this.f6695c = j3;
        this.d = context;
        this.f6698r = p2Var;
        this.e = i10;
        this.f6699s = peer;
    }
}
