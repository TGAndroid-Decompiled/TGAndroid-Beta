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
    public final int f9682a = 0;
    public final org.telegram.ui.ActionBar.b2 f9683b;
    public final long f9684c;
    public final Context d;
    public final int f9685e;
    public final TLObject f9686f;
    public final Object h;
    public final Object f9687n;
    public final Object f9688r;
    public final Object f9689s;

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, f6 f6Var, org.telegram.ui.web.u uVar, org.telegram.tgnet.e eVar) {
        this.f9683b = b2Var;
        this.d = context;
        this.f9685e = i10;
        this.f9684c = j3;
        this.f9686f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f9687n = f6Var;
        this.f9688r = uVar;
        this.f9689s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f9682a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f9686f;
                f6 f6Var = (f6) this.f9687n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.f9688r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f9689s;
                this.f9683b.dismiss();
                new p1(this.d, this.f9685e, this.f9684c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, f6Var, uVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f9683b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                u70 u70Var = (u70) this.f9687n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9688r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f9689s;
                try {
                    b2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                TLObject tLObject = this.f9686f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        u70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    w70.G = joinaspeers.peers;
                    long j3 = this.f9684c;
                    w70.I = j3;
                    w70.H = SystemClock.elapsedRealtime();
                    w70.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    w70.v(this.d, j3, joinaspeers.peers, n2Var, this.f9685e, peer, u70Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, u70 u70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f9683b = b2Var;
        this.f9686f = tLObject;
        this.h = accountInstance;
        this.f9687n = u70Var;
        this.f9684c = j3;
        this.d = context;
        this.f9688r = n2Var;
        this.f9685e = i10;
        this.f9689s = peer;
    }
}
