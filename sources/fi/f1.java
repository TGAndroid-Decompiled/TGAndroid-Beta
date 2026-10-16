package fi;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.v80;
public final class f1 implements Runnable {
    public final int f9272a = 0;
    public final Object f9273b;
    public final long f9274c;
    public final Object d;
    public final int e;
    public final TLObject f9275f;
    public final Object h;
    public final Object f9276n;
    public final Object f9277r;
    public final Object f9278s;

    public f1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, c6 c6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9273b = a2Var;
        this.d = context;
        this.e = i10;
        this.f9274c = j10;
        this.f9275f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f9276n = c6Var;
        this.f9277r = sVar;
        this.f9278s = eVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        String h;
        org.telegram.ui.Wallet.a2 a2Var;
        switch (this.f9272a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f9275f;
                ((org.telegram.ui.ActionBar.a2) this.f9273b).dismiss();
                new o1(context, this.e, this.f9274c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (c6) this.f9276n, (org.telegram.ui.web.s) this.f9277r, (org.telegram.tgnet.e) this.f9278s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.f9273b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                t80 t80Var = (t80) this.f9276n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f9277r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f9278s;
                try {
                    a2Var2.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f9275f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        t80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    v80.G = joinaspeers.peers;
                    long j10 = this.f9274c;
                    v80.I = j10;
                    v80.H = SystemClock.elapsedRealtime();
                    v80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    v80.x(context2, j10, joinaspeers.peers, m2Var, this.e, peer, t80Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f9273b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f9275f;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.h;
                String str = (String) this.f9276n;
                byte[] bArr = (byte[]) this.f9277r;
                bi.f0 f0Var = (bi.f0) this.f9278s;
                e2Var.getClass();
                try {
                    h0Var = h0Var2;
                } catch (Exception e7) {
                    e = e7;
                    h0Var = h0Var2;
                }
                try {
                    a2Var = new org.telegram.ui.Wallet.a2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.e2.f(h0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, e2Var.f32820f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e10) {
                    e = e10;
                    h = org.telegram.ui.Wallet.e2.h("decode request", e);
                    a2Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(e2Var, a2Var, f0Var, h, this.f9274c, this.e, h0Var));
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(e2Var, a2Var, f0Var, h, this.f9274c, this.e, h0Var));
                return;
        }
    }

    public f1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, AccountInstance accountInstance, t80 t80Var, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.f9273b = a2Var;
        this.f9275f = tLObject;
        this.h = accountInstance;
        this.f9276n = t80Var;
        this.f9274c = j10;
        this.d = context;
        this.f9277r = m2Var;
        this.e = i10;
        this.f9278s = peer;
    }

    public f1(org.telegram.ui.Wallet.e2 e2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, bi.f0 f0Var, long j10, int i10) {
        this.f9273b = e2Var;
        this.d = tonconnectpending;
        this.f9275f = tonconnectrequest;
        this.h = h0Var;
        this.f9276n = str;
        this.f9277r = bArr;
        this.f9278s = f0Var;
        this.f9274c = j10;
        this.e = i10;
    }
}
