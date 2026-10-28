package hi;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.u80;
public final class k1 implements Runnable {
    public final int f13060a = 0;
    public final Object f13061b;
    public final long f13062c;
    public final Object d;
    public final int e;
    public final TLObject f13063f;
    public final Object h;
    public final Object f13064n;
    public final Object f13065r;
    public final Object f13066s;

    public k1(org.telegram.ui.ActionBar.e2 e2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        this.f13061b = e2Var;
        this.d = context;
        this.e = i10;
        this.f13062c = j10;
        this.f13063f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.f13064n = u6Var;
        this.f13065r = tVar;
        this.f13066s = t0Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String h;
        org.telegram.ui.Wallet.a2 a2Var;
        switch (this.f13060a) {
            case 0:
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f13063f;
                ((org.telegram.ui.ActionBar.e2) this.f13061b).dismiss();
                new s1(context, this.e, this.f13062c, tL_messages_preparedInlineMessage, ((File[]) this.h)[0], null, (u6) this.f13064n, (org.telegram.ui.web.t) this.f13065r, (bi.t0) this.f13066s).show();
                return;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f13061b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                s80 s80Var = (s80) this.f13064n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f13065r;
                TLRPC.Peer peer = (TLRPC.Peer) this.f13066s;
                try {
                    e2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f13063f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() == 1) {
                        s80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        return;
                    }
                    u80.I = joinaspeers.peers;
                    long j10 = this.f13062c;
                    u80.K = j10;
                    u80.J = SystemClock.elapsedRealtime();
                    u80.L = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    u80.v(context2, j10, joinaspeers.peers, r2Var, this.e, peer, s80Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.f13061b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f13063f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.f13064n;
                byte[] bArr = (byte[]) this.f13065r;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f13066s;
                e2Var2.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e10) {
                    e = e10;
                    i0Var = i0Var2;
                }
                try {
                    a2Var = new org.telegram.ui.Wallet.a2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.e2.f(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, e2Var2.f36516f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e11) {
                    e = e11;
                    h = org.telegram.ui.Wallet.e2.h("decode request", e);
                    a2Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k1(e2Var2, a2Var, r1Var, h, this.f13062c, this.e, i0Var));
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k1(e2Var2, a2Var, r1Var, h, this.f13062c, this.e, i0Var));
                return;
        }
    }

    public k1(org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, AccountInstance accountInstance, s80 s80Var, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer) {
        this.f13061b = e2Var;
        this.f13063f = tLObject;
        this.h = accountInstance;
        this.f13064n = s80Var;
        this.f13062c = j10;
        this.d = context;
        this.f13065r = r2Var;
        this.e = i10;
        this.f13066s = peer;
    }

    public k1(org.telegram.ui.Wallet.e2 e2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, org.telegram.ui.Wallet.r1 r1Var, long j10, int i10) {
        this.f13061b = e2Var;
        this.d = tonconnectpending;
        this.f13063f = tonconnectrequest;
        this.h = i0Var;
        this.f13064n = str;
        this.f13065r = bArr;
        this.f13066s = r1Var;
        this.f13062c = j10;
        this.e = i10;
    }
}
