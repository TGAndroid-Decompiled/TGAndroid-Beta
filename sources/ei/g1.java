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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.z80;
public final class g1 implements Runnable {
    public final int f9072a = 0;
    public final Object f9073b;
    public final long f9074c;
    public final Object d;
    public final int f9075e;
    public final TLObject f9076f;
    public final Object h;
    public final Object f9077n;
    public final Object f9078r;
    public final Object f9079s;

    public g1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9073b = a2Var;
        this.d = context;
        this.f9075e = i10;
        this.f9074c = j3;
        this.f9076f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f9077n = d6Var;
        this.f9078r = sVar;
        this.f9079s = eVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String h;
        org.telegram.ui.Wallet.b2 b2Var;
        switch (this.f9072a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f9076f;
                ((org.telegram.ui.ActionBar.a2) this.f9073b).dismiss();
                new p1(context, this.f9075e, this.f9074c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (d6) this.f9077n, (org.telegram.ui.web.s) this.f9078r, (org.telegram.tgnet.e) this.f9079s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f9073b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                x80 x80Var = (x80) this.f9077n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f9078r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f9079s;
                try {
                    a2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                TLObject tLObject = this.f9076f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        x80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    z80.G = joinaspeers.peers;
                    long j3 = this.f9074c;
                    z80.I = j3;
                    z80.H = SystemClock.elapsedRealtime();
                    z80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    z80.x(context2, j3, joinaspeers.peers, m2Var, this.f9075e, peer, x80Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f9073b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f9076f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.f9077n;
                byte[] bArr = (byte[]) this.f9078r;
                ai.m0 m0Var = (ai.m0) this.f9079s;
                f2Var.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e10) {
                    e = e10;
                    i0Var = i0Var2;
                }
                try {
                    b2Var = new org.telegram.ui.Wallet.b2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.f2.f(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, f2Var.f34894f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e11) {
                    e = e11;
                    h = org.telegram.ui.Wallet.f2.h("decode request", e);
                    b2Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(f2Var, b2Var, m0Var, h, this.f9074c, this.f9075e, i0Var));
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(f2Var, b2Var, m0Var, h, this.f9074c, this.f9075e, i0Var));
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, AccountInstance accountInstance, x80 x80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.f9073b = a2Var;
        this.f9076f = tLObject;
        this.h = accountInstance;
        this.f9077n = x80Var;
        this.f9074c = j3;
        this.d = context;
        this.f9078r = m2Var;
        this.f9075e = i10;
        this.f9079s = peer;
    }

    public g1(org.telegram.ui.Wallet.f2 f2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, ai.m0 m0Var, long j3, int i10) {
        this.f9073b = f2Var;
        this.d = tonconnectpending;
        this.f9076f = tonconnectrequest;
        this.h = i0Var;
        this.f9077n = str;
        this.f9078r = bArr;
        this.f9079s = m0Var;
        this.f9074c = j3;
        this.f9075e = i10;
    }
}
