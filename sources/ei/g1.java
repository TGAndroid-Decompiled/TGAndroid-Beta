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
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;
public final class g1 implements Runnable {
    public final int f8341a = 0;
    public final org.telegram.ui.ActionBar.c2 f8342b;
    public final long f8343c;
    public final Context d;
    public final int e;
    public final TLObject f8344f;
    public final Object h;
    public final Object f8345n;
    public final Object f8346r;
    public final Object f8347s;

    public g1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, e6 e6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8342b = c2Var;
        this.d = context;
        this.e = i10;
        this.f8343c = j3;
        this.f8344f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f8345n = e6Var;
        this.f8346r = sVar;
        this.f8347s = eVar;
    }

    @Override
    public final void run() {
        switch (this.f8341a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f8344f;
                e6 e6Var = (e6) this.f8345n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.f8346r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f8347s;
                this.f8342b.dismiss();
                new p1(this.d, this.e, this.f8343c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, e6Var, sVar, eVar).show();
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = this.f8342b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                h80 h80Var = (h80) this.f8345n;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f8346r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f8347s;
                try {
                    c2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f8344f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        h80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    j80.G = joinaspeers.peers;
                    long j3 = this.f8343c;
                    j80.I = j3;
                    j80.H = SystemClock.elapsedRealtime();
                    j80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    j80.v(this.d, j3, joinaspeers.peers, o2Var, this.e, peer, h80Var);
                    return;
                }
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, AccountInstance accountInstance, h80 h80Var, long j3, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.f8342b = c2Var;
        this.f8344f = tLObject;
        this.h = accountInstance;
        this.f8345n = h80Var;
        this.f8343c = j3;
        this.d = context;
        this.f8346r = o2Var;
        this.e = i10;
        this.f8347s = peer;
    }
}
