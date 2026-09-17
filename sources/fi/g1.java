package fi;

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
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.w70;
public final class g1 implements Runnable {
    public final int f9710a = 0;
    public final org.telegram.ui.ActionBar.b2 f9711b;
    public final long f9712c;
    public final Context d;
    public final int f9713e;
    public final TLObject f9714f;
    public final Object h;
    public final Object f9715n;
    public final Object f9716r;
    public final Object f9717s;

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, f6 f6Var, org.telegram.ui.web.u uVar, org.telegram.tgnet.e eVar) {
        this.f9711b = b2Var;
        this.d = context;
        this.f9713e = i10;
        this.f9712c = j3;
        this.f9714f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f9715n = f6Var;
        this.f9716r = uVar;
        this.f9717s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f9710a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f9714f;
                f6 f6Var = (f6) this.f9715n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.f9716r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f9717s;
                this.f9711b.dismiss();
                new p1(this.d, this.f9713e, this.f9712c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, f6Var, uVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f9711b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                u70 u70Var = (u70) this.f9715n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9716r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f9717s;
                try {
                    b2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                TLObject tLObject = this.f9714f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        u70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    w70.G = joinaspeers.peers;
                    long j3 = this.f9712c;
                    w70.I = j3;
                    w70.H = SystemClock.elapsedRealtime();
                    w70.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    w70.v(this.d, j3, joinaspeers.peers, n2Var, this.f9713e, peer, u70Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, u70 u70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f9711b = b2Var;
        this.f9714f = tLObject;
        this.h = accountInstance;
        this.f9715n = u70Var;
        this.f9712c = j3;
        this.d = context;
        this.f9716r = n2Var;
        this.f9713e = i10;
        this.f9717s = peer;
    }
}
