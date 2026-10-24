package gi;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.q80;
public final class d1 implements Runnable {
    public final int f11144a = 0;
    public final Object f11145b;
    public final long f11146c;
    public final Object d;
    public final int e;
    public final TLObject f11147f;
    public final Object h;
    public final Object f11148n;
    public final Object f11149r;
    public final Object f11150s;

    public d1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, g6 g6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.f11145b = c2Var;
        this.d = context;
        this.e = i10;
        this.f11146c = j10;
        this.f11147f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f11148n = g6Var;
        this.f11149r = tVar;
        this.f11150s = s0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String h;
        org.telegram.ui.Wallet.a2 a2Var;
        switch (this.f11144a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f11147f;
                ((org.telegram.ui.ActionBar.c2) this.f11145b).dismiss();
                new l1(context, this.e, this.f11146c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (g6) this.f11148n, (org.telegram.ui.web.t) this.f11149r, (ai.s0) this.f11150s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f11145b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                o80 o80Var = (o80) this.f11148n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f11149r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f11150s;
                try {
                    c2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f11147f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        o80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    q80.I = joinaspeers.peers;
                    long j10 = this.f11146c;
                    q80.K = j10;
                    q80.J = SystemClock.elapsedRealtime();
                    q80.L = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    q80.w(context2, j10, joinaspeers.peers, o2Var, this.e, peer, o80Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f11145b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f11147f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.f11148n;
                byte[] bArr = (byte[]) this.f11149r;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f11150s;
                e2Var.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e7) {
                    e = e7;
                    i0Var = i0Var2;
                }
                try {
                    a2Var = new org.telegram.ui.Wallet.a2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.e2.f(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, e2Var.f34434f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e10) {
                    e = e10;
                    h = org.telegram.ui.Wallet.e2.h("decode request", e);
                    a2Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j1(e2Var, a2Var, r1Var, h, this.f11146c, this.e, i0Var));
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j1(e2Var, a2Var, r1Var, h, this.f11146c, this.e, i0Var));
                return;
        }
    }

    public d1(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, AccountInstance accountInstance, o80 o80Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.f11145b = c2Var;
        this.f11147f = tLObject;
        this.h = accountInstance;
        this.f11148n = o80Var;
        this.f11146c = j10;
        this.d = context;
        this.f11149r = o2Var;
        this.e = i10;
        this.f11150s = peer;
    }

    public d1(org.telegram.ui.Wallet.e2 e2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, org.telegram.ui.Wallet.r1 r1Var, long j10, int i10) {
        this.f11145b = e2Var;
        this.d = tonconnectpending;
        this.f11147f = tonconnectrequest;
        this.h = i0Var;
        this.f11148n = str;
        this.f11149r = bArr;
        this.f11150s = r1Var;
        this.f11146c = j10;
        this.e = i10;
    }
}
