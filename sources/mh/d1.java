package mh;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.g70;
public final class d1 implements Runnable {
    public final int f17793a = 0;
    public final org.telegram.ui.ActionBar.c2 f17794b;
    public final long f17795c;
    public final Context d;
    public final int f17796e;
    public final TLObject f17797f;
    public final Object h;
    public final Object f17798n;
    public final Object f17799r;
    public final Object f17800s;

    public d1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i9, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        this.f17794b = c2Var;
        this.d = context;
        this.f17796e = i9;
        this.f17795c = j10;
        this.f17797f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f17798n = b6Var;
        this.f17799r = tVar;
        this.f17800s = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f17793a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f17797f;
                b6 b6Var = (b6) this.f17798n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.f17799r;
                bg.y0 y0Var = (bg.y0) this.f17800s;
                this.f17794b.dismiss();
                new l1(this.d, this.f17796e, this.f17795c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, b6Var, tVar, y0Var).show();
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = this.f17794b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                e70 e70Var = (e70) this.f17798n;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f17799r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f17800s;
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                TLObject tLObject = this.f17797f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        e70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    g70.C = joinaspeers.peers;
                    long j10 = this.f17795c;
                    g70.E = j10;
                    g70.D = SystemClock.elapsedRealtime();
                    g70.F = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    g70.v(this.d, j10, joinaspeers.peers, o2Var, this.f17796e, peer, e70Var);
                    return;
                }
                return;
        }
    }

    public d1(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, AccountInstance accountInstance, e70 e70Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Peer peer) {
        this.f17794b = c2Var;
        this.f17797f = tLObject;
        this.h = accountInstance;
        this.f17798n = e70Var;
        this.f17795c = j10;
        this.d = context;
        this.f17799r = o2Var;
        this.f17796e = i9;
        this.f17800s = peer;
    }
}
