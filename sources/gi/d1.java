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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r80;
public final class d1 implements Runnable {
    public final int f11127a = 0;
    public final Object f11128b;
    public final long f11129c;
    public final Object d;
    public final int e;
    public final TLObject f11130f;
    public final Object h;
    public final Object f11131n;
    public final Object f11132r;
    public final Object f11133s;

    public d1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.f11128b = b2Var;
        this.d = context;
        this.e = i10;
        this.f11129c = j10;
        this.f11130f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f11131n = d6Var;
        this.f11132r = tVar;
        this.f11133s = s0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.j0 j0Var;
        String h;
        org.telegram.ui.Wallet.b2 b2Var;
        switch (this.f11127a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f11130f;
                ((org.telegram.ui.ActionBar.b2) this.f11128b).dismiss();
                new l1(context, this.e, this.f11129c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (d6) this.f11131n, (org.telegram.ui.web.t) this.f11132r, (ai.s0) this.f11133s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f11128b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                p80 p80Var = (p80) this.f11131n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f11132r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f11133s;
                try {
                    b2Var2.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f11130f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        p80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    r80.G = joinaspeers.peers;
                    long j10 = this.f11129c;
                    r80.I = j10;
                    r80.H = SystemClock.elapsedRealtime();
                    r80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    r80.x(context2, j10, joinaspeers.peers, n2Var, this.e, peer, p80Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f11128b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f11130f;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.h;
                String str = (String) this.f11131n;
                byte[] bArr = (byte[]) this.f11132r;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f11133s;
                f2Var.getClass();
                try {
                    j0Var = j0Var2;
                } catch (Exception e7) {
                    e = e7;
                    j0Var = j0Var2;
                }
                try {
                    b2Var = new org.telegram.ui.Wallet.b2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.f2.f(j0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, f2Var.f34189f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e10) {
                    e = e10;
                    h = org.telegram.ui.Wallet.f2.h("decode request", e);
                    b2Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(f2Var, b2Var, s1Var, h, this.f11129c, this.e, j0Var));
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(f2Var, b2Var, s1Var, h, this.f11129c, this.e, j0Var));
                return;
        }
    }

    public d1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, p80 p80Var, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.f11128b = b2Var;
        this.f11130f = tLObject;
        this.h = accountInstance;
        this.f11131n = p80Var;
        this.f11129c = j10;
        this.d = context;
        this.f11132r = n2Var;
        this.e = i10;
        this.f11133s = peer;
    }

    public d1(org.telegram.ui.Wallet.f2 f2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.j0 j0Var, String str, byte[] bArr, org.telegram.ui.Wallet.s1 s1Var, long j10, int i10) {
        this.f11128b = f2Var;
        this.d = tonconnectpending;
        this.f11130f = tonconnectrequest;
        this.h = j0Var;
        this.f11131n = str;
        this.f11132r = bArr;
        this.f11133s = s1Var;
        this.f11129c = j10;
        this.e = i10;
    }
}
