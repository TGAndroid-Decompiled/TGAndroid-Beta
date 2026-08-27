package nh;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.k70;

public final class c1 implements Runnable {

    public final int f18611a = 0;

    public final org.telegram.ui.ActionBar.b2 f18612b;

    public final long f18613c;
    public final Context d;

    public final int f18614e;

    public final TLObject f18615f;
    public final Object h;

    public final Object f18616n;

    public final Object f18617r;

    public final Object f18618s;

    public c1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, c6 c6Var, org.telegram.ui.web.u uVar, cg.u0 u0Var) {
        this.f18612b = b2Var;
        this.d = context;
        this.f18614e = i10;
        this.f18613c = j10;
        this.f18615f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f18616n = c6Var;
        this.f18617r = uVar;
        this.f18618s = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f18611a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f18615f;
                File[] fileArr = (File[]) this.h;
                c6 c6Var = (c6) this.f18616n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.f18617r;
                cg.u0 u0Var = (cg.u0) this.f18618s;
                this.f18612b.dismiss();
                new k1(this.d, this.f18614e, this.f18613c, tL_messages_preparedInlineMessage, fileArr[0], null, c6Var, uVar, u0Var).show();
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.f18612b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                i70 i70Var = (i70) this.f18616n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f18617r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f18618s;
                try {
                    b2Var.dismiss();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                TLObject tLObject = this.f18615f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        k70.C = joinaspeers.peers;
                        long j10 = this.f18613c;
                        k70.E = j10;
                        k70.D = SystemClock.elapsedRealtime();
                        k70.F = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        k70.w(this.d, j10, joinaspeers.peers, n2Var, this.f18614e, peer, i70Var);
                    } else {
                        i70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                    }
                }
                break;
        }
    }

    public c1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, i70 i70Var, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f18612b = b2Var;
        this.f18615f = tLObject;
        this.h = accountInstance;
        this.f18616n = i70Var;
        this.f18613c = j10;
        this.d = context;
        this.f18617r = n2Var;
        this.f18614e = i10;
        this.f18618s = peer;
    }
}
