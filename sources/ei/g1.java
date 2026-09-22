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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.h80;
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

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.f8357b = b2Var;
        this.d = context;
        this.e = i10;
        this.f8358c = j3;
        this.f8359f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f8360n = f6Var;
        this.f8361r = tVar;
        this.f8362s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f8356a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f8359f;
                f6 f6Var = (f6) this.f8360n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f8361r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8362s;
                this.f8357b.dismiss();
                new p1(this.d, this.e, this.f8358c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, f6Var, tVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f8357b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                f80 f80Var = (f80) this.f8360n;
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
                        f80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    h80.G = joinaspeers.peers;
                    long j3 = this.f8358c;
                    h80.I = j3;
                    h80.H = SystemClock.elapsedRealtime();
                    h80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    h80.v(this.d, j3, joinaspeers.peers, n2Var, this.e, peer, f80Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, f80 f80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f8357b = b2Var;
        this.f8359f = tLObject;
        this.h = accountInstance;
        this.f8360n = f80Var;
        this.f8358c = j3;
        this.d = context;
        this.f8361r = n2Var;
        this.e = i10;
        this.f8362s = peer;
    }
}
