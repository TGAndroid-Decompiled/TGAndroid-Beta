package ei;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.y80;
public final class g1 implements Runnable {
    public final int f9073a = 0;
    public final Object f9074b;
    public final long f9075c;
    public final Object d;
    public final int f9076e;
    public final TLObject f9077f;
    public final Object h;
    public final Object f9078n;
    public final Object f9079r;
    public final Object f9080s;

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, e6 e6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9074b = b2Var;
        this.d = context;
        this.f9076e = i10;
        this.f9075c = j3;
        this.f9077f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f9078n = e6Var;
        this.f9079r = sVar;
        this.f9080s = eVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        String h;
        org.telegram.ui.Wallet.z1 z1Var;
        switch (this.f9073a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f9077f;
                ((org.telegram.ui.ActionBar.b2) this.f9074b).dismiss();
                new p1(context, this.f9076e, this.f9075c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (e6) this.f9078n, (org.telegram.ui.web.s) this.f9079r, (org.telegram.tgnet.e) this.f9080s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f9074b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                w80 w80Var = (w80) this.f9078n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9079r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f9080s;
                try {
                    b2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                TLObject tLObject = this.f9077f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        w80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    y80.G = joinaspeers.peers;
                    long j3 = this.f9075c;
                    y80.I = j3;
                    y80.H = SystemClock.elapsedRealtime();
                    y80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    y80.x(context2, j3, joinaspeers.peers, n2Var, this.f9076e, peer, w80Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f9074b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f9077f;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.h;
                String str = (String) this.f9078n;
                byte[] bArr = (byte[]) this.f9079r;
                ai.m0 m0Var = (ai.m0) this.f9080s;
                d2Var.getClass();
                try {
                    h0Var = h0Var2;
                } catch (Exception e10) {
                    e = e10;
                    h0Var = h0Var2;
                }
                try {
                    z1Var = new org.telegram.ui.Wallet.z1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.d2.f(h0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, d2Var.f34771f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e11) {
                    e = e11;
                    h = org.telegram.ui.Wallet.d2.h("decode request", e);
                    z1Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(d2Var, z1Var, m0Var, h, this.f9075c, this.f9076e, h0Var));
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(d2Var, z1Var, m0Var, h, this.f9075c, this.f9076e, h0Var));
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, w80 w80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f9074b = b2Var;
        this.f9077f = tLObject;
        this.h = accountInstance;
        this.f9078n = w80Var;
        this.f9075c = j3;
        this.d = context;
        this.f9079r = n2Var;
        this.f9076e = i10;
        this.f9080s = peer;
    }

    public g1(org.telegram.ui.Wallet.d2 d2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, ai.m0 m0Var, long j3, int i10) {
        this.f9074b = d2Var;
        this.d = tonconnectpending;
        this.f9077f = tonconnectrequest;
        this.h = h0Var;
        this.f9078n = str;
        this.f9079r = bArr;
        this.f9080s = m0Var;
        this.f9075c = j3;
        this.f9076e = i10;
    }
}
