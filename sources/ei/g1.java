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
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.h80;
public final class g1 implements Runnable {
    public final int f8339a = 0;
    public final org.telegram.ui.ActionBar.a2 f8340b;
    public final long f8341c;
    public final Context d;
    public final int e;
    public final TLObject f8342f;
    public final Object h;
    public final Object f8343n;
    public final Object f8344r;
    public final Object f8345s;

    public g1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8340b = a2Var;
        this.d = context;
        this.e = i10;
        this.f8341c = j3;
        this.f8342f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f8343n = d6Var;
        this.f8344r = sVar;
        this.f8345s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f8339a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f8342f;
                d6 d6Var = (d6) this.f8343n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f8344r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8345s;
                this.f8340b.dismiss();
                new p1(this.d, this.e, this.f8341c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, d6Var, sVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var = this.f8340b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                f80 f80Var = (f80) this.f8343n;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f8344r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f8345s;
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f8342f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        f80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    h80.G = joinaspeers.peers;
                    long j3 = this.f8341c;
                    h80.I = j3;
                    h80.H = SystemClock.elapsedRealtime();
                    h80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    h80.v(this.d, j3, joinaspeers.peers, m2Var, this.e, peer, f80Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, AccountInstance accountInstance, f80 f80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.f8340b = a2Var;
        this.f8342f = tLObject;
        this.h = accountInstance;
        this.f8343n = f80Var;
        this.f8341c = j3;
        this.d = context;
        this.f8344r = m2Var;
        this.e = i10;
        this.f8345s = peer;
    }
}
